package com.example.Pokemon.model;

import javax.persistence.*;

@Entity
@Table(name = "pokeballs")
public class Pokeball {
    @Id
    private String type;

    @Column
    private String description;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
