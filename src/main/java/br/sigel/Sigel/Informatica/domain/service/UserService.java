
package br.sigel.Sigel.Informatica.domain.service;

import br.sigel.Sigel.Informatica.domain.model.User;


public interface UserService {
    
  User findById(Long id);

  User create(User userToCreate);
    
}
