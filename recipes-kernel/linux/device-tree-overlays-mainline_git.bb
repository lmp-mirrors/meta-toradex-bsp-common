inherit toradex-devicetree

SRCBRANCH = "master"
SRCREV = "707040d21aa6bba808f95ef874d764290ff1f2d9"
SRCREV:use-head-next = "${AUTOREV}"

COMPATIBLE_MACHINE:tdx = ".*"
COMPATIBLE_MACHINE = "^$"
