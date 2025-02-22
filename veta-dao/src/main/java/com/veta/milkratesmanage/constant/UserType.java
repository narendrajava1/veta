package com.veta.milkratesmanage.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserType {
  FARMER("FARMER"),
  DIARY("DIARY");

  private final String userType;
}
