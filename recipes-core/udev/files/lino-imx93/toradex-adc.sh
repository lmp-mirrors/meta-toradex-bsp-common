#!/usr/bin/env sh
#
# Called from udev. Compatible to lino-imx93.
#
# Create/remove symlinks to/from the files with raw adc data.

# Map the ADC lines:
# lino-adc{0,1,2,3} -> iMX93 SoC ADC_IN{0,1,2,3}

if [ "$ACTION" = "add" ]; then
    ln -s "/sys$DEVPATH/in_voltage0_raw" /dev/lino-adc0
    ln -s "/sys$DEVPATH/in_voltage1_raw" /dev/lino-adc1
    ln -s "/sys$DEVPATH/in_voltage2_raw" /dev/lino-adc2
    ln -s "/sys$DEVPATH/in_voltage3_raw" /dev/lino-adc3
elif [ "$ACTION" = "remove" ]; then
    rm -f /dev/lino-adc0
    rm -f /dev/lino-adc1
    rm -f /dev/lino-adc2
    rm -f /dev/lino-adc3
fi
