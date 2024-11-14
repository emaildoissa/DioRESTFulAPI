
package br.sigel.Sigel.Informatica.domain.repository;

import br.sigel.Sigel.Informatica.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long>{
    boolean existsByAccountNumber(String acountNumber);
    
}
