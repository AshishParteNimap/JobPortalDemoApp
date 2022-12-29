package com.JobPortal.Service;

import org.springframework.stereotype.Component;

import com.JobPortal.Dto.UserLoginDto;
import com.JobPortal.Security.Security.AccessToken;
@Component
public interface AuthService {
AccessToken login(UserLoginDto userLoginDto);
	
}
