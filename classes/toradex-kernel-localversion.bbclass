# Toradex Kernel LOCALVERSION extension
#
# This allow to easy reuse of code between different kernel recipes
#
# The following options are supported:
#
#  SCMVERSION        Puts the Git hash in kernel local version
#  LOCALVERSION      Value used in LOCALVERSION
#
# Copyright 2014, 2015 (C) O.S. Systems Software LTDA.
# Copyright 2019 (C) Toradex AG

inherit toradex-kernel-config

TDX_VERSION ??= "0"
SCMVERSION ??= "y"
LOCALVERSION ?= "-${TDX_VERSION}"

kernel_do_configure_append() {
	kernel_configure_variable LOCALVERSION "\"${LOCALVERSION}\""

	if [ "${SCMVERSION}" = "y" ]; then
		# Add GIT revision to the local version
		# SRCREV_machine is used in kernel recipes using kernel-yocto.bbclass,
		# e.g. our linux-toradex-mainline recipe
		if [ -n "${SRCREV_machine}" ]; then
			if [ "${SRCREV_machine}" = "AUTOINC" ]; then
				branch=`git --git-dir=${S}/.git  symbolic-ref --short -q HEAD`
				head=`git --git-dir=${S}/.git rev-parse --verify --short origin/${branch} 2> /dev/null`
			else
				head=`git --git-dir=${S}/.git rev-parse --verify --short ${SRCREV_machine} 2> /dev/null`
			fi
		# SRCREV is used by linux-toradex recipes
		elif [ -n "${SRCREV}" -a "${SRCREV}" = "AUTOINC" ]; then
			branch=`git --git-dir=${S}/.git  symbolic-ref --short -q HEAD`
			head=`git --git-dir=${S}/.git rev-parse --verify --short origin/${branch} 2> /dev/null`
		elif [ -n "${SRCREV}" -a "${SRCREV}" != "INVALID" ]; then
			head=`git --git-dir=${S}/.git rev-parse --verify --short ${SRCREV} 2> /dev/null`
		else
			head=`git --git-dir=${S}/.git rev-parse --verify --short HEAD 2> /dev/null`
		fi
		printf "+git.%s" $head > ${S}/.scmversion
		kernel_configure_variable LOCALVERSION_AUTO y
	else
		kernel_configure_variable LOCALVERSION_AUTO n
	fi
}
