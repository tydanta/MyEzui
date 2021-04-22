package com.wty.pojo;

import java.util.Date;

public class Pet {

    private int petId;
    private String petName;
    private String petBreed;
    private String petSex;
    private Date birthday;
    private String desc;

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetBreed() {
        return petBreed;
    }

    public void setPetBreed(String petBreed) {
        this.petBreed = petBreed;
    }

    public String getPetSex() {
        return petSex;
    }

    public void setPetSex(String petSex) {
        this.petSex = petSex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Pet() {
    }

    public Pet(int petId, String petName, String petBreed, String petSex, Date birthday, String desc) {
        this.petId = petId;
        this.petName = petName;
        this.petBreed = petBreed;
        this.petSex = petSex;
        this.birthday = birthday;
        this.desc = desc;
    }
}
