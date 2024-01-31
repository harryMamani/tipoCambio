package com.ibk.tipoCambio.service.impl;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.ibk.tipoCambio.service.IAuthenticationFacade;

@Component
public class AuthenticationFacade implements IAuthenticationFacade{

	@Override
	public Authentication getAuthentication() {
		return SecurityContextHolder.getContext().getAuthentication();
	}

}
