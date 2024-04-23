package com.toyproject.pollingstationapi.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VotePlaceRequest {
    private Double posX;
    private Double posY;
    private String addressKor;
    private String phone;
}
