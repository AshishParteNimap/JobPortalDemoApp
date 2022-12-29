package com.JobPortal.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JobPortal.Dto.UserLoginDto;
import com.JobPortal.Security.Security.AccessToken;
import com.JobPortal.Service.AuthService;

@RestController
@RequestMapping("/api/auth/")
public class AuthController {

	
	private AuthService authService;
	
	@PostMapping("/login")
    public ResponseEntity<AccessToken> login(@RequestBody UserLoginDto userLoginDto) {
        AccessToken accessToken = authService.login(userLoginDto);
        return ResponseEntity.ok(accessToken);
    }
}
