package com.github.cultivateweb.clients;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;

//@Entity
public class Client {

//    @Id
//    @GeneratedValue
	private int id;
	private String fio;
	private String email;
	private String phone;

    public Client() {
    }

    public Client(int id, String fio, String email, String phone) {
        this.id = id;
        this.fio = fio;
        this.email = email;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
