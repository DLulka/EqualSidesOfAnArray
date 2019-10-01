package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(Main.findEvenIndex(new int[] {20,10,-80,10,10,15,35}));
    }

    public static int findEvenIndex(int[] arr) {
        int leftsum, rightsum, left, right, i, answer = -1;
        for(i = 0; i < arr.length; i++){
            rightsum = 0;
            leftsum = 0;
            if (i == 0){
                left = 0;
                leftsum = 0;
            }else {
                left = i-1;
                while(left >= 0){
                    leftsum = leftsum + arr[left];
                    left = left - 1;
                }
            }
            right = i+1;
            while(right < arr.length){
                rightsum = rightsum + arr[right];
                right = right + 1;
            }
            if (rightsum == leftsum)
                answer = i;
        }
        return answer;
    }
}
