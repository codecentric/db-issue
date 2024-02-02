package com.example.dbissue;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Release {
    @Id
    public Long id;

    @Column
    public String releaseVersion;
}
