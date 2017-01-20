package com.spr.service;

import com.spr.exception.ShopNotFound;
import com.spr.model.Shop;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface ShopService {

    Shop create(Shop shop);

    Shop delete(int id) throws ShopNotFound;

    List<Shop> findAll();

    List<Shop> findAll(Sort sort);

    Shop update(Shop shop) throws ShopNotFound;

    Shop findById(int id);

}
