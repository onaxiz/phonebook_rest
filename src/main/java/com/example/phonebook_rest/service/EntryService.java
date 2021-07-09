package com.example.phonebook_rest.service;

import com.example.phonebook_rest.entity.Entry;
import com.example.phonebook_rest.repository.PhoneBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntryService {
    @Autowired
    private PhoneBookRepository repository;

    public Entry saveEntry(Entry entry){
        return repository.save(entry);
    }
    public List<Entry> saveEntries(List<Entry> entries){
        return repository.saveAll(entries);
    }

    public List<Entry> getAllEntries(){
        return repository.findAll();
    }
    public Entry getEntryById(int id){
        return repository.findById(id).orElse(null);
    }
    public Entry getEntryByName(String name){
        return repository.findByName(name);
    }
    public String deleteEntry(int id){
        repository.deleteById(id);
        return "phone with id:" + id + "removed!";
    }

    public Entry updateEntry(Entry entry){
        Entry existingEntry = repository.findById(entry.getId()).orElse(null);
        existingEntry.setName(entry.getName());
        existingEntry.setNumber(entry.getNumber());
        return repository.save(existingEntry);
    }

}
