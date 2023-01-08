package sirdarey.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests().requestMatchers("/auth/**").permitAll().requestMatchers("/api/**")
				.hasAuthority("SCOPE_api.rea") // YET TO UNDERSTAND (Cuz it works with "api.rea" INSTEAD OF "api.read")
				.and().oauth2ResourceServer().jwt();
		return http.build();
	}
}
