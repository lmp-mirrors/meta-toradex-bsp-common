FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-4.19:"

LINUX_VERSION ?= "4.19.59-rt24"
PV = "${LINUX_VERSION}+git${SRCPV}"

SRCREV_machine = "3758b8bd81966b63dc93093a323e9bdd734545fd"

KBRANCH = "toradex_4.19.y-rt"

require recipes-kernel/linux/linux-toradex-mainline.inc

SRC_URI += " \
    file://defconfig \
"

