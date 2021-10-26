package day03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

//    Írj egy számkitaláló programot a `GuessTheNumber` osztályba!
//    A program kitalál egy véletlenszerű számot 1 és 100 között.
//    Majd bekér a felhasználótól ciklusban számokat.
//    Mindig megmondja, hogy a szám kisebb, nagyobb vagy egyenlő-e mint a gondolt szám.
//    Legfeljebb 6-szor lehessen kérdezni, és a felhasználó kapjon visszajelzést arról
//    is, ha kitalálta és arról is, ha nem!

// Igen, tudom, nem a main-be írunk algoritmust... De most csak maga az algoritmus a lényeg, szóval tökmindegy.

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int guess;
        int number = random.nextInt(100) + 1;
        boolean found = false;
        int TryNr;

        for (TryNr = 0; (TryNr < 6) && (!found); TryNr++) {
            System.out.print("Kérem a(z) " + (TryNr + 1) + ". tippet: ");
            guess = scanner.nextInt();
            if (guess < number) {
                System.out.println("A kitalálandó szám nagyobb");
            } else if (guess > number) {
                System.out.println("A kitalálandó szám kisebb");
            } else {
                found = true;
                System.out.println("A kitalálandó szám egyenlő"); // ezt tök fölösleges itt kiírni, csak a feladat szövege miatt...
            }
        }
        System.out.println("A kitalálandó szám " + number + " volt. " +
                (found ? "Gratulálok, eltaláltad " + TryNr + " próbálkozásból!" : "Sajnos nem sikerült eltalálni 6 próbálkozásból"));
    }
}
