package com.veta.cattlemanage.repo;

import com.veta.cattlemanage.entity.Cattle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CattleRepository extends JpaRepository<Cattle, Long> {
    List<Cattle> findByBreed(String breed);
}