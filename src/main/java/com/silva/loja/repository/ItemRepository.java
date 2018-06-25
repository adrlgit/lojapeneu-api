package com.silva.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.silva.loja.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
