package com.projectx.ecommerce.controller.entity;

public class Item {

    private String id;
    private String title;
    private String description;


    public Item(String id, String title, String description) {
        super();
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Item() {
        super();
    }


    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
