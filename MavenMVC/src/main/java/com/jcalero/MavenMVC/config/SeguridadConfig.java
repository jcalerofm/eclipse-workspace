package com.jcalero.MavenMVC.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class SeguridadConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//Pendiente de conectar con la bbdd

    //metodo provisional hasta que tengamos la bbdd
    UserBuilder usuarios = User.withDefaultPasswordEncoder();
    auth.inMemoryAuthentication()
    .withUser(usuarios.username("Calero").password("1234").roles("administrador"))
    .withUser(usuarios.username("Huan").password("1234").roles("usuario"))
    .withUser(usuarios.username("Dani").password("1234").roles("ayudante"))
    .withUser(usuarios.username("Pabro").password("1234").roles("administrador"));

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().authenticated().and().formLogin()
    .loginPage("/miFormLogin")
    .loginProcessingUrl("/verificarUsuario");
    // .permitAll()
    // .and().logout().permitAll();
	}





}
