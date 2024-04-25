package com.toyproject.pollingstationapi.controller;

import com.toyproject.pollingstationapi.model.VotePlaceItem;
import com.toyproject.pollingstationapi.model.VotePlaceRequest;
import com.toyproject.pollingstationapi.service.VoteSerivce;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/polling-station")
public class VoteController {
    private final VoteSerivce voteSerivce;

    @PostMapping("/new")
    public String setVotePlace(@RequestBody VotePlaceRequest request) {
        voteSerivce.setVotePlace(request);

        return "Success";
    }

    @GetMapping("/all")
    public List<VotePlaceItem> getvotePlace() {
        return voteSerivce.getVotePlaces();
    }
}
