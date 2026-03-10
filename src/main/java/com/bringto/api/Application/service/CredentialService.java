package com.bringto.api.Application.config.service;

import com.bringto.api.Application.config.model.User;

import javax.persistence.*;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "credentials")
public class Credential {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String login;

    @Column(nullable = false)
    private String encryptedPassword;

    private String url;
    private String notes;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User owner;
}
