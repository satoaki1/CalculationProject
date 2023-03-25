package com.example.Satoaki.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@Table(name = "sub_elements")
public class SubElements {

    @Id
    private int id;
    private double firstNum;
    private double secondNum;
    private String type;
    private double result;


//    public SubElements(int id, double a, double b, String subtract, double gap) {
//        this.id = id;
//        this.firstNum = a;
//        this.secondNum = b;
//        this.type = subtract;
//        this.result = gap;
//    }
}
