package org.solent.com504.project.impl.web;

import org.solent.com504.project.impl.service.ServiceConfiguration;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SpringBootWebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/",
                        "/home",
<<<<<<< HEAD
                        "/resources/**",
                        "/swagger-ui/**",
                        "/registration"
                ).permitAll()
                .antMatchers("/mvc/**",
                        "/home",
                        "/contact",
                        "/about"
                ).hasRole("USER")  // ROLE_USER 
                .antMatchers("/users").hasRole("GLOBAL_ADMIN") // ROLE_GLOBAL_ADMIN
=======
                        "/contact",
                        "/about",
                        "/index.html",
                        "/resources/**",
                        "/images/**",
                        "/swagger-ui/**",
                        "/registration",
                        "/rest/openapi.json"
                ).permitAll()
                .antMatchers("/mvc/**"
                ).hasRole("USER") // ROLE_USER 
                .antMatchers("/users").hasRole("GLOBAL_ADMIN") // ROLE_GLOBAL_ADMIN
                .antMatchers("/rest/**").hasAnyRole("REST_USER","GLOBAL_ADMIN") // ROLE_GLOBAL_ADMIN
>>>>>>> upstream/master
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .usernameParameter("username")
                .passwordParameter("password")
<<<<<<< HEAD
                .successForwardUrl("/home")
=======
                .defaultSuccessUrl("/home", true)
>>>>>>> upstream/master
                .permitAll()
                .and()
                .logout()
                .permitAll()
                .logoutSuccessUrl("/login?logout");
    }
}
