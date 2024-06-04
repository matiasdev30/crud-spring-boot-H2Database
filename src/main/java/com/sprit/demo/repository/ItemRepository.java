package com.sprit.demo.repository;

import com.sprit.demo.model.Item;
import com.sprit.demo.repository.ItemRepository;
import org.springframework.stereotype.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}