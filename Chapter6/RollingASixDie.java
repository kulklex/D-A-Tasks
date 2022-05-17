import java.security.SecureRandom;

public class RollingASixDie {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int randomValue = random.nextInt();
        System.out.println(randomValue);
        for (int counter = 1; counter<=20; counter++){
            int face =  1 + random.nextInt(6);
            System.out.println("The number generated is " + face + "\n");
        }

        int frequency1 = 0;
        int frequency2 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0;
        int frequency6 = 0;
        for(int i=0; i<= 6000000; i++){
            int face = 1 + random.nextInt(6);
            switch(face){
                case 1:
                ++frequency1;
                break;

                case 2:
                ++frequency2;
                break;

                case 3:
                ++frequency3;
                break;

                case 4:
                ++frequency4;
                break;

                case 5:
                ++frequency5;
                break;

                case 6:
                ++frequency6;
                break;
            }
        }
        System.out.println("Number of 1: " + frequency1);
        System.out.println("Number of 2: " + frequency2);
        System.out.println("Number of 3: " + frequency3);
        System.out.println("Number of 4: " + frequency4);
        System.out.println("Number of 5: " + frequency5);
        System.out.println("Number of 6: " + frequency6);

        int number = 2+3*random.nextInt(5);
        System.out.println(number);
    }
}
