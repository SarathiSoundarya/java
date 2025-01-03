package com.springboot.myfirstapp.rest;

public class Item{
    private int id;
    private String name;
    private String description;

    //getters
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }

    //setters
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setDescription(String des){
        this.description=des;
    }
}
