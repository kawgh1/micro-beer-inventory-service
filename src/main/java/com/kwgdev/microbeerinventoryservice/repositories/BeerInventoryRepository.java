package com.kwgdev.microbeerinventoryservice.repositories;

import com.kwgdev.microbeerinventoryservice.domain.BeerInventory;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.UUID;

/**
 * created by kw on 1/14/2021 @ 5:30 PM
 */
public interface BeerInventoryRepository extends PagingAndSortingRepository<BeerInventory, UUID> {

    List<BeerInventory> findAllByBeerId(UUID beerId);

    List<BeerInventory> findAllByUpc(String upc);
}
