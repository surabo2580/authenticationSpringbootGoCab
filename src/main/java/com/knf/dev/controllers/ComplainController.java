package com.knf.dev.controllers;


import com.knf.dev.Service.CabBookingService;
import com.knf.dev.Service.ComplainService;
import com.knf.dev.models.CabBooking;
import com.knf.dev.models.Complain;
import com.knf.dev.repository.BookingRepository;
import com.knf.dev.repository.UserRepository;
import com.knf.dev.request.BookingRequest;
import com.knf.dev.response.MessageResponse;
import com.knf.dev.security.jwt.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class ComplainController {
    @Autowired
    private ComplainService complainService;

    public ComplainController(ComplainService complainService) {
        this.complainService = complainService;
    }

    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    BookingRepository bookingRepository;
    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder encoder;

    @Autowired
    JwtUtils jwtUtils;


    @PostMapping("/savecomplain")
    public Complain saveProduct(
            @RequestBody Complain complain)
    {
        return complainService.saveComplain(complain);
    }
}

