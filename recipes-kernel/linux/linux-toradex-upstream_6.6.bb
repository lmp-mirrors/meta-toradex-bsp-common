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
    file://0003-dt-bindings-power-reset-gpio-poweroff-Add-priority-p.patch \
    file://0004-media-i2c-ov5640-Implement-get_mbus_config.patch \
    file://0004-power-reset-gpio-poweroff-make-sys-handler-priority-.patch \
    file://0001-drm-bridge-lt8912b-Add-suspend-resume-support.patch \
    file://0002-drm-bridge-lt8912b-Add-power-supplies.patch \
    file://0001-arm64-dts-freescale-imx8mp-verdin-replace-sleep-m.patch \
    file://0002-arm64-dts-freescale-imx8mp-verdin-dahlia-support-.patch \
    file://0003-arm64-dts-freescale-imx8mm-verdin-replace-sleep-m.patch \
    file://0004-arm64-dts-freescale-imx8mm-verdin-dahlia-support-.patch \
    file://0001-arm64-dts-ti-k3-am62-verdin-replace-sleep-moci-ho.patch \
    file://0002-arm64-dts-ti-k3-am62-verdin-dahlia-support-sleep-.patch \
    file://0001-drm-etnaviv-don-t-disable-TS-on-MMUv2-core-when-movi.patch \
    file://0002-arm64-dts-imx8mm-Add-optional-overdrive-DTSI.patch \
    file://0003-arm64-dts-freescale-imx8mm-verdin-Fix-GPU-speed.patch \
    file://0001-pmdomain-imx8m-blk-ctrl-fix-suspend-resume-order.patch \
    file://0001-arm64-dts-freescale-imx8mm-verdin-add-label-to-som-a.patch \
    file://0002-arm64-dts-freescale-imx8mm-verdin-Add-Ivy-carrier-bo.patch \
    file://0001-ARM-dts-imx6qdl-apalis-Update-audio-card-name.patch \
    file://0002-ARM-dts-imx6qdl-colibri-Update-audio-card-name.patch \
    file://0003-ARM-dts-imx7-colibri-Update-audio-card-name.patch \
    file://0001-i2c-imx-do-not-poll-for-bus-busy-in-single-master-mo.patch \
    file://0002-i2c-imx-separate-atomic-dma-and-non-dma-use-case.patch \
    file://0003-i2c-imx-prevent-rescheduling-in-non-dma-mode.patch \
    file://0004-arm64-dts-imx8mm-verdin-add-single-master-property-t.patch \
    file://0005-arm64-dts-imx8mp-verdin-add-single-master-property-t.patch \
    file://0001-PCI-imx6-Add-suspend-resume-support-for-i.MX6QDL.patch \
    file://0001-i2c-imx-fix-missing-stop-condition-in-single-master-.patch \
    file://0001-ARM-dts-imx6qdl-apalis-Fix-poweroff-on-Apalis-iMX.patch \
    file://0001-tpm_tis_spi-add-missing-attpm20p-SPI-device-ID-entry.patch \
    file://0001-arm64-dts-imx8mm-verdin-add-TPM-device.patch \
    file://0001-arm64-dts-imx8mp-Fix-VPU-PGC-power-domain-parents.patch \
"
PV = "6.6"
LINUX_VERSION ?= "6.6.77"
KBRANCH = "linux-6.6.y"
KERNEL_VERSION_SANITY_SKIP = "1"
SRCREV_machine = "c719455843a8bc3e969ba58ec92335ed7510e9fc"
SRCREV_machine:use-head-next = "${AUTOREV}"
