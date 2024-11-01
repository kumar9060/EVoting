package com.codingninjas.EVotingSystem.services;

import com.codingninjas.EVotingSystem.entities.Election;
import com.codingninjas.EVotingSystem.entities.ElectionChoice;
import com.codingninjas.EVotingSystem.entities.User;
import com.codingninjas.EVotingSystem.entities.Vote;
import com.codingninjas.EVotingSystem.repositories.ElectionChoiceRepository;
import com.codingninjas.EVotingSystem.repositories.ElectionRepository;
import com.codingninjas.EVotingSystem.repositories.UserRepository;
import com.codingninjas.EVotingSystem.repositories.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {

    @Autowired
    ElectionChoiceRepository electionChoiceRepository;

    @Autowired
    ElectionRepository electionRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    VoteRepository voteRepository;


    public List<Election> getAll() {
        return electionRepository.findAll();
    }

    public void addElection(Election election) {
        electionRepository.save(election);
    }

    public void addElectionChoice(ElectionChoice electionChoice) {
        electionChoiceRepository.save(electionChoice);
    }

    public List<ElectionChoice> getAllElectionChoice() {
        return electionChoiceRepository.findAll();
    }

    public long countChoiceList(Election election) {
        return electionChoiceRepository.countChoiceList(election);
    }

    public ElectionChoice addWinner(Election election) {
        long id = election.getId();
        long l = electionChoiceRepository.addWinner(id);
        return electionChoiceRepository.findById(l).get();
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public List<Vote> getAllVote() {
        return voteRepository.findAll();
    }

    public void addVote(Vote vote) {
        voteRepository.save(vote);
    }

    public int countVote() {
        return (int)voteRepository.count();
    }

    public long countVoteByElection(Election election) {
        return electionRepository.countVoteByElection(election);
    }




}
