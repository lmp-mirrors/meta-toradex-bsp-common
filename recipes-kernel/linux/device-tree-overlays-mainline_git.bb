inherit toradex-devicetree

SRCBRANCH = "master"
SRCREV = "1c9cef0936e03d68cc7808b1b8c88e9138d8f951"
SRCREV:use-head-next = "${AUTOREV}"

COMPATIBLE_MACHINE:tdx = ".*"
COMPATIBLE_MACHINE = "^$"
