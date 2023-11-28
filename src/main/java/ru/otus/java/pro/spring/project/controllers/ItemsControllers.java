package ru.otus.java.pro.spring.project.controllers;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.otus.java.pro.spring.project.dtos.ItemDto;
import ru.otus.java.pro.spring.project.entities.Item;
import ru.otus.java.pro.spring.project.services.ItemsService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/items")
public class ItemsControllers {
    private final ItemsService itemsService;

    @GetMapping("/{id}")
    public ItemDto getItemById(@PathVariable Long id) {
        return itemsService.getItemById(id).map(item -> new ItemDto(item.getId(), item.getTitle(), item.getCost())).get();
    }

    @GetMapping
    public List<ItemDto> getAllItems() {
        return itemsService.getAllItems().stream().map(item -> new ItemDto(item.getId(), item.getTitle(), item.getCost())).collect(Collectors.toList());
    }

    @PostMapping
    public void createNewItem(@RequestBody ItemDto itemDto) {
        itemsService.createNewItem(itemDto);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        itemsService.deleteById(id);
    }
}
