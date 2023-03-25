package com.example.Satoaki.Service;

import com.example.Satoaki.Entity.AddElements;
import com.example.Satoaki.Entity.Elements;
import com.example.Satoaki.Entity.MulElements;
import com.example.Satoaki.Entity.SubElements;
import com.example.Satoaki.Repository.AddElementsRepository;
import com.example.Satoaki.Repository.ElementsRespository;
import com.example.Satoaki.Repository.MulElementsRepository;
import com.example.Satoaki.Repository.SubElementsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SatoakiService {
    private final ElementsRespository elementsRespository;
    private final AddElementsRepository addElementsRepository;
    private final SubElementsRepository subElementsRepository;
    private final MulElementsRepository mulElementsRepository;

    public double getSum(double a, double b){
        double result = a + b;

        save(a, b, "add", result);

        return result;
    }

    public double getGap(double a, double b){
        double result = a - b;

        save(a, b, "subtract", result);

        return result;
    }

    public double getPro(double a, double b){
        double result = a * b;

        save(a, b, "multiply", result);

        return result;
    }

    public double getQuo(double a, double b){
        double result = a / b;

        save(a, b, "divide", result);

        return result;
    }

    private void save(double a, double b, String type, double result){
        Elements elements = new Elements(0, a, b, type, result);
        elementsRespository.save(elements);
    }
}
