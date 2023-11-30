package ru.otus.java.pro.spring.project.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.otus.java.pro.spring.project.dtos.ItemDto;
import ru.otus.java.pro.spring.project.entities.Item;
import ru.otus.java.pro.spring.project.exceptions.ResourceNotFoundException;
import ru.otus.java.pro.spring.project.repositories.ItemsRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ItemsService {
    private final ItemsRepository itemsRepository;

    public Optional<Item> getItemById(Long id) {
        return itemsRepository.findById(id);
    }

    public List<Item> getAllItems() {
        throw new ResourceNotFoundException("A");
//        return itemsRepository.findAll();
    }

    public void createNewItem(ItemDto itemDto) {
        Item item = new Item(null, itemDto.getTitle(), itemDto.getCost());
        itemsRepository.save(item);
    }

    public void deleteById(Long id) {
        itemsRepository.deleteById(id);
    }
}
