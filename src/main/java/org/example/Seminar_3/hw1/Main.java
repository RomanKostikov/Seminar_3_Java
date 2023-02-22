package org.example.Seminar_3.hw1;

import org.example.Seminar_3.hw1.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го или 2го сорта среди товаров,
 * название которых содержит «высший».
 */
public class Main {
    public static void main(String[] args) {
        Product pr1 = new Product("Сыр высший пробы", 300, 1);
        Product pr2 = new Product("Творог", 150, 2);
        Product pr3 = new Product("Рыба не высший пробы", 1500, 3);
        Product pr4 = new Product("Мясо высший пробы", 2000, 1);
        Product pr5 = new Product("Сметана", 250, 1);
        Product pr6 = new Product("Сливки высший пробы", 1000, 1);

        List<Product> allProducts = List.of(pr1, pr2, pr3, pr4, pr5, pr6);
        List<Product> result = new ArrayList<>();
        for (Product prod : allProducts) {
            if ((prod.getGrade() == 1 || prod.getGrade() == 2)
                    && prod.getNameProduct().toLowerCase().contains("высший")) {
                if (result.isEmpty()) result.add(prod);
                else {
                    if (prod.getPrice() > result.get(0).getPrice()) {
                        result.clear();
                        result.add(prod);
                    } else if (prod.getPrice().equals(result.get(0).getPrice())) {
                        result.add(prod);
                    }
                }
            }
        }
        for (Product prod : result) {
            System.out.printf("\"%s\" стоит(ят) %d у.е.%n", prod.getNameProduct(), prod.getPrice());
        }
    }
}
