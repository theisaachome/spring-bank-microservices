package com.highway.finance.configuration.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

public class SecurityConfiguration {

	@Bean
	public SecurityWebFilterChain 
	securityWebFilterChain(ServerHttpSecurity http) {
		   http
           .authorizeExchange()
           //ALLOWING REGISTER API FOR DIRECT ACCESS
           .pathMatchers("/user/api/v1/register").permitAll()
           //ALL OTHER APIS ARE AUTHENTICATED
           .anyExchange().authenticated()
           .and()
           .csrf().disable()
           .oauth2Login()
           .and()
           .oauth2ResourceServer()
           .jwt();
   return http.build();
	}
}
