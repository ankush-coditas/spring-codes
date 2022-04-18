package com.beans;

import java.util.List;
import java.util.Map;

public class Did {
    private  String seasonName;
    private List<String> brandPartner;
    private Map<Participant,String> participants;

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    public List<String> getBrandPartner() {
        return brandPartner;
    }

    public void setBrandPartner(List<String> brandPartner) {
        this.brandPartner = brandPartner;
    }

    public Map<Participant, String> getParticipants() {
        return participants;
    }

    public void setParticipants(Map<Participant, String> participants) {
        this.participants = participants;
    }
    public  void display(){
        System.out.println("Season Name"+seasonName);
        List<String> l = getBrandPartner();
        System.out.println("Brand Partners");
        for (String v :l
             ) {
            System.out.println(v);
        }
        Map<Participant,String> map = getParticipants();
        for(Map.Entry<Participant,String> p1: map.entrySet()){

            System.out.println(p1.getKey()+"  "+p1.getValue());
        }
    }
}
