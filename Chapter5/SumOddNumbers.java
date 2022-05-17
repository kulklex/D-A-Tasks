public class SumOddNumbers {
    public static void main(String[] args) {
        
        System.out.print(Math.pow(2.5, 3));
        int sum = 0; 
        int i = 1;
        for(int oddNumbers = 1; (oddNumbers <= 99); oddNumbers+=2){    
            System.out.println(oddNumbers);
            sum = sum + oddNumbers;
        }
        System.out.printf("%nThe sum is: %d%n", sum);

        while(i<=20){
            System.out.println(Math.min(i, 20));
            System.out.print(i);
            if((i % 5) == 0){
                System.out.println("");
            } else{
                System.out.print("\t");
            }
            ++i;
        }
        

        for(int f =1; f<=20; f++){
            System.out.print(f);
            if((f%5) == 0)
            {    System.out.println("");}
            else{System.out.print("\t");}
        }
    }
}
