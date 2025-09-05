inherit toradex-devicetree

SRCBRANCH = "master"
SRCREV = "c879a43def8b8d164edc0bc0b1d590de4fc73660"
SRCREV:use-head-next = "${AUTOREV}"

COMPATIBLE_MACHINE:tdx = ".*"
COMPATIBLE_MACHINE = "^$"
