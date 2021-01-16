package com.kwgdev.brewery.microbeerinventoryservice.services;

import com.kwgdev.brewery.model.BeerOrderDto;

/**
 * created by kw on 1/14/2021 @ 5:30 PM
 */
public interface AllocationService {

    Boolean allocateOrder(BeerOrderDto beerOrderDto);
}
