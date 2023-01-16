package com.wamazon.wamazonservice.controller;

import com.wamazon.wamazonservice.dto.RegistrationDto;
import com.wamazon.wamazonservice.dto.UserDetails;
import com.wamazon.wamazonservice.service.ISellerService;
import com.wamazon.wamazonservice.service.UserDetailsContextService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/seller")
public class SellerAuthenticationController {
    @Autowired
    private ISellerService sellerService;
    @Autowired
    private UserDetailsContextService userDetailsContextService;

    @PostMapping("/register")
    public boolean register(@RequestBody RegistrationDto registrationDto) {
        return sellerService.register(registrationDto);
    }

    @GetMapping("/currentUser")
    public UserDetails getCurrentUserDetails() {
        return userDetailsContextService.getUserDetails();
    }
    @GetMapping("/logout")
    public void logout(HttpSession httpSession) {
        httpSession.invalidate();
    }
}
