package com.perrinjp.services.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityConfig
{
   
	@Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception 
    {
    	http.authorizeHttpRequests((authorize) -> authorize.requestMatchers("/api/draw/")
    		      .authenticated()
    		      .anyRequest()
    		      .permitAll());
        return http.build();
    }
  
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) 
            throws Exception 
    {
        auth.inMemoryAuthentication()
            .withUser("admin")
            .password("{noop}password")
            .roles("USER");
    }
}
