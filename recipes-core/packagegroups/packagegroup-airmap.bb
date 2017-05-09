SUMMARY = "AirMap tools"
LICENSE = "MIT"

inherit packagegroup

PR = "r0"

RDEPENDS_${PN} = "\
		python-cryptography \
		AirMapSDK-Embedded \
		python-paho-mqtt \
		python-requests \
		"
