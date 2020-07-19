package com.Product;

public abstract class Component{
    public String Name;
    public int price;

    public Component(String Name, int price) {
        this.Name = Name;
        this.price = price;
    }
    public String descrip()
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name:{").append(Name).append("},{").append(price).append("};");
        return stringBuilder.toString();
    }
    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
