package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();

        String rozmiar = JOptionPane.showInputDialog("Podaj rozmiar listy");
        int size = Integer.parseInt(rozmiar);


        Random generator = new Random();

        for (int i = 0; i < size; i++) {

            numbers.add(generator.nextInt(99));

        }
        System.out.println("Wygenerowane liczby to: ");
        System.out.println(numbers);

        for (int i = 0; i < size; i++) {

            int rest = numbers.get(i) % 2;
            if (rest == 0) {
                oddNumbers.add(numbers.get(i));

            } else {
                evenNumbers.add(numbers.get(i));

            }


        }
        System.out.println("Liczby parzyste z listy to: ");
        System.out.println(oddNumbers);
        System.out.println("Liczby nieparzyste z listy to: ");
        System.out.println(evenNumbers);
    }
}
