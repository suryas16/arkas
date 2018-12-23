package com.arkas.springboard.api.v1.controller;


import com.arkas.springboard.api.v1.request.AddFaqRequest;
import com.arkas.springboard.dto.model.FaqDto;
import com.arkas.springboard.dto.response.Response;
import com.arkas.springboard.service.admin.AdminService;
import com.arkas.springboard.service.exception.AdminException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by Su Su.
 */
@RestController
@RequestMapping("/v1/admin")
public class AdminController {

    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping(path = "/add-faq", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public Response addFaq(@RequestBody @Valid AddFaqRequest addFaqRequest) throws AdminException {
        FaqDto faqDto = new FaqDto()
                .setQuestion(addFaqRequest.getQuestion())
                .setAnswer(addFaqRequest.getAnswer());

        return Response.ok().setPayload(adminService.addFaq(faqDto));
    }

}

