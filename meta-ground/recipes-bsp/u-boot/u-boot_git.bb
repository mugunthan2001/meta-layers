LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=2ca5f2c35c8cc335f0a19756634782f1"

require recipes-bsp/u-boot/u-boot-common.inc
require recipes-bsp/u-boot/u-boot.inc

SRC_URI = "git://github.com/beagleboard/u-boot.git;protocol=https;branch=master"
SRCREV = "v2026.01" 

PV = "2026.01+git${SRCPV}"

S = "${WORKDIR}/git"

DEPENDS += "gnutls-native"
