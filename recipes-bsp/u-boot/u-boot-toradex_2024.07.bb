require u-boot-toradex-common.inc

SRCREV = "3f772959501c99fbe5aa0b22a36efe3478d1ae1c"

TDX_PATCHES = "\
    file://0001-board-toradex-verdin-imx8mm-add-4-GB-lpddr4-memory-s.patch \
    file://0002-board-toradex-verdin-imx8mm-increase-maximum-address.patch \
    file://0003-toradex-tdx-cfg-block-add-aquila-am69-sku-0088-pid4.patch \
    file://0004-toradex-tdx-cfg-block-add-verdin-imx95-sku-0089-pid4.patch \
    file://0005-toradex-tdx-cfg-block-add-verdin-i.mx8m-mini-0090-pi.patch \
    file://0001-toradex-tdx-cfg-block-rework-modules-pid4-handling.patch \
    file://0006-ARM-imx-verdin-imx8mm-Set-CAN-oscillator-frequency-b.patch \
    file://0001-configs-verdin-imx8m-mp-set-CONFIG_SPL_LOAD_FIT_ADDR.patch \
    file://0001-arm-imx-imx8m-soc-Fix-VPU-fdt-disable-fixup.patch \
    file://0001-verdin-imx8m-m-p-defconfig-update-fastboot-buffer-si.patch \
    file://0001-verdin-imx8m-mp-Increase-SD-regulator-startup-delay.patch \
    file://0001-scripts-dtc-pylibfdt-libfdt.i_shipped-Use-SWIG_Appen.patch \
    file://0001-board-toradex-add-SMARC-iMX8M-Plus.patch \
    file://0001-board-toradex-apalis-colibri-imx6-Detect-new-v1.2-So.patch \
    file://0002-toradex-apalis-colibri-imx6-Select-correct-DTB-for-S.patch \
    file://0001-toradex-tdx-cfg-block-add-pid-0098-0099-201-to-215-support.patch \
    file://0001-gpio-pca953x-support-pcal6408-and-pcal6416.patch \
    file://0001-Add-fdt_kaslrseed-function-to-add-kaslr-seed-to-chos.patch \
    file://0002-fdt-automatically-add-chosen-kaslr-seed-if-DM_RNG-is.patch \
    file://0003-use-fdt_kaslrseed-function-to-de-duplicate-code.patch \
    file://0004-configs-verdin-imx8mm-enable-RNG-support-for-KASLR.patch \
    file://0005-configs-verdin-imx8mp-enable-RNG-support-for-KASLR.patch \
    file://0006-configs-toradex-smarc-imx8mp-enable-RNG-support-for-.patch \
    file://0001-imx8m-set-sane-default-value-for-SPL_LOAD_FIT_ADDRES.patch \
    file://0001-bootstd-Correct-handling-of-script-from-network.patch \
    file://0001-toradex-tdx-cfg-block-add-verdin-i.mx8m-mini-0216.patch \
    file://0001-configs-apalis-imx6-enable-USB-Gadget-OS-Descriptors.patch \
    file://0002-configs-colibri-enable-USB-Gadget-OS-Descriptors-for.patch \
    file://0003-configs-verdin-imx8m-mp-enable-USB-Gadget-OS-Descrip.patch \
    file://0004-configs-toradex-smarc-imx8mp-enable-USB-Gadget-OS-De.patch \
"
