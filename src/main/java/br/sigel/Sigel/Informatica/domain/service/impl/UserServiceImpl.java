
package br.sigel.Sigel.Informatica.domain.service.impl;

import br.sigel.Sigel.Informatica.domain.model.User;
import br.sigel.Sigel.Informatica.domain.repository.UserRepository;
import br.sigel.Sigel.Informatica.domain.service.UserService;
import java.util.NoSuchElementException;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return userRepository.save(userToCreate);
    }
}