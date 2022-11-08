package com.example.internetsale.dto;

import javax.persistence.Column;

public class UserDto {

    private Long id;
    private String firstname;
    private String surname;

    private String items_id;
    private String markets_id;

    public UserDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getItems_id() {
        return items_id;
    }

    public void setItems_id(String items_name) {
        this.items_id = items_name;
    }

    public String getMarkets_id() {
        return markets_id;
    }

    public void setMarkets_id(String markets_id) {
        this.markets_id = markets_id;
    }



    public UserDto(Long id, String firstname, String surname, String items_name, String markets_name) {
        this.id = id;
        this.firstname = firstname;
        this.surname = surname;
        this.items_id = items_name;
        this.markets_id = markets_name;
    }
}

