#!/usr/bin/env sh
#
# Called from udev. Compatible to toradex-osm-imx93.
#
# Create/remove symlinks to/from the files with raw adc data.

# Map the ADC lines:
# osm-adc{0,1} -> iMX93 SoC ADC_IN{0,1}

if [ "$ACTION" = "add" ]; then
    ln -s "/sys$DEVPATH/in_voltage0_raw" /dev/osm-adc0
    ln -s "/sys$DEVPATH/in_voltage1_raw" /dev/osm-adc1
elif [ "$ACTION" = "remove" ]; then
    rm -f /dev/osm-adc0
    rm -f /dev/osm-adc1
fi
