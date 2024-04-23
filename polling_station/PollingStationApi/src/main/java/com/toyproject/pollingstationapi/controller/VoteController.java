package com.toyproject.pollingstationapi.controller;

import com.toyproject.pollingstationapi.model.VotePlaceRequest;
import com.toyproject.pollingstationapi.service.VoteSerivce;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
