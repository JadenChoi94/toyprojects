package com.toyproject.pollingstationapi.service;

import com.toyproject.pollingstationapi.entity.VotePlace;
import com.toyproject.pollingstationapi.model.VotePlaceItem;
import com.toyproject.pollingstationapi.model.VotePlaceRequest;
import com.toyproject.pollingstationapi.repository.VotePlaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

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

    public List<VotePlaceItem> getVotePlaces() {
        // 데이터베이스에서 전체 데이터 가져오기
        List<VotePlace> VotePlaces = votePlaceRepository.findAll();

        List<VotePlaceItem> result = new LinkedList<>();

        for (VotePlace place : VotePlaces) {
            VotePlaceItem addItem = new VotePlaceItem();
            addItem.setPosX(place.getPosX());
            addItem.setPosY(place.getPosY());
            addItem.setAddressKor(place.getAddressKor());
            addItem.setPhone(place.getPhone());

            result.add(addItem);
        }
        // 전달하기
        return result;
    }
}
