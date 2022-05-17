public class For {
    public static void main(String[] args){
        int total = 0;
        for(int counter = 0; counter<=10; counter++){
            System.out.printf("%d ", counter);
        }
        for(int number = 0; number <=20 ; number += 2){
            total += number;
        }
        System.out.printf("%d ", total);
    }
}
