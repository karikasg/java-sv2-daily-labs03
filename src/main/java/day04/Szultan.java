package day04;

public class Szultan {
    public static void main(String[] args) {
        boolean[] prison = new boolean[100];

        for (int i = 1; i <= 100; i++){
            for (int j = i; j<= 100; j += i){
                prison[j-1] = !prison[j-1];  //utálom azokat a nyelveket, ahol 0-tól kezdődik az index
            }
        }
        for (int i = 1; i <= 100; i++){
            System.out.println(i + (prison[i-1] ? ": nyitva" : ": zárva"));
        }
    }
}
//A kiírt eredmény alapján megállapítható, hogy a négyzetszám számú cellákból szabadulnak a rabok.