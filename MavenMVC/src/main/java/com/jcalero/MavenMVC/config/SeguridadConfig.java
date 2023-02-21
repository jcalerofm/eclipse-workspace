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

	@SuppressWarnings("deprecation")
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//Pendiente de conectar con la bbdd

    //metodo provisional hasta que tengamos la bbdd
    UserBuilder usuarios = User.withDefaultPasswordEncoder();
    auth.inMemoryAuthentication()
    .withUser(usuarios.username("Calero").password("1234").roles("usuario","administrador"))
    .withUser(usuarios.username("Huan").password("1234").roles("usuario"))
    .withUser(usuarios.username("Dani").password("1234").roles("usuario","ayudante"))
    .withUser(usuarios.username("Pabro").password("1234").roles("usuario","administrador"));

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
    .antMatchers("/").hasRole("usuario")
    .antMatchers("/administradores/**").hasRole("administrador")
    .antMatchers("/ayudantes/**").hasRole("ayudante")
    .and().formLogin()
    .loginPage("/miFormLogin")
    .loginProcessingUrl("/verificarUsuario")
    .permitAll()
    .and().logout().permitAll()
    .and().exceptionHandling().accessDeniedPage("/accesoDenegado");
	}





}
