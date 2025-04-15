package com.kowal.movieDB.Entity;

import java.util.UUID;

import com.kowal.movieDB.Enums.Role;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "auth_entity", schema = "auth")
public class AuthEntity {
    
    @Id
    private UUID id;

    @Column(nullable = false)
    private String hashedPasswd;

    @Column(nullable = false, unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private UserEntity user; 
}
