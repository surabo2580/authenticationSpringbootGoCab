package com.knf.dev.models;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "bookingdetails")
public class CabBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String pickup;
    private String drop;
    private String date;
    private String depart;

    public CabBooking(String pickup,String drop,String date,String depart){
        this.pickup = pickup;
        this.drop= drop;
        this.date = date;
        this.depart = depart;
    }

    public CabBooking() {
        super();
    }

}
