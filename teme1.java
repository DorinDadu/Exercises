import java.util.*;

public class teme1 {


    public static void main(String[] args) {

        //exercitiul1();
        //exercitiul3();
        //exercitiul4();
        //exercitiul5();
        //exercitiul6();
        //exercitiul7();
        //exercitiul8();
        //exercitiul9();
        //exercitiul10();
        //exercitiul11();
        //exercitiul12();
        //exercitiul13();
        //exercitiul14();
        //exercitiul15();
        //exercitiul16();
        //exercitiul17();
        //exercitiul18();
        //exercitiul19();
        exercitiul20();
        //System.out.println(Palindrom("aba"));
        //System.out.println(Palindrom("Groot"));


    }

    public static void exercitiul1() {
        Integer numberx = 5;
        Integer numbery = 10;
        Integer suma = numberx + numbery;
        System.out.println("Suma celor doua numere este: " + suma);

    }

    public static void exercitiul2() {
        String word = "python";
        Integer number1 = 20;
        Float number2 = Float.valueOf("10");

    }

    public static void exercitiul3() {
        Integer restanta = 0;
        Double notaFinala = 10.0;
        String laborator = "Introducere in informatica";
        System.out.println(((Object) restanta).getClass().getSimpleName());
        System.out.println(((Object) notaFinala).getClass().getSimpleName());
        System.out.println(((Object) laborator).getClass().getSimpleName());
    }

    public static void exercitiul4() {

        String text = "Ana are mere";
        Integer n = 3;
        String result = text.substring(n);
        System.out.println(result);

    }

    public static void exercitiul5() {

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter first number");
        int number1 = scan.nextInt();
        System.out.println("Enter second number");
        int number2 = scan.nextInt();
        int product = number1 * number2;
        System.out.println("The product is: " + product);
    }


    public static void exercitiul6() {
        String x = "Emma is a good developer. Emma is a writer";
        String word = "Emma";
        String temp[] = x.split(" ");
        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            if (word.equals(temp[i]))
                count++;
        }


        System.out.println("The word " + word + " occurs " + count + " times in the above string");

    }

    static boolean Palindrom(String cuvant) {
        int i = 0;
        int j = cuvant.length() - 1;
        while (i < j) {
            if (cuvant.charAt(i) != cuvant.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void exercitiul7() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a string");
        String x = scan.nextLine();
        if (x.charAt(0) == x.charAt(x.length() - 1)) {
            System.out.println("true");
        } else
            System.out.println("false");
    }

    public static void exercitiul8() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Write a string");
        String x = scan.nextLine();
        char a = x.charAt(0);
        char b = x.charAt(1);
        char c = x.charAt(x.length() - 2);
        char d = x.charAt(x.length() - 1);
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(b).append(c).append(d);
        System.out.println(sb);

    }

    public static void exercitiul9() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a string");
        String x = scan.nextLine();
        int size = x.length();
        System.out.println("lenght of the string is: " + size);


    }

    public static void exercitiul10() {


        HashSet<Integer> set = new HashSet<>();

        set.add(55);
        set.add(6);
        set.add(777);
        set.add(54);
        set.add(6);
        set.add(76);
        set.add(101);
        set.add(1);
        set.add(6);
        set.add(2);
        set.add(6);
        System.out.println("Maximum value of HashSet : "
                + Collections.max(set));
        System.out.println("Minimum value of HashSet : "
                + Collections.min(set));
    }


    public static void exercitiul11() {

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(55);
        al.add(6);
        al.add(777);
        al.add(54);
        al.add(6);
        al.add(76);
        al.add(101);
        al.add(1);
        al.add(6);
        al.add(2);
        al.add(6);
        System.out.println("ArrayList before remove:");
        for (Integer var : al) {
            System.out.println(var);
        }
        al.remove(10);
        System.out.println("ArrayList After remove:");
        for (Integer var2 : al) {
            System.out.println(var2);
        }


    }


    public static void exercitiul12() {

        List<String> list1 = new ArrayList<String>();
        list1.add("Hello");
        list1.add("take");
        List<String> list2 = new ArrayList<String>();
        list2.add("Dear");
        list2.add("Sir");
        List<String> concatenated_list
                = new ArrayList<String>();
        concatenated_list.addAll(list1);
        concatenated_list.addAll(list2);

        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("Concatenated list: "
                + concatenated_list);

    }

    public static void exercitiul13() {

        List<String> giftList = new ArrayList<String>();
        giftList.add("socks");
        giftList.add("4k drone");
        giftList.add("wine");
        giftList.add("jam");
        List<String> subList = new ArrayList<String>();
        subList.add("socks");
        subList.add("tshirt");
        subList.add("pijamas");
        List<String> concatenated_list
                = new ArrayList<String>();
        concatenated_list.addAll(giftList);
        concatenated_list.addAll(subList);

        System.out.println("Gift list: " + giftList);
        System.out.println("Sub list: " + subList);
        System.out.println("Concatenated list: "
                + concatenated_list);


    }

    public static void exercitiul14() {

        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // find sum of diagonal elements
        int sum = diagonalSum(a);

        // display result
        System.out.println("Sum of diagonal elements = " + sum);
    }

    private static int diagonalSum(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j) sum += a[i][j];
            }
        }
        return sum;
    }

    private static void exercitiul15() {

        String totalMoney = "1000$";
        Integer quantity = 3;
        Double price = Double.valueOf(450);
        System.out.println("I have " + totalMoney + " so I can buy " + quantity + " football players for " + price + " dollars.");
    }

    public static void exercitiul16() {
        // a= side1;
        // b= side2;
        // e= base;
        // h= height;

        Scanner scan = new Scanner(System.in);
        System.out.println("Write a value");
        Integer e = scan.nextInt();
        System.out.println("Write second value");
        Integer h = scan.nextInt();
        double triangleArea = (e * h) / 2;
        System.out.println("Area of Triangle is: " + triangleArea);

    }


    public static void exercitiul17() {

        // a= side1=side3;
        // b= side2=side4;
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a value");
        Integer a = scan.nextInt();
        System.out.println("Write second value");
        Integer b = scan.nextInt();
        Integer rectangleArea = a * b;
        System.out.println("Area of rectangle= " + rectangleArea);
        Integer rectanglePerimeter = 2 * (a + b);
        System.out.println("Area of rectangle= " + rectanglePerimeter);

    }


    public static void exercitiul18() {

        // r= radius;

        Scanner scan = new Scanner(System.in);
        System.out.println("Write a value");
        Integer r = scan.nextInt();
        double circleArea = r * r * Math.PI;
        System.out.println("Circle area= " + circleArea);
    }

    public static void exercitiul19() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Write user name");
        String userName = scan.nextLine();
        System.out.println("Write password");
        String password = scan.nextLine();
        Integer size = password.length();
        System.out.println("The password for user " + userName + " is " + password + " and is " + size + " characters long");


    }

    public static void exercitiul20() {
        double number = 458.541315;
        float number2 = (float)number;

        System.out.println("double value:" + number);
        System.out.println("float value:" + String.format("%.2f",number2));



    }



}




