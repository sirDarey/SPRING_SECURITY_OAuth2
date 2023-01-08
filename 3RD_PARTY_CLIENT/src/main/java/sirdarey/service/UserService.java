package sirdarey.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import sirdarey.entity.User;
import sirdarey.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User registerUser(User newUser) {
    	newUser.setPassword(passwordEncoder.encode(newUser.getPassword()));
    	return userRepository.save(newUser);
    }
}
