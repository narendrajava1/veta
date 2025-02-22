package com.veta.milkratesmanage.entity;

import com.veta.milkratesmanage.constant.MilkCategoryEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class MilkRate {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Enumerated(EnumType.STRING)
  private MilkCategoryEnum milkCategory;

  private Integer quantity;

  private Double price;
  private Boolean status;
}
