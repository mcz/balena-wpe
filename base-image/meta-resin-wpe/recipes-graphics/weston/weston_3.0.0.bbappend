EXTRA_OECONF_remove = "--disable-rdp-compositor"
EXTRA_OECONF_append = "--disable-simple-dmabuf-drm-client"

PACKAGECONFIG[rdp] = "--enable-rdp-compositor,--disable-rdp-compositor,libfreerdp"

PACKAGECONFIG_append = "kms wayland fbdev rdp"