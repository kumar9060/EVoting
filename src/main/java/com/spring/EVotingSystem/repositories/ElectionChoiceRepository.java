package com.spring.EVotingSystem.repositories;

//import com.codingninjas.EVotingSystem.entities.Election;
//import com.codingninjas.EVotingSystem.entities.ElectionChoice;
import com.spring.EVotingSystem.entities.Election;
import com.spring.EVotingSystem.entities.ElectionChoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ElectionChoiceRepository extends JpaRepository<ElectionChoice, Long> {


//    @Query("SELECT ec from ElectionChoice ec Where ec.election= :election")
    @Query(value = "Select v.election_choice_id from vote v where v.election_id = ?1 group by v.election_choice_id order by count(v.election_choice_id) desc limit 1", nativeQuery = true)
    long addWinner(long id);


    @Query("SELECT count(ec) from ElectionChoice ec WHERE ec.election= :election")
    long countChoiceList(Election election);
}
