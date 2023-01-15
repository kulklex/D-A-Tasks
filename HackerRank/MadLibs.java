import java.util.Random;
import java.util.Scanner;

public class MadLibs {
    
    Scanner input = new Scanner(System.in);
    Random random = new Random();

    String story, name, adjective1, adjective2, noun1, noun2, noun3, adverb, randomNum;
   
   
    public String getStory() {
        return story;
    }
    public void setStory(String story) {
        this.story = story;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAdjective1() {
        return adjective1;
    }
    public void setAdjective1(String adjective1) {
        this.adjective1 = adjective1;
    }
    public String getAdjective2() {
        return adjective2;
    }
    public void setAdjective2(String adjective2) {
        this.adjective2 = adjective2;
    }
    public String getNoun1() {
        return noun1;
    }
    public void setNoun1(String noun1) {
        this.noun1 = noun1;
    }
    public String getNoun2() {
        return noun2;
    }
    public void setNoun2(String noun2) {
        this.noun2 = noun2;
    }
    public String getNoun3() {
        return noun3;
    }
    public void setNoun3(String noun3) {
        this.noun3 = noun3;
    }
    public String getAdverb() {
        return adverb;
    }
    public void setAdverb(String adverb) {
        this.adverb = adverb;
    }
    public String getRandomNum() {
        return randomNum;
    }
    public void setRandomNum() {
        int num = Math.abs(random.nextInt()) % 100;
        int index = 0;
        int [] numberHolder = new int[3];
        while (index < numberHolder.length) {
            numberHolder[index] = num + index;
            index++;
        }
        randomNum = "not " + numberHolder[0] + ", not " + numberHolder[1] + ", but " + numberHolder[2];
    }
   

    public void putTogetherAStory() {
        String story;
        int num = Math.abs(random.nextInt()) % 2;
        if (num == 0) {
            story = "Jesse and her best friend "+getName()+" went to Disney World today!" + 
            " They saw " + getNoun1() + " in a show at the Magic Kingdom"+
            " and ate a " + getAdjective1() + " feast for dinner. The next day, I ran " +
            getAdverb() + " to meet Mickey Mouse in his " + getNoun2() + " and then that night I gazed at the " + getRandomNum() + 
            " " + getAdjective2() + " fireworks showing from the " + getNoun3() + ".";
        } else {
            story = "Amanda and her frenemy " + getName() + " went to the zoo last year. " +
            "They saw a huge" + getNoun1() + " and a tiny little " + getNoun2() + 
            ".  That night they decided to club " + getAdverb() + " into the " +
            getNoun3() +  " to get a closer look. " + "The zoo was " + getAdjective1() +
             " at night, but they didn't care..... until" + getRandomNum() + " " + getAdjective2()
             + " apes yelled at their faces, making Amanda and " + getName() + " sprinted all the way back home";
        }
        setStory(story);
    }


    //Print Instructions to Player
    public void putInstructions() {
        System.out.println("Welcome to the MadLibs game. If you type in words we'll give you a story." + 
        " Start by typing in a name.");
    }

    public void enterName(){
        System.out.println("Type Name:");
        setName(input.nextLine());
    }

    public void enterNoun1(){
        System.out.println("Type first noun");
        setNoun1(input.nextLine());
    }

    public void enterNoun2(){
        System.out.println("Type Second noun");
        setNoun2(input.nextLine());
    }
    
    public void enterNoun3(){
        System.out.println("Type last noun");
        setNoun3(input.nextLine());
    }
    
    public void enterAdjective1(){
        System.out.println("Type first Adjective");
        setAdjective1(input.nextLine());
    }
    
    public void enterAdjective2(){
        System.out.println("Type second adjective");
        setAdjective2(input.nextLine());
    }
    
    public void enterAdverb(){
        System.out.println("Type an adverb");
        setAdverb(input.nextLine());
    }

    public void play(){
        enterName();
        enterNoun1();
        enterAdjective1();
        enterAdjective2();
        enterNoun2();
        enterAdverb();
        enterNoun3();
        setRandomNum();
        putTogetherAStory();
        System.out.println(getStory());
    }

    public static void main(String[] args) {
        MadLibs madLibs = new MadLibs();
        madLibs.putInstructions();
        madLibs.play();
    }

}
