package com.lostfound.model;

import java.sql.Timestamp;

public class Claim {

    private int id;
    private int itemId;
    private int userId;
    private String claimStatus;
    private Timestamp createdDate;

    public Claim() {
    }

  
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public int getItemId() {
        return itemId;
    }
    
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getUserId() {
        return userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getClaimStatus() {
        return claimStatus;
    }
    
    public void setClaimStatus(String claimStatus) {
        this.claimStatus = claimStatus;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }
    
    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }
}
