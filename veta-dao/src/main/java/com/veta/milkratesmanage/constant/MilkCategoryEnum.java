package com.veta.milkratesmanage.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MilkCategoryEnum {
  COW("COW"),
  BUFFALO("BUFFALO"),
  GOAT("GOAT");

  private final String animalName;
}
