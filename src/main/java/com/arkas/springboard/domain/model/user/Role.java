package com.arkas.springboard.domain.model.user;

import com.arkas.springboard.domain.model.BaseDomainObject;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Entity;

/**
 * Created by Su Su.
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@Entity
public class Role extends BaseDomainObject {

    private String name;
}
