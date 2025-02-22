/*
package com.veta.milkratesmanage.controller.mapper;

import com.veta.milkratesmanage.constant.MilkCategoryEnum;
import com.veta.milkratesmanage.entity.MilkRate;
import com.veta.vetamodal.MilkModal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ValueMapping;

@Mapper(componentModel = "spring")
public interface MilkMapper {
    @ValueMapping(target = "COW", source = "COW")
    @ValueMapping(target = "BUFFALO", source = "BUFFALO")
    @ValueMapping(target = "GOAT", source = "GOAT")
    MilkCategoryEnum toMilkCategory(String milkCategory);

    @Mapping(target = "price", source = "price")
    @Mapping(target = "status", source = "status")
    @Mapping(target = "quantity", source = "quantity")
    MilkRate toMilkRateAndUser(MilkModal milkModal);

}
*/
