package com.veta.cattlemanage.repo;

import com.veta.cattlemanage.entity.Cattle;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CattleRepository extends JpaRepository<Cattle, Long> {
  List<Cattle> findByBreed(String breed);
}
