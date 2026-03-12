//create table user (user_id int, user_name varchar(30), user_pwd varchar(100), user_role varchar(20), user_enabled int);
//INSERT INTO user values(501,'codesquadz','codesquadz','ADMIN',1);
//INSERT INTO user values(502,'manish','$2a$10$gVeBobjIZYp1tKZK.QZzoOxI4Hps2KSAvjW/bCS903d1/7ygHWyB6','USER',1);
package com.example.FirstSpringBootProject.config;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	 
	  @Autowired
	private DataSource dataSource;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	
	@Override
	/*protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.jdbcAuthentication()
		.dataSource(dataSource)     //creates database connection
		.usersByUsernameQuery("select user_name,user_pwd,user_enabled from user where user_name=?")
		.authoritiesByUsernameQuery("select user_name,user_role from user where user_name=?")
		.passwordEncoder(passwordEncoder);
	}*/
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.jdbcAuthentication()
		.dataSource(dataSource)     //creates database connection
		.usersByUsernameQuery("select user_name,user_pwd,user_enabled from user where user_name=?")
		.authoritiesByUsernameQuery("select user_name,user_role from user where user_name=?")
		.passwordEncoder(NoOpPasswordEncoder.getInstance());
	  }
	  /*@Bean 
	  public PasswordEncoder getPasswordEncoder() { return
	  NoOpPasswordEncoder.getInstance(); }*/
	  
	  @Override 
	  protected void configure(HttpSecurity http) throws Exception 
	  {
	 
	  http.authorizeRequests().antMatchers("/greet").hasAuthority("ADMIN").antMatchers(
	  "/listOfUniversities") .hasAuthority("USER").antMatchers("/").permitAll().and().formLogin();
	  
	 
	 
	  }
	  
	 
}
