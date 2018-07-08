package com.sample.github.user;

import com.sample.github.model.Address;
import com.sample.github.model.Email;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class User {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Embedded
    private Email email;

    @Embedded
    private Address address;

    @Builder
    public User(Email email, Address address) {
        this.email = email;
        this.address = address;
    }
}
