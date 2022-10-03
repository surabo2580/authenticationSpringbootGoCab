package com.knf.dev.Service;

import com.knf.dev.models.CabBooking;
import com.knf.dev.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class CabBookingService {


    @Autowired
    private BookingRepository repo;

    public CabBookingService(BookingRepository repo) {
        this.repo = repo;
    }


    public List<CabBooking> getBookingList(){
        return repo.findAll();
    }

    public void deleteById(Long id){
        repo.deleteById(id);
    }

}
