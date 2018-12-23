package com.arkas.springboard.service.payment;

import com.arkas.springboard.domain.model.payment.WalletDetails;
import com.arkas.springboard.dto.model.payment.WalletDto;
import com.arkas.springboard.service.exception.PaymentException;

/**
 * Created by Su Su.
 */
public interface PaymentService {

    /**
     * Get a user's wallet details.
     *
     * @param userName
     * @return
     * @throws PaymentException
     */
    WalletDetails getWalletDetails(String userName) throws PaymentException;

    /**
     * Create a new wallet for the user with given id
     *
     * @param walletDto
     * @return
     * @throws PaymentException
     */
    WalletDetails createUsersWallet(WalletDto walletDto) throws PaymentException;

}
