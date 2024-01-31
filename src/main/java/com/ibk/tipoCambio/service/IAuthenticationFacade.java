package com.ibk.tipoCambio.service;

import org.springframework.security.core.Authentication;

public interface IAuthenticationFacade {

	Authentication getAuthentication();
	
}
