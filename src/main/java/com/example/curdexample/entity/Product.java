package com.example.curdexample.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="product_table")

public class Product
{
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int quantity;
    private double price;
}
