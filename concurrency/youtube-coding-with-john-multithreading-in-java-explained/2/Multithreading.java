public class Multithreading {
    public static void main(String[] args) {
        MultithreadThing myThing1 = new MultithreadThing();
        MultithreadThing myThing2 = new MultithreadThing();
        
        myThing1.start();
        myThing2.start();
    }
}