package com.spring.EVotingSystem.repositories;

//import com.codingninjas.EVotingSystem.entities.Election;
import com.spring.EVotingSystem.entities.Election;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ElectionRepository extends JpaRepository<Election, Long> {


    @Query("SELECT COUNT(v) from Vote v WHERE v.election= :election")
    long countVoteByElection( Election election);
}
