package com.example.phonebook_rest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ENTRY_TBL")
public class Entry {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String number;
}
