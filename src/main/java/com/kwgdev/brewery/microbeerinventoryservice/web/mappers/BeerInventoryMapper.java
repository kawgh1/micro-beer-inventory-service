package com.kwgdev.brewery.microbeerinventoryservice.web.mappers;

import com.kwgdev.brewery.microbeerinventoryservice.domain.BeerInventory;
import com.kwgdev.brewery.model.BeerInventoryDto;
import org.mapstruct.Mapper;

/**
 * created by kw on 1/14/2021 @ 5:32 PM
 */
@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
