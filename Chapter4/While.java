
public class While {
    public static void main(String[] args) {
        int product = 3;
        while (product <= 10){
            product = 3 * product;
            System.out.print(product);
        }
        int number = 0;
        int sum = 0;
        int x = 1;
        while(x<=10){
            number++;
            sum += number;
            x += 1;
        }

        int produce = 5;
        int t = 5;
        produce *= t++;
        System.out.printf("%nEnter %d%n", produce);
        System.out.printf("%nThe sum is %d", sum);
    }
}
