package com.ibk.tipoCambio.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibk.tipoCambio.jwt.JwtService;

@RestController
@RequestMapping("/security")
public class LoginController {

	@Autowired
	JwtService jwtService;

	@PostMapping("/login")
	public String login(@AuthenticationPrincipal User activeUser) {
		List<String> roleList = activeUser.getAuthorities().stream().map(GrantedAuthority::getAuthority)
				.collect(Collectors.toList());
		return jwtService.createToken(activeUser.getUsername(), roleList);
	}

}
