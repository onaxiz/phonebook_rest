package com.example.phonebook_rest.repository;

import com.example.phonebook_rest.entity.Entry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneBookRepository extends JpaRepository<Entry,Integer> {
    Entry findByName(String name);
}
