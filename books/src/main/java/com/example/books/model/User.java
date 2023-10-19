package com.example.books.model;

import jakarta.persistence.*;
import jdk.jfr.SettingDefinition;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "my_users")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))    @Enumerated(EnumType.STRING)
    private Set<Role> roles = new HashSet<>();

    private String username;

    private String password;

    private Boolean active;

    public User() {
    }

    public User(Set<Role> roles, String username) {
        this.roles = roles;
        this.username = username;
    }
}
