include recipes-core/images/core-image-minimal.bb

IMAGE_FSTYPES = "tar.gz"

# https://wiki.yoctoproject.org/wiki/Wayland
# wayland and weston must be together installed

# wpewebkit dependencies
# https://github.com/WebPlatformForEmbedded/meta-wpe/blob/2adec1aad29fd82e4d5ea42cb03a4846ff2b4493/recipes-core/packagegroups/packagegroup-wpewebkit.bb

IMAGE_INSTALL_append += " \
	fbcp \
	fontconfig \
	fontconfig-utils \
	sthttpd \
	tslib-calibrate \
	tslib-tests \
	ttf-bitstream-vera \
	gstreamer1.0-plugins-base-alsa \
	wayland \
	weston \
	weston-init \
	weston-examples \
	wpewebkit \
	wpebackend \
	wpewebkit-web-inspector-plugin \
	wpelauncher \
	"
#	wpebackend-rdk

VIRTUAL-RUNTIME_init_manager="busybox"
