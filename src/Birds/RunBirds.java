package Birds;

public class RunBirds {
    public static void main(String[] args){
        Duck duck = new Duck();
        duck.swim();
        duck.fly();
        duck.migrate();
        duck.layEggs();
        System.out.println(duck.countWings);
    }

}
