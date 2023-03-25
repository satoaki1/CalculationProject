package com.example.Satoaki.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@Table(name = "add_elements")
public class AddElements {
    @Id
    private int id;
    private double firstNum;
    private double secondNum;
    private String type;
    private double result;


}
