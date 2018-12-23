package com.arkas.springboard.domain.repository;

import com.arkas.springboard.domain.model.Settings;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Su Su
 */
@Repository
public interface SettingsRepository extends CrudRepository<Settings, Long> {

    @Query("SELECT s FROM Settings s WHERE s.settingKey = 'about'")
    Settings findAbout();

    @Query("SELECT s FROM Settings s WHERE s.settingKey = 'terms_and_conditions'")
    Settings findTermsAndConditions();

    @Query("SELECT s FROM Settings s WHERE s.settingKey = 'privacy_policy'")
    Settings findPrivacyPolicy();

}