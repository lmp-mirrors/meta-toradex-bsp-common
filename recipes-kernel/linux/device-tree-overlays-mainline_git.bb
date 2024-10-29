inherit toradex-devicetree

SRCBRANCH = "master"
SRCREV = "76b7c98535458d12897f172dffc1cbc3364f95c8"
SRCREV:use-head-next = "${AUTOREV}"

COMPATIBLE_MACHINE:tdx = ".*"
COMPATIBLE_MACHINE = "^$"
