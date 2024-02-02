package com.example.dbissue;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
