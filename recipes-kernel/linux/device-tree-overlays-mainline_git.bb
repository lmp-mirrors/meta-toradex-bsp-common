inherit toradex-devicetree

SRCBRANCH = "master"
SRCREV = "2a3bfb337d1dbee90c431a7e812fd14d574b4eaf"
SRCREV:use-head-next = "${AUTOREV}"

COMPATIBLE_MACHINE:tdx = ".*"
COMPATIBLE_MACHINE = "^$"
