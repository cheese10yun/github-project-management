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
public class Address {

    @Column(name = "street")
    private String street;

    @Column(name = "address")
    private String address;

    @Column(name = "zip_code")
    private String zipCode;

    @Builder
    public Address(String street, String address, String zipCode) {
        this.street = street;
        this.address = address;
        this.zipCode = zipCode;
    }
}
