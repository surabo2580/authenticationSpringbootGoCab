package com.knf.dev.repository;

import com.knf.dev.models.CabBooking;
import com.knf.dev.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookingRepository extends JpaRepository<CabBooking, Long> {

}
