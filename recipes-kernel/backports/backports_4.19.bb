SUMMARY = "Backported kernel drivers"
HOMEPAGE = "https://backports.wiki.kernel.org"
SECTION = "kernel/modules"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"
INC_PR = "r1"

DEPENDS_append = " coreutils-native"

SRCREV = "04b0b4365fea6da59cdf1c8e9b6377c532ccd965"
SRCREV_use-head-next = "${AUTOREV}"
SRC_URI = " \
    git://git.toradex.com/backports-toradex.git;protocol=git;branch=toradex-${PV} \
    file://makefile.patch \
    file://config \
    "

S = "${WORKDIR}/git"

inherit module cml1

MAKE_TARGETS = "modules"
MODULES_INSTALL_TARGET = "modules_install"
PACKAGES_DYNAMIC += "^${BPN}-kernel-module-.*"

KERNEL_MODULE_PACKAGE_PREFIX = "${BPN}-"

EXTRA_OEMAKE = " KLIB=${STAGING_KERNEL_DIR} KLIB_BUILD=${STAGING_KERNEL_BUILDDIR} "

KCONFIG_CONFIG_COMMAND = "CC=${BUILD_CC} LD=${BUILD_LD} AR=${BUILD_AR} menuconfig"

do_configure() {

    unset CFLAGS CPPFLAGS CXXFLAGS LDFLAGS
    make CC="${BUILD_CC}" LD="${BUILD_LD}" AR="${BUILD_AR}" \
         -C ${S}/kconf  O=${S}/kconf conf

    cp ${WORKDIR}/config ${S}/.config
    unset CFLAGS CPPFLAGS CXXFLAGS LDFLAGS
    oe_runmake oldconfig
}

