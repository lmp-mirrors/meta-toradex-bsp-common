SUMMARY = "Toradex mainline Linux kernel"
SECTION = "kernel"
LICENSE = "GPLv2"

LIC_FILES_CHKSUM ?= "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

inherit kernel toradex-kernel-localversion

SRC_URI = " \
    git://git.toradex.com/linux-toradex.git;protocol=https;branch=${KBRANCH};name=machine \
"

S = "${WORKDIR}/git"

DEPENDS += "coreutils-native"

do_install_append() {
    install -d ${D}/boot
    make -C ${S} O=${B} ARCH=$ARCH dtbs || true
    install -m 0644 "${B}/arch/$ARCH/boot/dts/*.dtb" ${D}/boot || true
}

# Additional file deployed by recent mainline kernels
FILES_${KERNEL_PACKAGE_NAME}-base += "${nonarch_base_libdir}/modules/${KERNEL_VERSION}/modules.builtin.modinfo"

KERNEL_CONFIG_NAME ?= "${KERNEL_PACKAGE_NAME}-config-${KERNEL_ARTIFACT_NAME}"
KERNEL_CONFIG_LINK_NAME ?= "${KERNEL_PACKAGE_NAME}-config"

do_deploy_append() {
    cp -a ${B}/.config ${DEPLOYDIR}/${KERNEL_CONFIG_NAME}
    ln -sf ${KERNEL_CONFIG_NAME} ${DEPLOYDIR}/${KERNEL_CONFIG_LINK_NAME}
}

