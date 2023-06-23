package cogent.infotech.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;


import cogent.infotech.com.entity.*;
import cogent.infotech.com.repository.UserRepository;
import cogent.infotech.com.util.JwtUtil;

import java.util.*;

import javax.management.relation.Role;

// similar to the JwtService
@Service
public class CustomUserDetailsService implements UserDetailsService {
	
//	@Autowired
//	private JwtUtil jwtUtil;
	
	@Autowired
	private UserRepository userRepository;
//	
//	@Autowired
//	private AuthenticationManager authenticationManager;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
		
		Set<SimpleGrantedAuthority> authorities = new HashSet<>();
		authorities.add(new SimpleGrantedAuthority("ROLE_" + user.getUserType()));
		// Session.setAuth(user.getUserType());
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorities);
	}

//	public JwtResponse createJwtToken(JwtRequest jwtRequest) throws Exception {
//        String userName = jwtRequest.getUsername();
//        String userPassword = jwtRequest.getUserpassword();
//        authenticate(userName, userPassword);
//
//        UserDetails userDetails = loadUserByUsername(userName);
//        String newGeneratedToken = jwtUtil.generateToken(userName);
//
//        User user = userRepository.findByUsername(userName);
//        return new JwtResponse(user, newGeneratedToken);
//    }
//
//    private void authenticate(String userName, String userPassword) throws Exception {
//        try {
//            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userName, userPassword));
//        } catch (DisabledException e) {
//            throw new Exception("USER_DISABLED", e);
//        } catch (BadCredentialsException e) {
//            throw new Exception("INVALID_CREDENTIALS", e);
//        }
//    }
//    
//    private String getAuthority(User user) {
//        return user.getUserType();
//    }
}
