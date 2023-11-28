package ru.otus.java.pro.spring.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.otus.java.pro.spring.project.entities.Item;

@Repository
public interface ItemsRepository extends JpaRepository<Item, Long> {
}