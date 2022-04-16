package com.xharktank.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xharktank.Models.Pitch;


@Repository
public interface PitchRepository extends JpaRepository<Pitch,String>{

}

