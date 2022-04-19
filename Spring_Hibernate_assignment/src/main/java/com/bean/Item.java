package com.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int Id;
    private String item_name;
    private int value;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Item{" +
                "Id=" + Id +
                ", item_name='" + item_name + '\'' +
                ", value=" + value +
                '}';
    }
}
