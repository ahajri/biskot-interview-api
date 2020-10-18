package com.biskot.domain.mapper;

import com.biskot.app.contract.model.ItemResponse;
import com.biskot.domain.model.Item;
import org.mapstruct.Mapper;

@Mapper
public interface ItemMapper {

    ItemResponse toResponse(Item item);

    Item toModel(ItemResponse itemResponse);
}
