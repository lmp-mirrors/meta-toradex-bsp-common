FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://ucm2/"

do_install:append() {
    cp -r "${UNPACKDIR}/ucm2" "${D}${datadir}/alsa"
}
