package com.spring.EVotingSystem.repositories;

import com.spring.EVotingSystem.entities.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {
}
