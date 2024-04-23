package com.toyproject.pollingstationapi.repository;

import com.toyproject.pollingstationapi.entity.VotePlace;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VotePlaceRepository  extends JpaRepository<VotePlace, Long> {
}
