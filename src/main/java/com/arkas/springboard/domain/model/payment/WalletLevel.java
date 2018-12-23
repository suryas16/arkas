package com.arkas.springboard.domain.model.payment;

import java.util.Optional;

/**
 * @author Su Su
 */
public enum WalletLevel {

    WALLET_BITCOIN, WALLET_REGULAR;

    public static Optional<WalletLevel> getByName(String name) {
        for (WalletLevel walletLevel : values()) {
            if (walletLevel.name().equals(name)) {
                return Optional.of(walletLevel);
            }
        }
        return Optional.empty();
    }
}