package com.veta.milkratesmanage.controller;

import com.veta.milkratesmanage.entity.MilkRate;
import com.veta.milkratesmanage.repo.MilkRateRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/rates")
@RestController
@CrossOrigin("http://localhost:3000")
public class MilkRatesController {

  @Autowired private MilkRateRepository milkRateRepository;

  @GetMapping
  public ResponseEntity<List<MilkRate>> getAllMilkRates() {

    return ResponseEntity.ok(milkRateRepository.findAll());
  }

  @PostMapping
  public ResponseEntity<MilkRate> addMilkRate(@RequestBody MilkRate milkRate) {
    return ResponseEntity.status(HttpStatus.CREATED).body(milkRateRepository.save(milkRate));
  }
}
