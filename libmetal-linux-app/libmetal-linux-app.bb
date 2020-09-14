#
# This file is the libmetal-linux-app recipe.
#

SUMMARY = "Simple libmetal-linux-app application"
SECTION = "PETALINUX/apps"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://libMetal_A53_C.elf \
	file://libMetal_R5.elf \
	"

S = "${WORKDIR}"
INSANE_SKIP_${PN} = "arch"

do_install() {
	     install -d ${D}/lib/firmware
	     install -m 0644 ${S}/libMetal_R5.elf ${D}/lib/firmware/libMetal_R5.elf

	     install -d ${D}/usr/bin
	     install -m 0755 ${S}/libMetal_A53_C.elf ${D}/usr/bin/libMetal_A53_C.elf
}

FILES_${PN} = "/lib/firmware/libMetal_R5.elf /usr/bin/libMetal_A53_C.elf "
