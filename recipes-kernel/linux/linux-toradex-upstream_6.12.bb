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
    file://0001-kbuild-switch-from-lz4c-to-lz4-for-compression.patch \
"

PV = "6.12"
LINUX_VERSION ?= "6.12.4"
LINUX_KERNEL_TYPE:preempt-rt = "preempt-rt"
KBRANCH = "linux-6.12.y"
KERNEL_VERSION_SANITY_SKIP = "1"
SRCREV_machine = "61baee2dc5341c936e7fa7b1ca33c5607868de69"
SRCREV_machine:use-head-next = "${AUTOREV}"