# Yoe factory image

require recipes-core/images/core-image-minimal.bb
include machines/${MACHINE}.inc

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

export IMAGE_BASENAME = "yoe-installer-image"

BAD_RECOMMENDATIONS += "eudev-hwdb udev-hwdb libmodule-build-perl"

IMAGE_FSTYPES = "wic.bmap wic.xz"

IMAGE_INSTALL_remove = " kernel-devicetree kernel-image-${KERNEL_IMAGETYPE}"

KERNEL_IMAGE = "${KERNEL_IMAGETYPE}-initramfs-${MACHINE}.bin"
