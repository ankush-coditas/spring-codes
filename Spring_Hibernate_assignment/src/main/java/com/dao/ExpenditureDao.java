package com.dao;

import com.bean.Item;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class ExpenditureDao {
    HibernateTemplate ht;

    public void setHt(HibernateTemplate ht) {
        this.ht = ht;
    }

    public HibernateTemplate getHt() {
        return ht;
    }
    @Transactional
    public int insertItem(Item e){
        return (int)ht.save(e);
    }


    public List<Item> fetchItem(){
        return ht.loadAll(Item.class);
    }
}
