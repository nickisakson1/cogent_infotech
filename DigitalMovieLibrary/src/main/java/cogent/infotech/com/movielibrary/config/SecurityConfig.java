package cogent.infotech.com.movielibrary.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import cogent.infotech.com.movielibrary.service.CustomUserDetailsService;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	 	
	@Autowired
	private CustomUserDetailsService userDetailsService;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	    auth.userDetailsService(userDetailsService);
//		auth.inMemoryAuthentication()
//			.withUser("user1").password(passwordEncoder().encode("pwd1")).roles("Admin")
//			.and()
//			.withUser("user2").password(passwordEncoder().encode("pwd2")).roles("User");
	}
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/h2/**");
		web.ignoring().antMatchers("/users/**");
		
		web.ignoring().antMatchers("/user/**");
		web.ignoring().antMatchers("/admin/**");
//		web.authorizeRequests().antMatchers("/h2/**");
//		web.authorizeRequests().antMatchers("/users/**");
//		
//		web.authorizeRequests().antMatchers("/user/**").hasRole("Admin");
	}
	
	
	@Bean
	public PasswordEncoder passwordEncoder(){
	    return NoOpPasswordEncoder.getInstance();
	}

}