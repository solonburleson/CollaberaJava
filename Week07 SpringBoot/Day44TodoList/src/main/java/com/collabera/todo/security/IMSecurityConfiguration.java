package com.collabera.todo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class IMSecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("Solon").password(passwordEncoder().encode("admin")).roles("USER","ADMIN");
		
		auth.inMemoryAuthentication().withUser("Ann").password(passwordEncoder().encode("admin")).roles("TEST");
		
		auth.inMemoryAuthentication().withUser("admin").password(passwordEncoder().encode("admin")).roles("ADMIN");
		
		
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests().antMatchers("/", "/login", "/webjars/**").permitAll() //allow access to root and login without signing in
		.antMatchers("/*todo*").hasAnyRole("USER", "ADMIN")  // allow access to todo routes with role user or admin
		.antMatchers("/**").hasAnyRole("ADMIN") //allow access to any route as admin
		.and().formLogin().loginPage("/login")  //direct to login
			.defaultSuccessUrl("/", true)   	// default sign in url
			.failureUrl("/login?error=true")	//failure url
		.and().logout().logoutSuccessUrl("/login?logout=true")   //logout user
			.invalidateHttpSession(true).permitAll()
		.and().exceptionHandling().accessDeniedPage("/forbidden")
		.and().csrf().disable();
	}
}
