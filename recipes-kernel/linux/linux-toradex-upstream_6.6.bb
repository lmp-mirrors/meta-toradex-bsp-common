require linux-toradex-upstream.inc

FILESEXTRAPATHS:prepend := "${THISDIR}/linux-toradex-upstream-6.6:"

LINUX_REPO = "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux.git"

TDX_PATCHES = " \
    file://0001-ARM-dts-imx6qdl-apalis-Add-usdhc-aliases.patch \
    file://0001-dt-bindings-arm-fsl-Add-toradex-apalis_imx6q-eval-v1.patch \
    file://0001-dt-bindings-arm-fsl-add-verdin-imx8mm-mallow-board.patch \
    file://0001-power-reset-gpio-poweroff-use-a-struct-to-store-the-.patch \
    file://0001-thermal-imx-Update-critical-temp-threshold.patch \
    file://0001-usb-gadget-f_ncm-Apply-workaround-for-packet-cloggin.patch \
    file://0002-arm64-dts-freescale-verdin-imx8mm-add-support-to-mal.patch \
    file://0002-ARM-dts-imx6qdl-colibri-Add-usdhc-aliases.patch \
    file://0002-ARM-dts-imx-Add-support-for-Apalis-Evaluation-Board-.patch \
    file://0002-power-reset-gpio-poweroff-use-sys-off-handler-API.patch \
    file://0002-Revert-drm-panel-simple-drop-use-of-data-mapping-pro.patch \
    file://0003-ARM-dts-imx7d-colibri-emmc-Add-usdhc-aliases.patch \
    file://0003-drivers-chipidea-disable-runtime-pm-for-imx6ul.patch \
    file://0003-dt-bindings-power-reset-gpio-poweroff-Add-priority-p.patch \
    file://0004-media-i2c-ov5640-Implement-get_mbus_config.patch \
    file://0004-power-reset-gpio-poweroff-make-sys-handler-priority-.patch \
"
PV = "6.6"
LINUX_VERSION ?= "6.6.20"
KBRANCH = "linux-6.6.y"
KERNEL_VERSION_SANITY_SKIP = "1"
SRCREV_machine = "9b4a8eac17f0d840729384618b4b1e876233026c"
SRCREV_machine:use-head-next = "${AUTOREV}"
