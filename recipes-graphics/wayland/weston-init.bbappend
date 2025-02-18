FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://weston.sh"

PACKAGECONFIG:append:upstream:tdx-distro = " no-idle-timeout"
PACKAGECONFIG:append:k3 = " no-idle-timeout"
PACKAGECONFIG:append:upstream:colibri-imx6ull = " use-pixman"
PACKAGECONFIG:append:upstream:colibri-imx6ull-emmc = " use-pixman"
PACKAGECONFIG:append:upstream:colibri-imx7 = " use-pixman"
PACKAGECONFIG:append:upstream:colibri-imx7-emmc = " use-pixman"

do_install:append:tdx-distro() {
    install -Dm0755 ${WORKDIR}/weston.sh ${D}${sysconfdir}/profile.d/weston.sh

    if ${@bb.utils.contains('DISTRO_FEATURES','systemd','true','false',d)}; then
        # We need run weston systemd service with root user, or else it could not
        # access input devices and GPU acceleration hardwares
        # Reference: https://source.codeaurora.org/external/imx/meta-imx/commit/?h=hardknott-5.10.72-2.2.0&id=9e08be758765d4a991e0a440f8abef225be094e3
        sed -i "s/User=weston/User=root/" ${D}${systemd_system_unitdir}/weston.service
        sed -i "s/Group=weston/Group=root/" ${D}${systemd_system_unitdir}/weston.service
        sed -i "s/SocketUser=weston/SocketUser=root/" ${D}${systemd_system_unitdir}/weston.socket
        sed -i "s/SocketGroup=wayland/SocketGroup=root/" ${D}${systemd_system_unitdir}/weston.socket

        # Wait for device to be ready
        sed -i "/^EnvironmentFile=.etc.default.weston/a ExecStartPre=-\/usr\/bin\/sh -c \"ls \/dev\/dri\/by-path\/*gpu* &> \/dev\/null && \/usr\/bin\/udevadm wait --timeout=30 \/dev\/dri\/card1\"" ${D}${systemd_system_unitdir}/weston.service
        sed -i "/^EnvironmentFile=.etc.default.weston/a ExecStartPre=-\/usr\/bin\/udevadm wait --timeout=30 \/dev\/dri\/card0" ${D}${systemd_system_unitdir}/weston.service
    fi
}
