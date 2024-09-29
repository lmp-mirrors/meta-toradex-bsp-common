require linux-toradex-upstream.inc

FILESEXTRAPATHS:prepend := "${THISDIR}/linux-toradex-upstream-6.11:"

LINUX_REPO = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux.git"

TDX_PATCHES = " \
    file://0001-thermal-imx-Update-critical-temp-threshold.patch \
    file://0002-Revert-drm-panel-simple-drop-use-of-data-mapping-pro.patch \
    file://0004-media-i2c-ov5640-Implement-get_mbus_config.patch \
    file://0001-usb-gadget-f_ncm-Apply-workaround-for-packet-cloggin.patch \
"

PV = "6.11"
LINUX_VERSION ?= "6.11.1"
KBRANCH = "linux-6.11.y"
KERNEL_VERSION_SANITY_SKIP = "1"
SRCREV_machine = "7424ab40896c2af234a185e13529fbc048835d24"
SRCREV_machine:use-head-next = "${AUTOREV}"
