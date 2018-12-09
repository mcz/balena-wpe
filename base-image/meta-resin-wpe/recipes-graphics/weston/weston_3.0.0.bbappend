EXTRA_OECONF_remove = "--disable-rdp-compositor"
EXTRA_OECONF_append = "--disable-simple-dmabuf-drm-client --enable-rdp-compositor"

PACKAGECONFIG_append = "kms wayland egl fbdev"