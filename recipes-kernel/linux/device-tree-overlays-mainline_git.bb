inherit toradex-devicetree

SRCBRANCH = "master"
SRCREV = "62ebb60137984dab21e7c4032af1b2b90d46a8be"
SRCREV:use-head-next = "${AUTOREV}"

COMPATIBLE_MACHINE:tdx = ".*"
COMPATIBLE_MACHINE = "^$"
