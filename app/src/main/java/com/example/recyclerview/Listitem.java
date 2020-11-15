package com.example.recyclerview;

public class Listitem {
     private String name;
     private String id;
     private String imageUrl;

    public Listitem(String name, String id, String imageUrl) {
        this.name = name;
        this.id = id;
        this.imageUrl= imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
