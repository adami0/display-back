package com.display.back.model;

import javax.persistence.*;

@Entity
@Table(name="sequence")
public class Sequence {

    @Id
    @Column(name="sequence_id")
    @GeneratedValue
    private int idSequence;

    @Column(name="sequence_name")
    private String name;

    public Sequence(){

    }

    public Sequence(int idSequence, String name) {
        this.idSequence = idSequence;
        this.name = name;
    }

    public int getIdSequence() {
        return idSequence;
    }

    public String getName() {
        return name;
    }

    public void setIdSequence(int idSequence) {
        this.idSequence = idSequence;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sequence{" +
                "idSequence=" + idSequence +
                ", name='" + name + '\'' +
                '}';
    }
}
