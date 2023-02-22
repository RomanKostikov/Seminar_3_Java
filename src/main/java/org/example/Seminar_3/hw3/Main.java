package org.example.Seminar_3.hw3;

import org.example.Seminar_3.hw3.model.BookInfo;

import java.util.List;

/**
 * Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
 * Найти названия книг, в которых простое количество страниц,
 * фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */
public class Main {
    public static void main(String[] args) {

        BookInfo b1 = new BookInfo("Медведь", "Карпин", 600, 2011, 191);
        BookInfo b2 = new BookInfo("Алиса", "Путилов", 700, 2022, 466);
        BookInfo b3 = new BookInfo("Новый свет", "Куприн", 500, 2012, 466);
        BookInfo b4 = new BookInfo("Алхимия", "Сегун", 800, 1976, 210);
        BookInfo b5 = new BookInfo("Шапка", "Матвеев", 900, 2013, 199);

        List<BookInfo> books = List.of(b1, b2, b3, b4, b5);
        for (BookInfo BookInfo : books) {
            if (isPrimeNumber(BookInfo.getPages())
                    && BookInfo.getAuthor().toLowerCase().contains("а")
                    && BookInfo.getYear() >= 2010) {
                System.out.printf("\"%s\", автор - %s, цена %d, год %d, страниц %d%n",
                        BookInfo.getNameBook(), BookInfo.getAuthor(), BookInfo.getPrice(), BookInfo.getYear(), BookInfo.getPages());
            }
        }
    }

    public static boolean isPrimeNumber(int num) {
        if (num > 0) {
            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
