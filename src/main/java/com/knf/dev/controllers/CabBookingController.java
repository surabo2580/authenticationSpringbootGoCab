package com.knf.dev.controllers;


import com.knf.dev.Service.CabBookingService;
import com.knf.dev.models.CabBooking;
import com.knf.dev.models.User;
import com.knf.dev.repository.BookingRepository;
import com.knf.dev.repository.UserRepository;
import com.knf.dev.request.BookingRequest;
import com.knf.dev.request.SignupRequest;
import com.knf.dev.response.MessageResponse;
import com.knf.dev.security.jwt.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class CabBookingController {
    @Autowired
    private CabBookingService cab_service;

    public CabBookingController(CabBookingService cab_service) {
        this.cab_service = cab_service;
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


    @PostMapping("/book")
    public ResponseEntity<?> registerBooking(@RequestBody BookingRequest bookingRequest) {

        // Create new user account
//		User user = new User(signUpRequest.getUsername(), signUpRequest.getEmail(),
//				encoder.encode(signUpRequest.getPassword()), encoder.encode(signUpRequest.getConfirmpassword()),
//				signUpRequest.getFirstname(),signUpRequest.getLastname(),signUpRequest.getPhone());
        CabBooking cabBooking = new CabBooking(bookingRequest.getUsername(),bookingRequest.getPickup(), bookingRequest.getDrop(), bookingRequest.getDate(), bookingRequest.getDepart());

        bookingRepository.save(cabBooking);

        return ResponseEntity.ok(new MessageResponse("successfully booked!"));


    }

//    @GetMapping("/getbyid/{id}")
//    public CabBooking showProductWithId(@PathVariable("id") Long id){
//
//        return BookingRepository.ge
//    }
//        //return new ResponseEntity<List<Product>> productRepository.getById(fetchProduct.getUserid());
//    }
    @GetMapping("/bookings")
    public List<CabBooking> list(){

        return cab_service.getBookingList();
    }

    @DeleteMapping("/delete-booking/{id}")
    public void deleteBooking(@PathVariable("id") Long id){
        System.out.println("++++++"+id);
        cab_service.deleteById(id);
    }
}
