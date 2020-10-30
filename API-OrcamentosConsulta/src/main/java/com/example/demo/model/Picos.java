package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@XmlRootElement
@Component
public class Picos {
    private String data;

    private double gastos;

    private double ganhos;
}
