package com.company;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;

        List<Integer> numbers = new ArrayList<>(); // Lista wszystkich liczb
        List<Integer> evenNumbers = new ArrayList<>(); // Lista liczb parzystych
        List<Integer> oddNumbers = new ArrayList<>(); // Lista liczb nieparzystych

        String rozmiar = JOptionPane.showInputDialog("Podaj rozmiar listy");
        int size = Integer.parseInt(rozmiar); //parsuje podany string na integer

        Random generator = new Random(); // generator liczb losowych

        for (int i = 0; i < size; i++) {
            numbers.add(generator.nextInt(10));
        }
        System.out.println("Wygenerowane liczby to: " + numbers);
        System.out.println(" ");

        for (int i = 0; i < size; i++) {
            int rest = numbers.get(i) % 2;
            if (rest == 0) {
                evenNumbers.add(numbers.get(i));
            } else {
                oddNumbers.add(numbers.get(i));
            }
        }
        System.out.println("Liczby nieparzyste z listy to: " + oddNumbers);
        System.out.println("Liczby parzyste z listy to: " + evenNumbers);
        System.out.println(" ");
        System.out.print("Suma liczb nieparzystych to: ");

        for (int i = 0; i < oddNumbers.size(); i++) {
            sumOddNumbers = sumOddNumbers + oddNumbers.get(i);
        }
        System.out.println(sumOddNumbers);


        System.out.print("Suma liczb parzystych to: ");


        for (int i = 0; i < evenNumbers.size(); i++) {
            sumEvenNumbers = sumEvenNumbers + evenNumbers.get(i);
        }

        System.out.println(sumEvenNumbers);
    }
}
