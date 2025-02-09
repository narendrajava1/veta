package com.veta.cattlemanage.controller;

import com.veta.cattlemanage.entity.Cattle;
import com.veta.cattlemanage.repo.CattleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cattle")
public class CattleController {
    @Autowired
    private CattleRepository cattleRepository;

    @GetMapping
    public ResponseEntity<List<Cattle>> getAllCattle() {
        return ResponseEntity.ok(cattleRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<Cattle> addCattle(@RequestBody Cattle cattle) {
        return ResponseEntity.status(HttpStatus.CREATED).body(cattleRepository.save(cattle));
    }
}