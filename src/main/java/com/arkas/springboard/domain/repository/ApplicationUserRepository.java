package com.arkas.springboard.domain.repository;

import com.arkas.springboard.domain.model.user.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Su Su.
 */
public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {

    /**
     * Finds a user by userName field.
     *
     * @param username
     * @return
     */
    ApplicationUser findByUsername(String username);
}
