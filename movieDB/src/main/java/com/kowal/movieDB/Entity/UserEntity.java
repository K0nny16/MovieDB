package com.kowal.movieDB.Entity;

import java.util.UUID;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class UserEntity {
    
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false, unique = false)
    private String displayName;

    @Column(nullable = true, unique = false)
    private String bio;
}
