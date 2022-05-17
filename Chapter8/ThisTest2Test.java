public class ThisTest2Test {
    public static void main(String[] args) {
        ThisTest2 t1 = new ThisTest2();
        ThisTest2 t2 = new ThisTest2(2);
        ThisTest2 t3 = new ThisTest2(21, 34);
        ThisTest2 t4 = new ThisTest2(12, 25, 42);
        ThisTest2 t5 = new ThisTest2(t4);

        System.out.println("Constructed with: ");
        displayTime("t1 all default arguments", t1);
        displayTime("t2 hour specified, default minute and second", t2);
        displayTime("t3 hour and minute specified: default second", t3);
        displayTime("t4 hour, minute and second specified", t4);
        displayTime("t5 ThisTest2 object t4 specified", t5);

        try{
            ThisTest2 t6 = new ThisTest2(27,74, 99);
            System.out.println(t6);
        } catch (IllegalArgumentException e){
            System.out.println("\nException while initializing t6: " + e.getMessage());
        }
    }

    public static void displayTime(String header, ThisTest2 t) {
        System.out.printf("%s%n   %s%n   %s%n", header, t.toUniversalString(), t.toString());
    }
}
