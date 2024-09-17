package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int number) {
        int myNumber = Math.abs(number);
        int reversed = 0;
        int temp = myNumber;

        while (temp>0) {
            int lastDigit = temp%10;
            reversed = reversed*10+lastDigit;
            //temp = temp/10;
            temp /=10;
        }
        return myNumber == reversed;
    }


    public static boolean isPerfectNumber(int number){
        if(number<0) {
            return false;
        }
        int sum = 0;
        for (int i=1; i<number; i++) {
            if (number%i == 0) {
                sum += i;
            }
        }
        return sum==number;
    }



    public static String numberToWords(int num) {
        if (num<0) {
            return "Invalid Value";
        }
        String numStr = String.valueOf(num);
        char[] numbers = numStr.toCharArray();
        String outputStr = "";
        for (char number : numbers) {
            switch (number) {
                case '0':
                    outputStr += "Zero ";
                    break;
                case '1':
                    outputStr += "One ";
                    break;
                case '2':
                    outputStr += "Two ";
                    break;
                case '3':
                    outputStr += "Three ";
                    break;
                case '4':
                    outputStr += "Four ";
                    break;
                case '5':
                    outputStr += "Five ";
                    break;
                case '6':
                    outputStr += "Six ";
                    break;
                case '7':
                    outputStr += "Seven ";
                    break;
                case '8':
                    outputStr += "Eight ";
                    break;
                case '9':
                    outputStr += "Nine ";
                    break;
            }
        }
        return outputStr.trim();
    }
}
