inherit toradex-devicetree

SRCBRANCH = "master"
SRCREV = "206dfc24efdc5444d1c2056103fe680f66d5786c"
SRCREV:use-head-next = "${AUTOREV}"

COMPATIBLE_MACHINE = ".*(mx[678]).*"
