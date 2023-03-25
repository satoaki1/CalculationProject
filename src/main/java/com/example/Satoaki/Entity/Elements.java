package com.example.Satoaki.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@Table(name = "elements")
public class Elements {

    @Id
    private int calcID;

    private Double a;

    private Double b;

    private String type;

    private Double result;
}
//
//
//@Entity
//@Table(name = "elements")
//public class Elements {
//
//    @Id
//    @Column
//    private int calcID;
//
//    @Column(name = "a")
//    private Double a;
//
//    @Column(name = "b")
//    private Double b;
//
//    @Column(name = "type")
//    private String type;
//
//    @Column(name = "result")
//    private Double result;
//
//    public Elements() {
//    }
//
//    public Elements(int calcID, Double a, Double b, String type, Double result) {
//        this.calcID = calcID;
//        this.a = a;
//        this.b = b;
//        this.type = type;
//        this.result = result;
//    }
//
//    public int getCalcID() {
//        return calcID;
//    }
//
//    public Double getA() {
//        return a;
//    }
//
//    public Double getB() {
//        return b;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public Double getResult() {
//        return result;
//    }
//
//    public void setCalcID(int calcID) {
//        this.calcID = calcID;
//    }
//
//    public void setA(Double a) {
//        this.a = a;
//    }
//
//    public void setB(Double b) {
//        this.b = b;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public void setResult(Double result) {
//        this.result = result;
//    }
//}
