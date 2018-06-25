package com.silva.loja.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.silva.loja.model.Item;
import com.silva.loja.repository.ItemRepository;

@RestController
public class ItemResource {

	@Autowired
	private ItemRepository itemRepository;
	
	@GetMapping("/itens")
	public List<Item> Listar(){
		return itemRepository.findAll();
	}
	
	@PostMapping("/itens")
	public Item adicionar(@RequestBody Item item) {
		return itemRepository.save(item);
	}
	
}
