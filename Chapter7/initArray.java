public class initArray {
    public static void main(String[] args){
        int[] array = new int[10];
        int[] n = {10,20,30,40,50,60,70,80,90,100};
        int total = 0;
        for(int counter = 0; counter < array.length; counter++){
            System.out.println(counter + " " + n[counter]);
            total+= n[counter];
        }
        System.out.println("the total is "+ total);
        System.out.println("\n\n");
        final int array_length = 10;
        int[] array2 = new int[array_length];

        for(int counter = 0; counter < array2.length; counter++){
            array2[counter] = 2 + 2 * counter;
        }

        for(int counter = 0; counter < array2.length; counter++){
            System.out.println(counter + "   " + array2[counter]);
        }
        
    }
}
