package com.example.dbissue;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Release {
    @Id
    public Long id;

    @Column
    public String releaseVersion;
}
