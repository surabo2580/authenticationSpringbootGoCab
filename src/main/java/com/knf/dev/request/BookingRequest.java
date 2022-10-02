package com.knf.dev.request;

import lombok.Data;

@Data
public class BookingRequest {
    private String pickup;
    private String drop;
    private String date;
    private String depart;
}
