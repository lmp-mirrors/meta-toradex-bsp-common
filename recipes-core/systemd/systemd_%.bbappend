# This allows for udevd automounting with mounts accessible to all.
do_configure:prepend:tdx-distro () {
    sed -i '/PrivateMounts=yes/d' ${S}/units/systemd-udevd.service.in
}

# This disables the 'mac' policy for pni-names We do not want MAC address based
# naming, for example every Verdin AM62 would have a naming that includes the
# MAC address for the Ethernet interface: enx0014...
# However, we want persistent names across all modules.
do_install:append:tdx-distro() {
    sed -i -e 's/ mac//g' ${D}${nonarch_libdir}/systemd/network/99-default.link
}
