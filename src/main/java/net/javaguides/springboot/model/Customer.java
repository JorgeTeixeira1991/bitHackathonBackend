package net.javaguides.springboot.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private int phone;
    @Column(name = "address")
    private String address;
    @Autowired
    public long getId() {
        return id;
    }
    @Autowired
    public void setId(long id) {
        this.id = id;
    }
    @Autowired
    public String getFirstName() {
        return firstName;
    }
    @Autowired
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @Autowired
    public String getLastName() {
        return lastName;
    }
    @Autowired
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Autowired
    public String getEmail() {
        return email;
    }
    @Autowired
    public void setEmail(String email) {
        this.email = email;
    }
    @Autowired
    public int getPhone() {
        return phone;
    }
    @Autowired
    public void setPhone(int phone) {
        this.phone = phone;
    }
    @Autowired
    public String getAddress() {
        return address;
    }
    @Autowired
    public void setAddress(String address) {
        this.address = address;
    }
}
