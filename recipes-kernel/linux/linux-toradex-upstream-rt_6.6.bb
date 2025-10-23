LINUX_VERSION ?= "6.6.114-rt65"
require recipes-kernel/linux/linux-toradex-upstream_6.6.bb

SUMMARY = "Toradex mainline real-time Linux kernel"
# To build the RT kernel we use the RT kernel git repo rather than applying
# the RT patch on top of a vanilla kernel.

LINUX_REPO = "git://git.kernel.org/pub/scm/linux/kernel/git/rt/linux-stable-rt.git"

# set PV manually, that way PREFERRED_VERSION can be set to a constant value
PV = "6.6"
KBRANCH = "v6.6-rt"
SRCREV_meta-toradex-bsp = "78c70bc57ab5a8efb3cebd86624539fd5e9c2a45"
SRCREV_machine = "8730bff5e3fb6244ff05722adeb890c928444cca"
SRCREV_machine:use-head-next = "${AUTOREV}"

LINUX_KERNEL_TYPE = "preempt-rt"
