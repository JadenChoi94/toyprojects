package com.toyproject.pollingstationapi.service;

import com.toyproject.pollingstationapi.entity.VotePlace;
import com.toyproject.pollingstationapi.model.VotePlaceRequest;
import com.toyproject.pollingstationapi.repository.VotePlaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor  //생성자: Lombok
public class VoteSerivce {
    private final VotePlaceRepository votePlaceRepository;

    public void setVotePlace(VotePlaceRequest request) {
        VotePlace addData = new VotePlace();
        addData.setPosX(request.getPosX());
        addData.setPosY(request.getPosY());
        addData.setAddressKor(request.getAddressKor());
        addData.setPhone(request.getPhone());

        votePlaceRepository.save(addData);
    }
}
