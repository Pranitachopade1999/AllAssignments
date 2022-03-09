package com.springsecurity.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http
		.csrf().disable()
		.authorizeRequests()
		.antMatchers("/public/**").hasRole("NORMAL")
	.antMatchers("/users/**").hasRole("ADMIN")
		.anyRequest()
		.authenticated()
		.and()
		//.httpBasic();
		.formLogin()
		.loginPage("/signin")
		.loginProcessingUrl("/dologin")
		.defaultSuccessUrl("/users/");
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * auth.inMemoryAuthentication().withUser("Pranita").password("Pranita").roles(
		 * "NORMAL");
		 * auth.inMemoryAuthentication().withUser("Khushi").password("Khushi").roles(
		 * "ADMIN");
		 */
		auth.inMemoryAuthentication().withUser("Pranita").password(this.PasswordEncoder().encode("Pranita")).roles("NORMAL");
		auth.inMemoryAuthentication().withUser("Khushi").password(this.PasswordEncoder().encode("Khushi")).roles("ADMIN");
		
	}
	
	@Bean
	public PasswordEncoder PasswordEncoder()
	{
		//return NoOpPasswordEncoder.getInstance();
		return new BCryptPasswordEncoder(10);
	}
	
	
	

}

