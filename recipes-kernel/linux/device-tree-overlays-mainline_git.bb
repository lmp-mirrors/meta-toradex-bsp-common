inherit toradex-devicetree

SRCBRANCH = "master"
SRCREV = "984e59506f2b51dd227cf38859c3a2376e748174"
SRCREV:use-head-next = "${AUTOREV}"

COMPATIBLE_MACHINE = ".*(mx[678]).*"
