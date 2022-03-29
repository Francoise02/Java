// importing java util
import java.util.*;

// create the class for car
public class Cars {

    public Queue<Integer> cars(){

        Queue<Integer> traffic =  new LinkedList<>();

        for(int i=0; i<=100; i++){

            Random randomCar = new Random(); // instance of a random class

            int car = randomCar.nextInt(100);
            traffic.add(car);

        }
        return traffic;

    }

    // create the main method
    public static void main (String[] args) {
        System.out.println("Hello please run the Traffic lights class to see the implementation");
    }

}

// Create the class for lights
class Lights {
    public String trafficLight() {

        ArrayList<String> lights = new ArrayList<String>();
        lights.add("Green");
        lights.add("Yellow");
        lights.add("Red");


        Random randLight = new Random();


        int inx = randLight.nextInt(3);


        String color = lights.get(inx);
        return color;
    }

}

//
class Traffic_lights {
    public static void main (String[] args) throws InterruptedException{

        Cars mytraffic = new Cars();
        Queue<Integer> myCars = mytraffic.cars();


        Iterator<Integer> iterator = myCars.iterator();
        while (myCars.size() > 1) {

            Lights light = new Lights();
            String randomLight = light.trafficLight();


            if (randomLight.equals("Green")) {
                int j = 0;

                while (j < 31  && iterator.hasNext()) {
                    System.out.println(" 🟢 you can Go");
                    Thread.sleep(1000);
                    myCars.remove();
                    j++;
                }
            } else if (randomLight.equals("Yellow")) {
                int k = 0;
                while (k <= 11  && iterator.hasNext()) {
                    System.out.println(" 🟡  You an Go");
                    Thread.sleep(1000);
                    myCars.remove();
                    k ++;
                }
            } else if (randomLight.equals("Red")) {
                int i= 0;
                while (i <= 21) {
                    System.out.println(" 🔴 No car should GO");
                    Thread.sleep(1000);
                    i++;

                }
            }


        }

        System.out.println("No more cars in the Queue");
    }

}

