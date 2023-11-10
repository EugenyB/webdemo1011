package com.example.webdemo1011.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calculator {
    private int a;
    private int b;

    public int getSum() {
        return a + b;
    }
}
