package com.tio.tms.domain;

import javax.persistence.*;

@Entity
public class TDBillPayInquiry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String signInId;

    private String userProfile;



    public int getId(){ return id; }

    public void setId(int id){
        this.id = id;
    }

    public String getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(String userProfile) {
        this.userProfile = userProfile;
    }

    public String getSignInId() {
        return signInId;
    }
    public void setSignInId(String signInId) {
        this.signInId = signInId;
    }
}
