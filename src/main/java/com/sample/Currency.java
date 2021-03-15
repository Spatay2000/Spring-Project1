package com.sample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;
public class Currency  {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.sample");
        context.refresh();
        DBConnect dbConnect = context.getBean(DBConnect.class);
        dbConnect.store(new Person(1,"Spatay","Kazakh"));
        Person emp = dbConnect.retrieve(1);
        System.out.println(emp);
        context.close();
        Scanner in = new Scanner(System.in);

        Action action1  = new Action();
        int choice = 1000;
        while (choice != 0) {
            System.out.println("Please choose one of this 1-4");
            System.out.println("1.KZT to convert RUB, EUR, USD");
            System.out.println("2.RUB to convert KZT, EUR, USD");
            System.out.println("3.EUR to convert KZT, RUB , USD");
            System.out.println("4.USD to convert KZT, RUB , EUR");
            System.out.println("0.Exit");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please enter your amount:");
                    double KZT = in.nextDouble();
                    action1.Kzt(KZT);

                    break;
                case 2:
                    System.out.println("Please enter your amount:");
                    double RUB = in.nextDouble();
                    action1.Rub(RUB);

                    break;
                case 3:
                    System.out.println("Please enter your amount:");
                    double EUR = in.nextDouble();
                    action1.Eur(EUR);

                    break;
                case 4:
                    System.out.println("Please enter your amount:");
                    double USD = in.nextDouble();
                    action1.Usd(USD);

                    break;
                case 0:
                    System.out.println("Exit");
                    return;
                    default:
                        System.out.println("Error");
                        break;
            }

        }
    }
}
