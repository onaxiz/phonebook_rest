package com.example.phonebook_rest.controller;

import com.example.phonebook_rest.entity.Entry;
import com.example.phonebook_rest.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EntryController {
    @Autowired
    private EntryService service;

    @PostMapping("/addEntry")
    public Entry addEntry(@RequestBody Entry entry) {
        return service.saveEntry(entry);
    }

    @PostMapping("/addEntries")
    public List<Entry> addEntries(@RequestBody List<Entry> entries) {
        return service.saveEntries(entries);
    }

    @GetMapping("/entries")
    public List<Entry> findAllEntries() {
        return service.getAllEntries();
    }
    @GetMapping("/entryById/{id}")
    public Entry findEntryById (@PathVariable int id) {
        return service.getEntryById(id);
    }
    @GetMapping("/entryByName/{name}")
    public Entry findEntryByName (@PathVariable String name) {
        return service.getEntryByName(name);
    }

    @PutMapping("/update")
    public Entry updateEntry(@RequestBody Entry entry) {
        return service.updateEntry(entry);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEntry(@PathVariable int id) {
        return service.deleteEntry(id);
    }
}
