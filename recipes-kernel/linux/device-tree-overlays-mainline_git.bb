inherit toradex-devicetree

SRCBRANCH = "master"
SRCREV = "034fe1e0943a044681b31cb07e9a7053cf76f6de"
SRCREV:use-head-next = "${AUTOREV}"

COMPATIBLE_MACHINE:tdx = ".*"
COMPATIBLE_MACHINE = "^$"
