package com.sample.github.user;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class UserFindService {

    private UserRepository userRepository;

    public User findById(long id) {
        final User user = userRepository.findOne(id);
        if (user == null) throw new RuntimeException();
        return user;
    }

}
