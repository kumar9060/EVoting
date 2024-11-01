package com.codingninjas.EVotingSystem.repositories;

import com.codingninjas.EVotingSystem.entities.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {
}
