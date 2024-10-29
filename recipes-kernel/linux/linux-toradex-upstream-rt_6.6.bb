LINUX_VERSION ?= "6.6.58-rt45"
require recipes-kernel/linux/linux-toradex-upstream_6.6.bb

SUMMARY = "Toradex mainline real-time Linux kernel"
# To build the RT kernel we use the RT kernel git repo rather than applying
# the RT patch on top of a vanilla kernel.

LINUX_REPO = "git://git.kernel.org/pub/scm/linux/kernel/git/rt/linux-stable-rt.git"

# set PV manually, that way PREFERRED_VERSION can be set to a constant value
PV = "6.6"
KBRANCH = "v6.6-rt"
SRCREV_meta-toradex-bsp = "e20ec7290fb752b3fac6164d52c7ecde064c2f01"
SRCREV_machine = "4df61867f86872b173931d99b3d8aa367fd76029"
SRCREV_machine:use-head-next = "${AUTOREV}"

LINUX_KERNEL_TYPE = "preempt-rt"
