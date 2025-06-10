package ch.wiss.m450.starter_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.wiss.m450.starter_project.model.Item;
import ch.wiss.m450.starter_project.repository.ItemRepository;

@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    private ItemRepository _itemRepository;

    @GetMapping
    public Iterable<Item> getItems() {
        return _itemRepository.findAll();
    }

    @PostMapping
    public void addItem(Item newItem) {
        _itemRepository.save(newItem);
    }

    public void deleteItem(int itemId) {
        _itemRepository.deleteById(itemId);
    }
}
