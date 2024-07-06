package com.example.configserver;



import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;


@Configuration
@EnableWebSecurity
public class SecurityConfig {

    protected void configure(HttpSecurity http) throws Exception {
        http
                // Consider alternative approaches to CSRF protection if necessary
                .csrf().ignoringAntMatchers("/encrypt", "/decrypt") // Only ignore specific endpoints for CSRF
                .and()
                .authorizeHttpRequests()
                .antMatchers("/config/public").permitAll()  // Allow access to specific resources
                .antMatchers("/config/**").hasRole("CONFIG_ADMIN") // Require specific role for broader "/config/**" access
                .anyRequest().authenticated()
                .and()
                .httpBasic(httpBasic -> httpBasic.realmName("My App"));  // Set a custom realm name (optional)
    }
}

