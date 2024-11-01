package com.spring.EVotingSystem.controllers;

import com.spring.EVotingSystem.entities.Election;
import com.spring.EVotingSystem.entities.ElectionChoice;
import com.spring.EVotingSystem.entities.User;
import com.spring.EVotingSystem.entities.Vote;
import com.spring.EVotingSystem.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class MainController {

    @Autowired
    private MainService mainService;


    @GetMapping("/get/elections")
    public List<Election> getAll(){
        return mainService.getAll();
    }

    @PostMapping("/add/election")
    public void addElection(@RequestBody Election election){
        mainService.addElection(election);
    }

    @PostMapping("/add/electionChoice")
    public void addElectionChoice(@RequestBody ElectionChoice electionChoice){
        mainService.addElectionChoice(electionChoice);
    }

    @GetMapping("/get/electionChoices")
    public List<ElectionChoice> getAllElectionChoice(){
        return mainService.getAllElectionChoice();
    }

    @PostMapping("/count/election/choices")
    public long countChoiceList(@RequestBody Election election){
        return mainService.countChoiceList(election);
    }

    @PostMapping("/add/user")
    public void addUser(@RequestBody User user){
        mainService.addUser(user);
    }

    @GetMapping("/get/users")
    public List<User> getAllUser(){
        return mainService.getAllUser();
    }

    @GetMapping("/get/votes")
    public List<Vote> getAllVote(){
        return mainService.getAllVote();
    }

    @PostMapping("/add/vote")
    public void addVote(@RequestBody Vote vote){
        mainService.addVote(vote);
    }

    @GetMapping("/count/votes")
    public int countVote(){
       return mainService.countVote();
    }

    @PostMapping("/count/election/votes")
    public long countVoteByElection(@RequestBody Election election){
        return mainService.countVoteByElection(election);
    }

    @PostMapping("/winner/election")
    public ElectionChoice addWinner(@RequestBody Election election){
        return mainService.addWinner(election);
    }


}
