# Include standard Yocto U-Boot build logic
require recipes-bsp/u-boot/u-boot-common.inc
require recipes-bsp/u-boot/u-boot.inc

SRC_URI = "https://github.com/beagleboard/u-boot.git;protocol=https;branch=master"
SRCREV = "v2026.01"

PV = "2026.01"
