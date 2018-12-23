package com.arkas.springboard.service.user;

import com.arkas.springboard.domain.model.payment.WalletDetails;
import com.arkas.springboard.domain.model.payment.WalletLevel;
import com.arkas.springboard.dto.model.user.UserDto;
import com.arkas.springboard.service.exception.PaymentException;
import com.arkas.springboard.service.exception.UserException;

/**
 * Created by Su Su.
 */
public interface UserService {
    /**
     * Service method to add a new user.
     *
     * @param userDto
     * @return
     * @throws UserException
     */
    String addUser(UserDto userDto) throws UserException;

    /**
     * Create a new wallet for the given user.
     *
     * @param userDto
     * @param walletLevel
     * @return
     */

    WalletDetails createUserWallet(UserDto userDto, WalletLevel walletLevel) throws PaymentException;
}
