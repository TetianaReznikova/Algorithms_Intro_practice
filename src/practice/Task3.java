package practice;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int[] ticketsNum = {4568, 2584, 8456, 5623, 8541, 9852};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of your ticket ");
        int winningTick = sc.nextInt();
        int idx = -1;
        for (int i = 0; i < ticketsNum.length; i++) {
            if (ticketsNum[i] == winningTick)
                idx = 1;
        }
        if (idx == -1)
            System.out.print("You lose");
        else
            System.out.print("You're winner!!!");
    }

}
