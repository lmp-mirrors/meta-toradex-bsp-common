LINUX_VERSION ?= "6.6.77-rt50"
require recipes-kernel/linux/linux-toradex-upstream_6.6.bb

SUMMARY = "Toradex mainline real-time Linux kernel"
# To build the RT kernel we use the RT kernel git repo rather than applying
# the RT patch on top of a vanilla kernel.

LINUX_REPO = "git://git.kernel.org/pub/scm/linux/kernel/git/rt/linux-stable-rt.git"

# set PV manually, that way PREFERRED_VERSION can be set to a constant value
PV = "6.6"
KBRANCH = "v6.6-rt"
SRCREV_machine = "90e0048f6ba56b29e19506a9a213790cc953fdf6"
SRCREV_machine:use-head-next = "${AUTOREV}"

LINUX_KERNEL_TYPE = "preempt-rt"
