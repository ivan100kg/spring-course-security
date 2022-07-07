package io.github.ivan100kg.security.configuration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

@EnableWebSecurity  // класс ответственный за security config(@Configuration)
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        User.UserBuilder userBuilder = User.withDefaultPasswordEncoder();
        auth.inMemoryAuthentication()
                .withUser(userBuilder.username("zaur").password("zaur").roles("EMPLOYEE"))
                .withUser(userBuilder.username("ivan").password("ivan").roles("MANAGER", "HR"))
                .withUser(userBuilder.username("oleg").password("oleg").roles("HR"));
    }
}
