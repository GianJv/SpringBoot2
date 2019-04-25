package com.fulcito.consulta.controller;

import com.fulcito.consulta.model.Calculator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    @GetMapping("/suma")
    public String getSuma(@RequestParam Integer a, @RequestParam Integer b){


        return (a+b)+"";
    }
    @GetMapping("/resta")
    public String getResta(@RequestParam Double a, @RequestParam Double b){

        Calculator calculator = new Calculator();
        calculator.setA(a);
        calculator.setB(b);

        return (a-b)+"";
    }
    @GetMapping("/divicion")
    public String getDivicion(@RequestParam Double a, @RequestParam Double b){

        Calculator calculator = new Calculator();
        calculator.setA(a);
        calculator.setB(b);

        return (a/b)+"";
    }
    @GetMapping("/multiplicacion")
    public String getMultiplicacion(@RequestParam Double a, @RequestParam Double b){

        Calculator calculator = new Calculator();
        calculator.setA(a);
        calculator.setB(b);

        return (a*b)+"";
    }

}
