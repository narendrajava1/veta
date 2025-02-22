package com.veta.vetamodal;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@Builder
public class MilkModal {
  private String milkCategory;
  private Integer quantity;
  private Double price;
  private String date;
  private Boolean status;
  private String email;
  private String name;
  private String phone;
}
