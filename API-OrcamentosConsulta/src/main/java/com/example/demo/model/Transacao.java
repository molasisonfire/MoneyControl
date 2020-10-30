package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Component
public class Transacao {
    @Getter
    @Setter
    public String CPF;
    @Getter @Setter
    public String Nome;
    @Getter @Setter
    public double Valor;
    @Getter @Setter
    public String Descricao;
    @Getter @Setter
    public String TipoTrans;
    @Getter @Setter
    public String Agencia;
    @Getter @Setter
    public String Conta;
}
