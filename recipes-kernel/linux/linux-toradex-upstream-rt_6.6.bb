LINUX_VERSION ?= "6.6.87-rt54"
require recipes-kernel/linux/linux-toradex-upstream_6.6.bb

SUMMARY = "Toradex mainline real-time Linux kernel"
# To build the RT kernel we use the RT kernel git repo rather than applying
# the RT patch on top of a vanilla kernel.

LINUX_REPO = "git://git.kernel.org/pub/scm/linux/kernel/git/rt/linux-stable-rt.git"

# set PV manually, that way PREFERRED_VERSION can be set to a constant value
PV = "6.6"
KBRANCH = "v6.6-rt"
SRCREV_meta-toradex-bsp = "3b13934b8b7759d75ee570eedf7b367ed9a68d84"
SRCREV_machine = "a4080334e237c0ecb0ac4b3ecdc5ec2d8d6dbe31"
SRCREV_machine:use-head-next = "${AUTOREV}"

LINUX_KERNEL_TYPE = "preempt-rt"
