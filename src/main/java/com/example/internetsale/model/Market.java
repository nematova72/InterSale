package com.example.internetsale.model;

import javax.persistence.*;

@Entity
@Table(name="markets")

public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="markets_id")
    private Long marketsId;
    private String name;
    private String location;
    private int items_id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "items_id", referencedColumnName = "items_id",insertable = false, updatable = false)
    Item itemNo;

    public Item getItemNo() {
        return itemNo;
    }

    public void setItemNo(Item itemNo) {
        this.itemNo = itemNo;
    }

    public Market() {

    }

    public Market(Long markets_id, String name, String location, int items_id) {
        this.marketsId = markets_id;
        this.name = name;
        this.location = location;
        this.items_id = items_id;
    }


    public Long getMarketsId() {
        return marketsId;
    }

    public void setMarketsId(Long markets_id) {
        this.marketsId = markets_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getItems_id() {
        return items_id;
    }

    public void setItems_id(int items_id) {
        this.items_id = items_id;
    }


}


