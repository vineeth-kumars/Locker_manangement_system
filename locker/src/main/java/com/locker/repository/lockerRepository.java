package com.locker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.locker.entity.Lockers;

@Repository
public interface lockerRepository extends JpaRepository<Lockers, Integer> {

	Lockers findById(int id);
}
