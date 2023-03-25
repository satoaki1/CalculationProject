package com.example.Satoaki.Controller;

import com.example.Satoaki.Service.SatoakiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class DemoController {
    private final SatoakiService satoakiService;

    @GetMapping(path = "/calc/{type}")
    public String getResult(@RequestParam double a, @RequestParam double b, @PathVariable String type) {
        double result = 0;
        String symbol = "";

        switch (type){
            case "add":
                result = satoakiService.getSum(a, b);
                symbol = " + ";
                break;
            case "subtract":
                result = satoakiService.getGap(a, b);
                symbol = " - ";
                break;
            case "multiply":
                result = satoakiService.getPro(a, b);
                symbol = " * ";
                break;
            case "divide":
                result = satoakiService.getQuo(a, b);
                symbol = " / ";
                break;
            default:
                result = 0;
        }

        double result2 = Math.round(result * 100.0) / 100.0;
        return a + symbol + b + " = " + result2; // a + b = result, resultは小数点２桁まで
    }
}
