package com.technews;

public class VariablesPractice {
    public static void main(String[] args) {

        // 1) Create two variables—one int and one double.
        // 1.a) Add them together to find the sum, and store the result as a variable called sum. What type is sum?
        int age = 2016 + 69;
        double price = 1999.99;
        double sum = age + price;

        // 2) Create a String variable. Add it to your int and store the result as a variable. What type is it?
        String name = "Cleopatra";
        String concat = name + " " + age;

        System.out.println(sum);
        System.out.println(concat);
    }
}

//    Is sum a whole number or a decimal value?
//        Decimal value, as b is a decimal value.

//    Now compare these results to JavaScript. What happens when we add a string and a number together in JavaScript?
//
//        The string and number will be concatenated (as in 4 + cat = 4cat). See the following code block for an example:Ω
