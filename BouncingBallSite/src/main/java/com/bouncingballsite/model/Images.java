package com.bouncingballsite.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Images {
    @Id
    private int id;
    private String name;
    private String url;

    public Images(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String position) {
        this.url = position;
    }
}
