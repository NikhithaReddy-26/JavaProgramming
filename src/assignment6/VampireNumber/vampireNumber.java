package assignment6.VampireNumber;

import java.util.Scanner;
public class vampireNumber {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of vampire numbers to generate: ");
            int count = sc.nextInt();
//            sc.close();
            long num = 10;
            int generatedCount = 0;
            while (generatedCount < count) {
                if (isVampire(num)) {
                    System.out.println(num);
                    generatedCount++;
                }
                num++;
            }
        }

        public static boolean isVampire(long num) {
            String str = Long.toString(num);
            if (str.length() % 2 != 0) {
                return false;
            }
            for (long i = 10; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    long j = num / i;
                    if (hasSameDigits(str, Long.toString(i) + Long.toString(j))) {
                        return true;
                    }
                }
            }
            return false;
        }

        public static boolean hasSameDigits(String str1, String str2) {
            if (str1.length() != str2.length()) {
                return false;
            }
            for (int i = 0; i < str1.length(); i++) {
                char c = str1.charAt(i);
                int index = str2.indexOf(c);
                if (index == -1) {
                    return false;
                }
                str2 = str2.substring(0, index) + str2.substring(index + 1);
            }
            return true;
        }

    }
//vampire number is, the even number generated after spiliting it into two equal halves and multiplying the numberfor example
// 1260, 21*60= 1260