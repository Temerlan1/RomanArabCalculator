package CalculatorForKata;

import java.util.Scanner;

public class Rim111 {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();

    String[] strings = str.split(" ");

    String s1 = strings[0];
    String s2 = strings[1];
    String s3 = strings[2];

    int rim() {
        int resul;
        if (s1.equals("I")) {
            //int resul;
            return resul = 1;
        } else if (s1.equals("II")) {
            return resul = 2;
        } else if (s1.equals("III")) {
            return resul = 3;
        } else if (s1.equals("IV")) {
            System.out.println("22");
            return resul = 4;
        } else if (s1.equals("V")) {
            return resul = 5;
        } else if (s1.equals("VI")) {
            return resul = 6;
        } else if (s1.equals("VII")) {
            return resul = 7;
        } else if (s1.equals("VIII")) {
            return resul = 8;
        } else if (s1.equals("IX")) {
            return resul = 9;
        } else if (s1.equals("X")) {
            return resul = 10;
        } else {
            System.out.println("Первое число должно варьироваться от I до X!");
        }
        return resul = +0;
    }

    int rim2() {
        int resul;
        if (s3.equals("I")) {
            //int resul;
            return resul = 1;
        } else if (s3.equals("II")) {
            return resul = 2;
        } else if (s3.equals("III")) {
            return resul = 3;
        } else if (s3.equals("IV")) {
            System.out.println("22");
            return resul = 4;
        } else if (s3.equals("V")) {
            return resul = 5;
        } else if (s3.equals("VI")) {
            return resul = 6;
        } else if (s3.equals("VII")) {
            return resul = 7;
        } else if (s3.equals("VIII")) {
            return resul = 8;
        } else if (s3.equals("IX")) {
            return resul = 9;
        } else if (s3.equals("X")) {
            return resul = 10;
        } else {
            System.out.println("Второе число должно варьироваться от I до X!");
        }
        return resul = +0;
    }

    void rimCalculated() {
        if (s2.equals("+")) {
            int result = rim() + rim2();
            if (result == 1) {
                System.out.println("I");
            } else if (result == 2) {
                System.out.println("II");
            } else if (result == 3) {
                System.out.println("III");
            } else if (result == 4) {
                System.out.println("IV");
            } else if (result == 5) {
                System.out.println("V");
            } else if (result == 6) {
                System.out.println("VI");
            } else if (result == 7) {
                System.out.println("VII");
            } else if (result == 8) {
                System.out.println("VIII");
            } else if (result == 9) {
                System.out.println("IX");
            } else if (result == 10) {
                System.out.println("X");
            } else if (result == 11) {
                System.out.println("XI");
            } else if (result == 12) {
                System.out.println("XII");
            } else if (result == 13) {
                System.out.println("XIII");
            } else if (result == 14) {
                System.out.println("XIV");
            } else if (result == 15) {
                System.out.println("XV");
            } else if (result == 16) {
                System.out.println("XVI");
            } else if (result == 17) {
                System.out.println("XVII");
            } else if (result == 18) {
                System.out.println("XVIII");
            } else if (result == 19) {
                System.out.println("XIX");
            } else if (result == 20) {
                System.out.println("XX");
            } else if (result == 21) {
                System.out.println("XXI");
            } else if (result == 22) {
                System.out.println("XXII");
            } else if (result == 23) {
                System.out.println("XXIII");
            } else if (result == 24) {
                System.out.println("XXIV");
            } else if (result == 25) {
                System.out.println("XXV");
            } else if (result == 26) {
                System.out.println("XXVI");
            } else if (result == 27) {
                System.out.println("XXVII");
            } else if (result == 28) {
                System.out.println("XXVIII");
            } else if (result == 29) {
                System.out.println("XXIX");
            } else if (result == 30) {
                System.out.println("XXX");
            } else if (result == 31) {
                System.out.println("XXXI");
            } else if (result == 32) {
                System.out.println("XXXII");
            }
            //System.out.println(rim()+rim2());
        } else if (s2.equals("-")) {
            int result = rim() - rim2();
            if (result == 0) {
                System.out.println("0");
            } else if (result == 1) {
                System.out.println("I");
            } else if (result == 2) {
                System.out.println("II");
            } else if (result == 3) {
                System.out.println("III");
            } else if (result == 4) {
                System.out.println("IV");
            } else if (result == 5) {
                System.out.println("V");
            } else if (result == 6) {
                System.out.println("VI");
            } else if (result == 7) {
                System.out.println("VII");
            } else if (result == 8) {
                System.out.println("VIII");
            } else if (result == 9) {
                System.out.println("IX");
            } else if (result == 10) {
                System.out.println("X");
            } else if (result == 11) {
                System.out.println("XI");
            } else if (result == 12) {
                System.out.println("XII");
            } else if (result == 13) {
                System.out.println("XIII");
            } else if (result == 14) {
                System.out.println("XIV");
            } else if (result == 15) {
                System.out.println("XV");
            } else if (result == 16) {
                System.out.println("XVI");
            } else if (result == 17) {
                System.out.println("XVII");
            } else if (result == 18) {
                System.out.println("XVIII");
            } else if (result == 19) {
                System.out.println("XIX");
            } else if (result == 20) {
                System.out.println("XX");
            } else if (result == 21) {
                System.out.println("XXI");
            } else if (result == 22) {
                System.out.println("XXII");
            } else if (result == 23) {
                System.out.println("XXIII");
            } else if (result == 24) {
                System.out.println("XXIV");
            } else if (result == 25) {
                System.out.println("XXV");
            } else if (result == 26) {
                System.out.println("XXVI");
            } else if (result == 27) {
                System.out.println("XXVII");
            } else if (result == 28) {
                System.out.println("XXVIII");
            } else if (result == 29) {
                System.out.println("XXIX");
            } else if (result == 30) {
                System.out.println("XXX");
            } else if (result == 31) {
                System.out.println("XXXI");
            } else if (result == 32) {
                System.out.println("XXXII");
            } else if (result == 33) {
                System.out.println("XXXIII");
            } else if (result == 34) {
                System.out.println("XXXIV");
            } else if (result == 35) {
                System.out.println("XXXV");
            } else if (result == 36) {
                System.out.println("XXXVI");
            } else if (result == 37) {
                System.out.println("XXXVII");
            } else if (result == 38) {
                System.out.println("XXXVIII");
            } else if (result == 39) {
                System.out.println("XXXIX");
            } else if (result == 40) {
                System.out.println("XL");
            } else if (result == 41) {
                System.out.println("XLI");
            } else if (result == 42) {
                System.out.println("XLII");
            } else if (result == 43) {
                System.out.println("XLIII");
            } else if (result == 44) {
                System.out.println("XLIV");
            } else if (result == 45) {
                System.out.println("XLV");
            } else if (result == 46) {
                System.out.println("XLVI");
            } else if (result == 47) {
                System.out.println("XLVII");
            } else if (result == 48) {
                System.out.println("XLVIII");
            } else if (result == 49) {
                System.out.println("XLIX");
            } else if (result == 50) {
                System.out.println("L");
            } else if (result == 51) {
                System.out.println("LI");
            } else if (result == 52) {
                System.out.println("LII");
            } else if (result == 53) {
                System.out.println("LIII");
            } else if (result == 54) {
                System.out.println("LIV");
            } else if (result == 55) {
                System.out.println("LV");
            } else if (result == 56) {
                System.out.println("LVI");
            } else if (result == 57) {
                System.out.println("LVII");
            } else if (result == 58) {
                System.out.println("LVIII");
            } else if (result == 59) {
                System.out.println("LIX");
            } else if (result == 60) {
                System.out.println("LX");
            } else if (result == 61) {
                System.out.println("LXI");
            } else if (result == 62) {
                System.out.println("LXII");
            } else if (result == 63) {
                System.out.println("LXIII");
            } else if (result == 64) {
                System.out.println("LXIV");
            } else if (result == 65) {
                System.out.println("LXV");
            } else if (result == 66) {
                System.out.println("LXVI");
            } else if (result == 67) {
                System.out.println("LXVII");
            } else if (result == 68) {
                System.out.println("LXVIII");
            } else if (result == 69) {
                System.out.println("LXIX");
            } else if (result == 70) {
                System.out.println("LXX");
            } else if (result == 71) {
                System.out.println("LXXI");
            } else if (result == 72) {
                System.out.println("LXXII");
            } else if (result == 73) {
                System.out.println("LXXIII");
            } else if (result == 74) {
                System.out.println("LXXIV");
            } else if (result == 75) {
                System.out.println("LXXV");
            } else if (result == 76) {
                System.out.println("LXXVI");
            } else if (result == 77) {
                System.out.println("LXXVII");
            } else if (result == 78) {
                System.out.println("LXXVIII");
            } else if (result == 79) {
                System.out.println("LXXIX");
            } else if (result == 80) {
                System.out.println("LXXX");
            } else if (result == 81) {
                System.out.println("LXXXI");
            } else if (result == 82) {
                System.out.println("LXXXII");
            } else if (result == 83) {
                System.out.println("LXXXIII");
            } else if (result == 84) {
                System.out.println("LXXXIV");
            } else if (result == 85) {
                System.out.println("LXXXV");
            } else if (result == 86) {
                System.out.println("LXXXVI");
            } else if (result == 87) {
                System.out.println("LXXXVII");
            } else if (result == 88) {
                System.out.println("LXXXVIII");
            } else if (result == 89) {
                System.out.println("LXXXIX");
            } else if (result == 90) {
                System.out.println("XC");
            } else if (result == 91) {
                System.out.println("XCI");
            } else if (result == 92) {
                System.out.println("XCII");
            } else if (result == 93) {
                System.out.println("XCIII");
            } else if (result == 94) {
                System.out.println("XCIV");
            } else if (result == 95) {
                System.out.println("XCV");
            } else if (result == 96) {
                System.out.println("XCVI");
            } else if (result == 97) {
                System.out.println("XCVII");
            } else if (result == 98) {
                System.out.println("XCVIII");
            } else if (result == 99) {
                System.out.println("XCIX");
            } else if (result == 100) {
                System.out.println("C");
            }
            //System.out.println(rim()-rim2());
        } else if (s2.equals("*")) {
            int result = rim() * rim2();
            if (result == 1) {
                System.out.println("I");
            } else if (result == 2) {
                System.out.println("II");
            } else if (result == 3) {
                System.out.println("III");
            } else if (result == 4) {
                System.out.println("IV");
            } else if (result == 5) {
                System.out.println("V");
            } else if (result == 6) {
                System.out.println("VI");
            } else if (result == 7) {
                System.out.println("VII");
            } else if (result == 8) {
                System.out.println("VIII");
            } else if (result == 9) {
                System.out.println("IX");
            } else if (result == 10) {
                System.out.println("X");
            } else if (result == 11) {
                System.out.println("XI");
            } else if (result == 12) {
                System.out.println("XII");
            } else if (result == 13) {
                System.out.println("XIII");
            } else if (result == 14) {
                System.out.println("XIV");
            } else if (result == 15) {
                System.out.println("XV");
            } else if (result == 16) {
                System.out.println("XVI");
            } else if (result == 17) {
                System.out.println("XVII");
            } else if (result == 18) {
                System.out.println("XVIII");
            } else if (result == 19) {
                System.out.println("XIX");
            } else if (result == 20) {
                System.out.println("XX");
            } else if (result == 21) {
                System.out.println("XXI");
            } else if (result == 22) {
                System.out.println("XXII");
            } else if (result == 23) {
                System.out.println("XXIII");
            } else if (result == 24) {
                System.out.println("XXIV");
            } else if (result == 25) {
                System.out.println("XXV");
            } else if (result == 26) {
                System.out.println("XXVI");
            } else if (result == 27) {
                System.out.println("XXVII");
            } else if (result == 28) {
                System.out.println("XXVIII");
            } else if (result == 29) {
                System.out.println("XXIX");
            } else if (result == 30) {
                System.out.println("XXX");
            } else if (result == 31) {
                System.out.println("XXXI");
            } else if (result == 32) {
                System.out.println("XXXII");
            } else if (result == 33) {
                System.out.println("XXXIII");
            } else if (result == 34) {
                System.out.println("XXXIV");
            } else if (result == 35) {
                System.out.println("XXXV");
            } else if (result == 36) {
                System.out.println("XXXVI");
            } else if (result == 37) {
                System.out.println("XXXVII");
            } else if (result == 38) {
                System.out.println("XXXVIII");
            } else if (result == 39) {
                System.out.println("XXXIX");
            } else if (result == 40) {
                System.out.println("XL");
            } else if (result == 41) {
                System.out.println("XLI");
            } else if (result == 42) {
                System.out.println("XLII");
            } else if (result == 43) {
                System.out.println("XLIII");
            } else if (result == 44) {
                System.out.println("XLIV");
            } else if (result == 45) {
                System.out.println("XLV");
            } else if (result == 46) {
                System.out.println("XLVI");
            } else if (result == 47) {
                System.out.println("XLVII");
            } else if (result == 48) {
                System.out.println("XLVIII");
            } else if (result == 49) {
                System.out.println("XLIX");
            } else if (result == 50) {
                System.out.println("L");
            } else if (result == 51) {
                System.out.println("LI");
            } else if (result == 52) {
                System.out.println("LII");
            } else if (result == 53) {
                System.out.println("LIII");
            } else if (result == 54) {
                System.out.println("LIV");
            } else if (result == 55) {
                System.out.println("LV");
            } else if (result == 56) {
                System.out.println("LVI");
            } else if (result == 57) {
                System.out.println("LVII");
            } else if (result == 58) {
                System.out.println("LVIII");
            } else if (result == 59) {
                System.out.println("LIX");
            } else if (result == 60) {
                System.out.println("LX");
            } else if (result == 61) {
                System.out.println("LXI");
            } else if (result == 62) {
                System.out.println("LXII");
            } else if (result == 63) {
                System.out.println("LXIII");
            } else if (result == 64) {
                System.out.println("LXIV");
            } else if (result == 65) {
                System.out.println("LXV");
            } else if (result == 66) {
                System.out.println("LXVI");
            } else if (result == 67) {
                System.out.println("LXVII");
            } else if (result == 68) {
                System.out.println("LXVIII");
            } else if (result == 69) {
                System.out.println("LXIX");
            } else if (result == 70) {
                System.out.println("LXX");
            } else if (result == 71) {
                System.out.println("LXXI");
            } else if (result == 72) {
                System.out.println("LXXII");
            } else if (result == 73) {
                System.out.println("LXXIII");
            } else if (result == 74) {
                System.out.println("LXXIV");
            } else if (result == 75) {
                System.out.println("LXXV");
            } else if (result == 76) {
                System.out.println("LXXVI");
            } else if (result == 77) {
                System.out.println("LXXVII");
            } else if (result == 78) {
                System.out.println("LXXVIII");
            } else if (result == 79) {
                System.out.println("LXXIX");
            } else if (result == 80) {
                System.out.println("LXXX");
            } else if (result == 81) {
                System.out.println("LXXXI");
            } else if (result == 82) {
                System.out.println("LXXXII");
            } else if (result == 83) {
                System.out.println("LXXXIII");
            } else if (result == 84) {
                System.out.println("LXXXIV");
            } else if (result == 85) {
                System.out.println("LXXXV");
            } else if (result == 86) {
                System.out.println("LXXXVI");
            } else if (result == 87) {
                System.out.println("LXXXVII");
            } else if (result == 88) {
                System.out.println("LXXXVIII");
            } else if (result == 89) {
                System.out.println("LXXXIX");
            } else if (result == 90) {
                System.out.println("XC");
            } else if (result == 91) {
                System.out.println("XCI");
            } else if (result == 92) {
                System.out.println("XCII");
            } else if (result == 93) {
                System.out.println("XCIII");
            } else if (result == 94) {
                System.out.println("XCIV");
            } else if (result == 95) {
                System.out.println("XCV");
            } else if (result == 96) {
                System.out.println("XCVI");
            } else if (result == 97) {
                System.out.println("XCVII");
            } else if (result == 98) {
                System.out.println("XCVIII");
            } else if (result == 99) {
                System.out.println("XCIX");
            } else if (result == 100) {
                System.out.println("C");
            }
            //System.out.println(rim()*rim2());
        } else if (s2.equals("/")) {
            int result = rim() / rim2();
            if (result == 1) {
                System.out.println("I");
            } else if (result == 2) {
                System.out.println("II");
            } else if (result == 3) {
                System.out.println("III");
            } else if (result == 4) {
                System.out.println("IV");
            } else if (result == 5) {
                System.out.println("V");
            } else if (result == 6) {
                System.out.println("VI");
            } else if (result == 7) {
                System.out.println("VII");
            } else if (result == 8) {
                System.out.println("VIII");
            } else if (result == 9) {
                System.out.println("IX");
            } else if (result == 10) {
                System.out.println("X");
            } else if (result == 11) {
                System.out.println("XI");
            } else if (result == 12) {
                System.out.println("XII");
            } else if (result == 13) {
                System.out.println("XIII");
            } else if (result == 14) {
                System.out.println("XIV");
            } else if (result == 15) {
                System.out.println("XV");
            } else if (result == 16) {
                System.out.println("XVI");
            } else if (result == 17) {
                System.out.println("XVII");
            } else if (result == 18) {
                System.out.println("XVIII");
            } else if (result == 19) {
                System.out.println("XIX");
            } else if (result == 20) {
                System.out.println("XX");
            } else if (result == 21) {
                System.out.println("XXI");
            } else if (result == 22) {
                System.out.println("XXII");
            } else if (result == 23) {
                System.out.println("XXIII");
            } else if (result == 24) {
                System.out.println("XXIV");
            } else if (result == 25) {
                System.out.println("XXV");
            } else if (result == 26) {
                System.out.println("XXVI");
            } else if (result == 27) {
                System.out.println("XXVII");
            } else if (result == 28) {
                System.out.println("XXVIII");
            } else if (result == 29) {
                System.out.println("XXIX");
            } else if (result == 30) {
                System.out.println("XXX");
            } else if (result == 31) {
                System.out.println("XXXI");
            } else if (result == 32) {
                System.out.println("XXXII");
            } else if (result == 33) {
                System.out.println("XXXIII");
            } else if (result == 34) {
                System.out.println("XXXIV");
            } else if (result == 35) {
                System.out.println("XXXV");
            } else if (result == 36) {
                System.out.println("XXXVI");
            } else if (result == 37) {
                System.out.println("XXXVII");
            } else if (result == 38) {
                System.out.println("XXXVIII");
            } else if (result == 39) {
                System.out.println("XXXIX");
            } else if (result == 40) {
                System.out.println("XL");
            } else if (result == 41) {
                System.out.println("XLI");
            } else if (result == 42) {
                System.out.println("XLII");
            } else if (result == 43) {
                System.out.println("XLIII");
            } else if (result == 44) {
                System.out.println("XLIV");
            } else if (result == 45) {
                System.out.println("XLV");
            } else if (result == 46) {
                System.out.println("XLVI");
            } else if (result == 47) {
                System.out.println("XLVII");
            } else if (result == 48) {
                System.out.println("XLVIII");
            } else if (result == 49) {
                System.out.println("XLIX");
            } else if (result == 50) {
                System.out.println("L");
            } else if (result == 51) {
                System.out.println("LI");
            } else if (result == 52) {
                System.out.println("LII");
            } else if (result == 53) {
                System.out.println("LIII");
            } else if (result == 54) {
                System.out.println("LIV");
            } else if (result == 55) {
                System.out.println("LV");
            } else if (result == 56) {
                System.out.println("LVI");
            } else if (result == 57) {
                System.out.println("LVII");
            } else if (result == 58) {
                System.out.println("LVIII");
            } else if (result == 59) {
                System.out.println("LIX");
            } else if (result == 60) {
                System.out.println("LX");
            } else if (result == 61) {
                System.out.println("LXI");
            } else if (result == 62) {
                System.out.println("LXII");
            } else if (result == 63) {
                System.out.println("LXIII");
            } else if (result == 64) {
                System.out.println("LXIV");
            } else if (result == 65) {
                System.out.println("LXV");
            } else if (result == 66) {
                System.out.println("LXVI");
            } else if (result == 67) {
                System.out.println("LXVII");
            } else if (result == 68) {
                System.out.println("LXVIII");
            } else if (result == 69) {
                System.out.println("LXIX");
            } else if (result == 70) {
                System.out.println("LXX");
            } else if (result == 71) {
                System.out.println("LXXI");
            } else if (result == 72) {
                System.out.println("LXXII");
            } else if (result == 73) {
                System.out.println("LXXIII");
            } else if (result == 74) {
                System.out.println("LXXIV");
            } else if (result == 75) {
                System.out.println("LXXV");
            } else if (result == 76) {
                System.out.println("LXXVI");
            } else if (result == 77) {
                System.out.println("LXXVII");
            } else if (result == 78) {
                System.out.println("LXXVIII");
            } else if (result == 79) {
                System.out.println("LXXIX");
            } else if (result == 80) {
                System.out.println("LXXX");
            } else if (result == 81) {
                System.out.println("LXXXI");
            } else if (result == 82) {
                System.out.println("LXXXII");
            } else if (result == 83) {
                System.out.println("LXXXIII");
            } else if (result == 84) {
                System.out.println("LXXXIV");
            } else if (result == 85) {
                System.out.println("LXXXV");
            } else if (result == 86) {
                System.out.println("LXXXVI");
            } else if (result == 87) {
                System.out.println("LXXXVII");
            } else if (result == 88) {
                System.out.println("LXXXVIII");
            } else if (result == 89) {
                System.out.println("LXXXIX");
            } else if (result == 90) {
                System.out.println("XC");
            } else if (result == 91) {
                System.out.println("XCI");
            } else if (result == 92) {
                System.out.println("XCII");
            } else if (result == 93) {
                System.out.println("XCIII");
            } else if (result == 94) {
                System.out.println("XCIV");
            } else if (result == 95) {
                System.out.println("XCV");
            } else if (result == 96) {
                System.out.println("XCVI");
            } else if (result == 97) {
                System.out.println("XCVII");
            } else if (result == 98) {
                System.out.println("XCVIII");
            } else if (result == 99) {
                System.out.println("XCIX");
            } else if (result == 100) {
                System.out.println("C");
            } else {
                System.out.println("Невеный ввод данных");
            }
            //System.out.println(rim()/rim2());
        }
    }

    public static void main(String[] args) {

        System.out.println("Введите выражение из двух арабских или римских чисел от 1 до 10 используя пробелы + Enter ");
        Rim111 r=new Rim111();

        String s1 = r.s1;
        String s2 = r.s2;
        String s3 = r.s3;





        if ((s1.equals("I") || s1.equals("II") || s1.equals("III") || s1.equals("IV") || s1.equals("V") || s1.equals("VI") || s1.equals("VII") || s1.equals("VIII") || s1.equals("IX") || s1.equals("X")) && (s3.equals("I") || s3.equals("II") || s3.equals("III") || s3.equals("IV") || s3.equals("V") || s3.equals("VI") || s3.equals("VII") || s3.equals("VIII") || s3.equals("IX") || s3.equals("X"))) {
        r.rimCalculated();
        }else {
            try {
                int a = Integer.parseInt(s1);
                int b = Integer.parseInt(s3);


                if (a >= 1 && a < 11 && b >= 1 && b < 11) {
                    switch (s2) {
                        case "+":
                            System.out.println(a + b);
                            break;
                        case "-":
                            System.out.println(a - b);
                            break;
                        case "*":
                            System.out.println(a * b);
                            break;
                        case "/":
                            System.out.println(a / b);
                            break;
                        default:
                            System.out.println("Неверный знак операции!");
                            break;
                    }
                } else {
                    System.out.println("Числа могут варьироваться от 1 до 10!");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Используйте пробелы");
            }
        }
    }
}
