package com.example.bmiexample.model;

import java.util.ArrayList;

public class SportsGames {
    private ArrayList<Sport> sports=new ArrayList<Sport>();
    public SportsGames(){
        sports.add(new Sport("Football","Coach Ahmed",2004));
        sports.add(new Sport("Golf","Coach Noor",2011));
        sports.add(new Sport("Gymnastics","Coach Loor",2006));
        sports.add(new Sport("Hockey","Coach Odai",2013));
        sports.add(new Sport("Horse racing","Coach Teya",2008));

    }
    public ArrayList<Sport> getSportsByType(String type){
        ArrayList<Sport> result =new ArrayList<Sport>();
        for(Sport c : sports){
            if(c.getType().equals(type)){
                result.add(c);
            }
        }
        return result;
    }
}
