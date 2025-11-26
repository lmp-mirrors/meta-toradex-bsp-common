SRC_URI:append = " https://docs.toradex.com/116005-sx-pceax-board-files_v1.0.zip;name=sx-pceax-board-files \
                   https://docs.toradex.com/118161-sx-pcebe-board-files_v2.0.zip;name=sx-pcebe-board-files"
SRC_URI[sx-pceax-board-files.sha256sum] = "f94f6382ac1673b84a17e424b5bff681a108eea869544d9e3a3d804f498ae28f"
SRC_URI[sx-pcebe-board-files.sha256sum] = "284250b0d1314ab9c5e9197e4f13f5b4dd6f06c930f4eb5a90ade26359ecbde9"

ATH11K_FIRMWARE_PATH = "${nonarch_base_libdir}/firmware/ath11k/WCN6855/hw2.1"
ATH12K_FIRMWARE_PATH = "${nonarch_base_libdir}/firmware/ath12k/WCN7850/hw2.0"

install_sx_pceax_board_files () {
        install -m 0644 ${WORKDIR}/sx-pceax-board-files/board-2_US_EU_JP.bin ${D}${ATH11K_FIRMWARE_PATH}
        install -m 0644 ${WORKDIR}/sx-pceax-board-files/board-2_UK_CA.bin    ${D}${ATH11K_FIRMWARE_PATH}

        rm -f ${D}${ATH11K_FIRMWARE_PATH}/board-2.bin
        ln -frs ${D}${ATH11K_FIRMWARE_PATH}/board-2_US_EU_JP.bin ${D}${ATH11K_FIRMWARE_PATH}/board-2.bin
}

install_sx_pcebe_board_files () {
        install -m 0644 ${WORKDIR}/sx-pcebe-board-files/board-2_US_EU_JP.bin   ${D}${ATH12K_FIRMWARE_PATH}
        install -m 0644 ${WORKDIR}/sx-pcebe-board-files/board-2_UK_CA_high.bin ${D}${ATH12K_FIRMWARE_PATH}
        install -m 0644 ${WORKDIR}/sx-pcebe-board-files/board-2_UK_CA_low.bin  ${D}${ATH12K_FIRMWARE_PATH}

        rm -f ${D}${ATH12K_FIRMWARE_PATH}/board-2.bin
        ln -frs ${D}${ATH12K_FIRMWARE_PATH}/board-2_US_EU_JP.bin ${D}${ATH12K_FIRMWARE_PATH}/board-2.bin
}

do_install:append:aquila-am69 () {
        install_sx_pceax_board_files
        install_sx_pcebe_board_files
}

do_install:append:aquila-imx95 () {
        install_sx_pcebe_board_files
}

