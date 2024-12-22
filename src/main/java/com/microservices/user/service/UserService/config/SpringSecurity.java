package com.microservices.user.service.UserService.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringSecurity
{
  /*  @Bean
    public SecurityFilterChain filterChain (HttpSecurity httpSecurity) throws Exception
    {
        httpSecurity.csrf().disable()
                .authorizeHttpRequests()
                .requestMatchers("/users/admin")
                .hasRole("ADMIN")
                .requestMatchers("/users/public")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin();

        return httpSecurity.build();
    }

    @Bean
    public UserDetailsService userDetailsService()
    {
       // UserDetails normalUser = User.withUsername();
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
                return null;
            }
        };
    }*/
}
