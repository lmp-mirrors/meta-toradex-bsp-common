require linux-toradex-upstream.inc

FILESEXTRAPATHS:prepend := "${THISDIR}/linux-toradex-upstream-6.12:"

LINUX_REPO = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux.git"

TDX_PATCHES = " \
    file://0001-thermal-imx-Update-critical-temp-threshold.patch \
    file://0002-Revert-drm-panel-simple-drop-use-of-data-mapping-pro.patch \
    file://0004-media-i2c-ov5640-Implement-get_mbus_config.patch \
    file://0001-usb-gadget-f_ncm-Apply-workaround-for-packet-cloggin.patch \
    file://0001-i2c-imx-do-not-poll-for-bus-busy-in-single-master-mo.patch \
    file://0002-i2c-imx-separate-atomic-dma-and-non-dma-use-case.patch \
    file://0003-i2c-imx-prevent-rescheduling-in-non-dma-mode.patch \
    file://0004-arm64-dts-imx8mm-verdin-add-single-master-property-t.patch \
    file://0005-arm64-dts-imx8mp-verdin-add-single-master-property-t.patch \
    file://0001-i2c-imx-fix-missing-stop-condition-in-single-master-.patch \
    file://0001-ARM-dts-imx6qdl-apalis-Fix-poweroff-on-Apalis-iMX.patch \
    file://0001-arm64-dts-imx8mp-Fix-VPU-PGC-power-domain-parents.patch \
    file://0001-arm64-dts-freescale-imx8mp-verdin-dahlia-add-Microph.patch \
    file://0001-arm64-dts-ti-k3-am62-verdin-dahlia-add-Microphone-Ja.patch \
    file://0002-arm64-dts-freescale-imx8mm-verdin-dahlia-add-Microph.patch \
"

PV = "6.12"
LINUX_VERSION ?= "6.12.16"
LINUX_KERNEL_TYPE:preempt-rt = "preempt-rt"
KBRANCH = "linux-6.12.y"
KERNEL_VERSION_SANITY_SKIP = "1"
SRCREV_machine = "19b4657de424f48a588eb379fe3214d317f46cd7"
SRCREV_machine:use-head-next = "${AUTOREV}"
