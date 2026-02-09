package com.lostfound.model;

import java.sql.Timestamp;

public class Item {

    private int id;
    private String title;
    private String description;
    private String category;
    private String status;
    private String itemState;
    private int userId;
    private Timestamp createdDate;

   
    public Item() {
    }

    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

    public String getItemState() {
        return itemState;
    }
    
    public void setItemState(String itemState) {
        this.itemState = itemState;
    }

    public int getUserId() {
        return userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }
    
    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }
}
