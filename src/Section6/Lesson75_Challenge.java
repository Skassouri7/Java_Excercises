package Section6;

import java.util.Scanner;

public class Lesson75_Challenge {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        double number = 0;
//        double min = 0;
//        double max = 0;
//
//        boolean isNumber = true;
//
//        while (isNumber){
//
//            try{
//                number = Double.parseDouble(sc.nextLine());
//
//                if (min == 0){
//                   min = number;
//                }
//
//                if (number > max){
//                    max = number;
//                } else if (number < min) {
//                    min = number;
//                }
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid Input!");
//                isNumber = false;
//            }
//        }
//
//        System.out.println("Minimum Number: " + min);
//        System.out.println("Maximum Number: " + max);

        //inputThenPrintAndAverage();

        System.out.println(getBucketCount(7.25, 4.3, 2.35));
    }

    public static void inputThenPrintAndAverage(){
        Scanner sc = new Scanner(System.in);

        long sum = 1;
        long avg = 1;
        int loopCount = 0;

        while (loopCount >= 0){

            try{
                System.out.println("Type your number, or a character to exit.");
                sum += Math.round(Double.parseDouble(sc.nextLine()));
                loopCount++;
                System.out.println(loopCount);
            } catch (NumberFormatException nfe){
                try{
                    avg = sum / loopCount;
                } catch (ArithmeticException ae){
                    avg = 0;
                }

                System.out.println("SUM = " + sum + " AVG = " + avg);
            }
        }
    }

    public static int getBucketCount(double width, double height, double areaOfBucket, int extraBuckets){
        if (width < 0 || height < 0 || areaOfBucket < 0 || extraBuckets < 0){
            return -1;
        }

        double areaOfWall = width * height;
        int numOfBuckets = (int) Math.ceil(areaOfWall / areaOfBucket);

        return numOfBuckets - extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaOfBucket){
        if (width < 0 || height < 0 || areaOfBucket < 0){
            return -1;
        }

        double areaOfWall = width * height;
        int numOfBuckets = (int) Math.ceil(areaOfWall / areaOfBucket);

        return numOfBuckets;
    }

    public static int getBucketCount(double area, double areaOfBucket){
        if (area < 0 || areaOfBucket < 0){
            return -1;
        }

        int numOfBuckets = (int) Math.ceil(area / areaOfBucket);

        return numOfBuckets;
    }


}
