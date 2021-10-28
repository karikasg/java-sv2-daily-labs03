package day04;

public class Prison {
    private boolean[] prison = new boolean[100];

    public void openFreeCells(){
        for (int i = 1; i <= 100; i++){
            for (int j = i; j<= 100; j += i){
                prison[j-1] = !prison[j-1];  //utálom azokat a nyelveket, ahol 0-tól kezdődik az index
            }
        }
    }

    public void printFreeCells() {
        for (int i = 1; i <= 100; i++) {
            if (prison[i-1]) {
                    System.out.println(i);
            }
        }
    }
}
