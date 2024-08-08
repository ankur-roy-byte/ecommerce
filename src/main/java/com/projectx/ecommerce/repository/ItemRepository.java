package com.projectx.ecommerce.repository;

import com.projectx.ecommerce.controller.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, String> {
}
