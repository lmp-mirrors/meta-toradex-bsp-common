inherit toradex-devicetree

SRCBRANCH = "master"
SRCREV = "8a886ed5828c0ca33a8fe8275b16d2f59f03ec89"
SRCREV:use-head-next = "${AUTOREV}"

COMPATIBLE_MACHINE:tdx = ".*"
COMPATIBLE_MACHINE = "^$"
