package org.example;

public class Producto {
    private int id;
    private String desc;
    private int price;
    private String category;

    public Producto(int id, String desc, int price, String category) {
        this.id = id;
        this.desc = desc;
        this.price = price;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    private void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPrice() {
        return price;
    }

    private void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    private void setCategory(String category) {
        this.category = category;
    }
}
