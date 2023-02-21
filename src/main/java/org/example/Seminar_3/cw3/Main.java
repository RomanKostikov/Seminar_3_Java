package org.example.Seminar_3.cw3;

import org.example.Seminar_3.cw3.model.Items;

import java.util.ArrayList;
import java.util.List;

/**
 * 3.	 Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах),
 * его цвет (красный, желтый, зеленый тд) и материал (деревянный, металлический, картонный и тд.). Найти:
 * - количество кубиков желтого цвета и их суммарный объем;
 * - количество деревянных кубиков с ребром 3 см
 */
public class Main {
    public static void main(String[] args) {
        Items items = new Items(3, "желтый", "деревянный");
        Items items2 = new Items(3, "зеленый", "металлический");
        Items items3 = new Items(4, "красный", "картонный");
        Items items4 = new Items(2, "желтый", "стальной");

        List<Items> itemsList = new ArrayList<>();
        itemsList.add(items);
        itemsList.add(items2);
        itemsList.add(items3);
        itemsList.add(items4);
        System.out.println(itemsList);

        Integer k = 0;
        Integer volume = 0;
        Integer kWood = 0;
        for (int i = 0; i < itemsList.size(); i++) {
            Items cube = itemsList.get(i);
            if (cube.getColor().equals("желтый")) {
                k++;
                volume += volumeCube(itemsList.get(i).getSize());
            }
            if ((cube.getMaterial().equals("деревянный") && (cube.getSize() == 3))) {
                kWood++;
            }
        }
        System.out.println("1 пункт: " + k + " объем " + volume);
        System.out.println("2 пункт: " + kWood);
    }

    private static Integer volumeCube(Integer size) {
        return size * size * size;
    }

}
