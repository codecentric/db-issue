package com.example.dbissue;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Stuff {
    @Id
    public Long id;

    @Column
    public String name;

    @Column
    public String option;

    @ManyToOne
    public Release release;
}
