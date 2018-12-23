package com.arkas.springboard.mapper;


import com.arkas.springboard.domain.model.payment.WalletDetails;
import com.arkas.springboard.dto.model.payment.WalletDto;

/**
 * @author Su Su
 */
public class WalletMapper {

    public static WalletDto mapWallet(WalletDetails walletDetails) {
        return new WalletDto()
                .setBalance(walletDetails.getBalance())
                .setUserName(walletDetails.getApplicationUser().getUsername())
                .setWalletLevel(walletDetails.getWalletLevel());
    }
}