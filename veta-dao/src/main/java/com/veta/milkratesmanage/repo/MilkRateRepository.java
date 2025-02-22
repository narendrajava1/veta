package com.veta.milkratesmanage.repo;

import com.veta.milkratesmanage.entity.MilkRate;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MilkRateRepository extends CrudRepository<MilkRate, Long> {
  @Override
  List<MilkRate> findAll();
}
