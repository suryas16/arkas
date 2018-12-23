package com.arkas.springboard.api.v1.controller;


import com.arkas.springboard.domain.repository.FaqRepository;
import com.arkas.springboard.domain.repository.SettingsRepository;
import com.arkas.springboard.dto.response.Response;
import com.arkas.springboard.mapper.FaqMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Su Su.
 */
@RestController
@RequestMapping("/v1/about")
public class AboutController {

    private SettingsRepository settingsRepository;
    private FaqRepository faqRepository;


    @Autowired
    public AboutController(FaqRepository faqRepository, SettingsRepository settingsRepository) {
        this.faqRepository = faqRepository;
        this.settingsRepository = settingsRepository;
    }

    @GetMapping(value = "/faq", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response getFaq() {
        return Response.ok().setPayload(FaqMapper.mapFaqs(faqRepository.findAll()));
    }

    @GetMapping(value = "/terms-and-conditions", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response getTermsAndConditions() {
        return Response.ok().setPayload(settingsRepository.findTermsAndConditions().getSettingValue());
    }

    @GetMapping(value = "/privacy-policy", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response getPrivacyPolicy() {
        return Response.ok().setPayload(settingsRepository.findPrivacyPolicy().getSettingValue());
    }

    @GetMapping(value = "/about-us", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response getAboutUs() {
        return Response.ok().setPayload(settingsRepository.findAbout().getSettingValue());
    }

}

