package com.kwgdev.microbeerinventoryservice.listeners;

import com.kwgdev.microbeerinventoryservice.config.JmsConfig;
import com.kwgdev.microbeerinventoryservice.domain.BeerInventory;
import com.kwgdev.microbeerinventoryservice.repositories.BeerInventoryRepository;
import com.kwgdev.model.events.NewInventoryEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * created by kw on 1/14/2021 @ 5:30 PM
 */
@Slf4j
@RequiredArgsConstructor
@Component
public class NewInventoryListener {

    private final BeerInventoryRepository beerInventoryRepository;

    @JmsListener(destination = JmsConfig.NEW_INVENTORY_QUEUE)
    public void listen(NewInventoryEvent event){
        log.debug(event.toString());

        beerInventoryRepository.save(BeerInventory.builder()
                .beerId(event.getBeerDto().getId())
                .quantityOnHand(event.getBeerDto().getQuantityOnHand())
                .upc(event.getBeerDto().getUpc())
                .build());
    }
}
