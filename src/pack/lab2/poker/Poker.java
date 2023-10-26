package pack.lab2.poker;

import java.util.ArrayList;
import java.util.Scanner;

public class Poker {
    public static int getRandomINumber(int i) {
        return (int) (Math.random() * i);
    }

    public static void main(String[] args) {

        int cardNum = 5;
        int players;

        String[] suits = {"\u2660", "\u2666", "\u2665", "\u2663"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        int n = suits.length * rank.length; // количество карт

        Scanner sc = new Scanner(System.in);
        players = sc.nextInt();
        String card;
        ArrayList<String> array1 = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int suitsrand = getRandomINumber(suits.length);
            int rankrand = getRandomINumber(rank.length);
            card = suits[suitsrand] + " " + rank[rankrand];

            if (array1.contains(card)) {
                do {
                    suitsrand = getRandomINumber(suits.length);
                    rankrand = getRandomINumber(rank.length);
                    card = suits[suitsrand] + " " + rank[rankrand];
                }
                while (array1.contains(card));
                array1.add(card);
            } else {
                array1.add(card);
            }
        }
        for (int i = 0; i < cardNum * players; i++) {
            if (i % 5 == 0) {
                System.out.println();
                System.out.println(i / 5 + 1 + "-й игрок");
            }
            System.out.println(array1.get(i));
        }
    }
}