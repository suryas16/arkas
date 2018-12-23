package com.arkas.springboard.service.admin;

import com.arkas.springboard.dto.model.FaqDto;
import com.arkas.springboard.service.exception.AdminException;

/**
 * Created by Su Su.
 */

public interface AdminService {

    /**
     * Add a new FAQ to the existing list of those
     *
     * @param faqDto
     * @return confirmation message
     */
    String addFaq(FaqDto faqDto) throws AdminException;
}
