package com.knf.dev.models;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user_complain")
public class Complain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private String phone;
    private String complain;


    public Complain(String email,String phone,String complain){
        this.email=email;
        this.phone=phone;
        this.complain=complain;
    }

    public Complain() {
        super();
    }

}