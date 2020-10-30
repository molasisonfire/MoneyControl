package com.example.demo.controller;

import com.example.demo.model.Picos;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@CrossOrigin
@RestController
public class ConsultaOrcamentoController {

    @GetMapping("/gastos_mes")
    public Picos picosMensais() {
        Picos g = new Picos();
        g.setData("07051994");
        g.setGanhos(200.00);
        g.setGastos(120.00);
        return g;
    }

    @GetMapping("/orcamento")
    public ArrayList<Picos> picosOrcamento() {
        ArrayList<Picos> orcamento = new ArrayList<Picos>();
        Picos g = new Picos();
        g.setData("Maio");
        g.setGanhos(2004.00);
        g.setGastos(1206.00);
        Picos g1 = new Picos();
        g1.setData("Junho");
        g1.setGanhos(2220.00);
        g1.setGastos(3120.00);
        Picos g2 = new Picos();
        g2.setData("Julho");
        g2.setGanhos(2020.00);
        g2.setGastos(2120.00);
        Picos g3 = new Picos();
        g3.setData("Agosto");
        g3.setGanhos(3211.00);
        g3.setGastos(1221.00);
        orcamento.add(g);
        orcamento.add(g1);
        orcamento.add(g2);
        orcamento.add(g3);
        return orcamento;
    }
}
