inherit toradex-devicetree

SRCBRANCH = "master"
SRCREV = "0ec31322ea847f549b9189da3d75784f7cfc0238"
SRCREV:use-head-next = "${AUTOREV}"

COMPATIBLE_MACHINE:tdx = ".*"
COMPATIBLE_MACHINE = "^$"
