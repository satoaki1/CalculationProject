package com.example.Satoaki.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "mul_elements")
public class MulElements {
    @Id
    private int id;
    private double firstNum;
    private double secondNum;
    private String type;
    private double result;

    public MulElements(int i, double a, double b, String multiply, double product) {
        this.id = i;
        this.firstNum = a;
        this.secondNum = b;
        this.type = multiply;
        this.result = product;
    }
}
