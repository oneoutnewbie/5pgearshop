package model;

import java.util.Date;

public class SaleManager {

    private int salemanagerId;
    private String salemanagerName;
    private String email;
    private Date dob;
    private String password;
    private String phone;
    private String gender;
    public String avatar_url;
    private Role role;
    private String status;

    public SaleManager() {
    }

    public SaleManager(int salemanagerId, String salemanagerName, String email, Date dob, String password, String phone, String gender, String avatar_url, Role role, String status) {
        this.salemanagerId = salemanagerId;
        this.salemanagerName = salemanagerName;
        this.email = email;
        this.dob = dob;
        this.password = password;
        this.phone = phone;
        this.gender = gender;
        this.avatar_url = avatar_url;
        this.role = role;
        this.status = status;
    }

    public int getSalemanagerId() {
        return salemanagerId;
    }

    public void setSalemanagerId(int salemanagerId) {
        this.salemanagerId = salemanagerId;
    }

    public String getSalemanagerName() {
        return salemanagerName;
    }

    public void setSalemanagerName(String salemanagerName) {
        this.salemanagerName = salemanagerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}
