package com.spring.EVotingSystem.repositories;

//import com.codingninjas.EVotingSystem.entities.User;
import com.spring.EVotingSystem.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
