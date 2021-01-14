package com.kwgdev.model.events;

import com.kwgdev.model.BeerDto;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * created by kw on 1/14/2021 @ 5:34 PM
 */
@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent implements Serializable {

    static final long serialVersionUID = -1761313326070018802L;

    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
