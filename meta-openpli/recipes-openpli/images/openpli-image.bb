require conf/license/openpli-gplv2.inc

inherit task image

IMAGE_INSTALL = " \
	${ROOTFS_PKGMANAGE} \
	3rd-party-feed-configs \
	avahi-daemon \
	cifs \
	distro-feed-configs \
	dropbear \
	e2fsprogs-e2fsck \
	e2fsprogs-mke2fs \
	early-configure \
	fakelocale \
	nfs-utils-client \
	openpli-bootlogo \
	opkg \
	sambaserver \
	sdparm \
	task-base \
	task-core-boot \
	tuxbox-common \
	tuxbox-links \
	tzdata \
	util-linux-sfdisk \
	volatile-media \
	vsftpd \
	"

OPTIONAL_PACKAGES ?= ""
OPTIONAL_PACKAGES += " \
	ctorrent \
	cups \
	djmount \
	dvbsnoop \
	dvdfs \
	gdb \
	hddtemp \
	hdparm \
	inadyn-mt \
	joe \
	mc \
	minidlna \
	mpd \
	mtd-utils \
	nano \
	ntfs-3g \
	ntp \
	openresolv \
	openssh \
	openvpn \
	parted \
	procps \
	rsync \
	sabnzbd \
	samba \
	smartmontools \
	strace \
	tcpdump \
	vim \
	wakelan \
	zeroconf \
	iperf \
	"

export IMAGE_BASENAME = "openpli"
IMAGE_LINGUAS = ""
