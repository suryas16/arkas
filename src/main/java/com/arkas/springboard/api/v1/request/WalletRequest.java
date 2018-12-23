package com.arkas.springboard.api.v1.request;

import com.arkas.springboard.domain.model.payment.WalletLevel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by Su Su.
 */
@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class WalletRequest {
    @NotEmpty(message = "{constraints.NotEmpty.message}")
    private String username;
    
    private WalletLevel walletLevel;
}
