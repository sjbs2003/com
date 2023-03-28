package com.linear4;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums  ={12,234,3456,34567,1,88};
        //System.out.println(findNumbers(nums));

        System.out.println(digits(123654));

        System.out.println(digits2(123654));
    }

    static int findNumbers(int[] nums) {
        int count =0;
        for(int num : nums){
            if(even(num)){
             count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int NumberOfDigits = digits(num);
        return NumberOfDigits % 2 == 0;
    }

    static int digits2(int num){
        return (int)(Math.log10(num)) +1;
    }

    static int digits(int num) {
        if(num < 0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
        int count = 0;
        while (num > 0){
            count++;
            num = num/10; // num/=10
        }
        return count;
    }

}
