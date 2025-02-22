package com.veta.milkratesmanage.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AddressType {
  RURAL("RURAL"),
  URBAN("URBAN");

  private final String addressType;
}
