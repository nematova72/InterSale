package com.example.internetsale.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="user")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String surname;
    private int items_id;
    private int markets_id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "items_id", referencedColumnName = "items_id",insertable = false, updatable = false)
    Item itemNo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "markets_id", referencedColumnName = "markets_id",insertable = false, updatable = false)
    Market marketName;

    public User() {
    }
    public User(Long id, String firstname, String surname, int items_id, int markets_id) {
        this.id = id;
        this.firstname = firstname;
        this.surname = surname;
        this.items_id = items_id;
        this.markets_id = markets_id;
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

    public int getItems_id() {
        return items_id;
    }

    public void setItems_id(int items_id) {
        this.items_id = items_id;
    }

    public int getMarkets_id() {
        return markets_id;
    }

    public void setMarkets_id(int markets_id) {
        this.markets_id = markets_id;
    }

    public Item getItemNo() {
        return itemNo;
    }

    public void setItemNo(Item itemNo) {
        this.itemNo = itemNo;
    }

    public Market getMarketName() {
        return marketName;
    }

    public void setMarketName(Market marketName) {
        this.marketName = marketName;
    }
}


