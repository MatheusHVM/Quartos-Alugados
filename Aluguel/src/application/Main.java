package application;

import entities.Aluguel;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluguel[] vet = new Aluguel[10];

        System.out.print("Quantos quartos voce quer alugar? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println();
            System.out.println("Aluguel #" + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Quarto: ");
            int numeroQuarto = sc.nextInt();

            vet[numeroQuarto] = new Aluguel(name, email);
        }

        System.out.println();
        System.out.println("Quartos alugados: ");
        for (int i = 0; i < 10; i++){
            if(vet[i] != null){
                System.out.println(i + ": " + vet[i]);
            }
        }

        sc.close();
    }
}