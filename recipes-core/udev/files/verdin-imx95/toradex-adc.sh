#!/usr/bin/env sh
#
# Called from udev. Compatible to verdin-imx95.
#
# Create/remove symlinks to/from the files with raw adc data.

# Map the ADC lines:
# verdin-adc{1..4} -> ADC{0..3}

if [ "$ACTION" = "add" ]; then
    ln -s "/sys$DEVPATH/in_voltage0_raw" /dev/verdin-adc1
    ln -s "/sys$DEVPATH/in_voltage1_raw" /dev/verdin-adc2
    ln -s "/sys$DEVPATH/in_voltage2_raw" /dev/verdin-adc3
    ln -s "/sys$DEVPATH/in_voltage3_raw" /dev/verdin-adc4
elif [ "$ACTION" = "remove" ]; then
    rm -f /dev/verdin-adc1
    rm -f /dev/verdin-adc2
    rm -f /dev/verdin-adc3
    rm -f /dev/verdin-adc4
fi

