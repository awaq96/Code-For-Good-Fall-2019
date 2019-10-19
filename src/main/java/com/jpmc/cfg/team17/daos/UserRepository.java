package com.jpmc.cfg.team17.daos;




import com.jpmc.cfg.team17.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
