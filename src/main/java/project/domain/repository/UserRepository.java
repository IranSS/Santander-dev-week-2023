package project.domain.repository;

import org.springframework.stereotype.Repository;
import project.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    boolean existsByAccountNumber(String accountNumber);
}
