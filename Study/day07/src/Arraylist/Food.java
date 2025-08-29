package Arraylist;
/*
设计菜品类，封装菜品数据
 */
public class Food {
    private String name;
    private double price;
    private String desc;//描述

    public Food() {
    }

    public Food(String desc, double price, String name) {
        this.desc = desc;
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
