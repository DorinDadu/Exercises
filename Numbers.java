package Homework;


import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {


        //Exercitiul1();
        //Exercitiul2();
        //Exercitiul3();
        //Exercitiul4();
    }

    public static void Exercitiul1(){


        Scanner scan = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;

        System.out.println("Enter First Number");
        number1= scan.nextInt();
        System.out.println("Enter second number");
        number2= scan.nextInt();
        if (number1>=number2)
            System.out.println(number1);
        else
            System.out.println(number2);
    }

    public static void Exercitiul2(){
        Scanner scan = new Scanner(System.in);
        int grade = 0;
        System.out.println("Enter grade");
        grade= scan.nextInt();
        if (grade<=25)
            System.out.println("F");
        if (grade>25 && grade<=45)
            System.out.println("E");
        if (grade>45 && grade<=50)
            System.out.println("D");
        if (grade>50 && grade<=60)
            System.out.println("C");
        if (grade>60 && grade<=80)
            System.out.println("B");
        if (grade>80)
            System.out.println("A");

    }

    public static void Exercitiul3(){

        Scanner scan = new Scanner(System.in);
        int price=100;
        int totalprice=0;
        int quantity=0;
        int discount=10;
        int discount1=100-discount;
        System.out.println("Enter quantity");
        quantity= scan.nextInt();
        totalprice=price * quantity;
        if (totalprice<=1000)
            System.out.println(totalprice);
        else
            System.out.println((totalprice*discount1)/100);

    }

    public static void Exercitiul4() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a name");
        String name= scan.nextLine();
        if (name.contains("Bond")) {
            System.out.println("Welcome on board 007");
        }
        else {
            System.out.println("Good morning " + name);
        }
    }

    }







