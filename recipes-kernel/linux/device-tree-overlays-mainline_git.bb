inherit toradex-devicetree

SRCBRANCH = "master"
SRCREV = "751c06ae30e386a19362dcbdc272be4f0ffd0cd3"
SRCREV:use-head-next = "${AUTOREV}"

COMPATIBLE_MACHINE:tdx = ".*"
COMPATIBLE_MACHINE = "^$"
