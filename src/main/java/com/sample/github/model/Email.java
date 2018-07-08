package com.sample.github.model;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Email {

    @org.hibernate.validator.constraints.Email
    @Column(name = "email", nullable = false, unique = true, updatable = false)
    private String value;

    @Builder
    public Email(String value) {
        this.value = value;
    }
}
