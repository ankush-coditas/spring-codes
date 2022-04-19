package com.bean;


import com.dao.ExpenditureDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringH.xml");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ExpenditureDao d = (ExpenditureDao) context.getBean("dao");
        while (true) {
            System.out.println("1:insert the record \n 2:get all record \n 3:Total expenditure \n 4:exit");
            int ch = Integer.parseInt(reader.readLine());
            switch (ch) {
                case 1:
                    System.out.println("Enter name, value");
                    Item item = new Item();
                    item.setItem_name(reader.readLine());
                    item.setValue(Integer.parseInt(reader.readLine()));

                    int i = d.insertItem(item);
                    if (i > 0)
                        System.out.println("Successful Insertion");
                    else
                        System.out.println("Unsuccessful");
                    break;
                case 2:
                    List<Item> emp=d.fetchItem();
                    for(Item l:emp){
                        System.out.println(emp);
                    }
                    break;
                case 3:
                    int sum =0;
                    List<Item> items=d.fetchItem();
                    for(Item l:items){
                        sum+=l.getValue();
                    }
                    System.out.println(sum);
                case 4:
                    System.exit(0);

            }
        }
    }
}