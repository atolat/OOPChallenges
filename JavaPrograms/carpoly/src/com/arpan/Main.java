package com.arpan;


//import javax.xml.stream.events.StartDocument;

class Car{
    private String make;
    private String model;
    private String engine;
    private int cylinders;
    private int wheels;

    public Car(String make, String model, String engine, int cylinders, int wheels) {
        this.make = make;
        this.model = model;
        this.engine = engine;
        this.cylinders = cylinders;
        this.wheels = wheels;
    }

    public Car(String make, String model, int cylinders) {
        this(make,model,"Bajaj",cylinders, 4);
        this.make = make;
        this.model = model;
        this.cylinders = cylinders;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine(){
        System.out.println("Engine Started");

    }

    public void acclerate(){
        System.out.println("Accelerating, speed increasing");

    }

    public void breakSpeed(){
        System.out.println("Speed decreasing, car stopping");

    }
}


class Honda extends Car{
    public Honda(String make, String model, String engine, int cylinders, int wheels) {
        super(make, model, engine, cylinders, wheels);
    }

//    public Honda(String make, String model, int cylinders) {
//        this(make,model,"Bajaj",cylinders,4);
//
//        //super(make, model, cylinders);
//    }


    @Override
    public String getMake() {
        return super.getMake();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public String getEngine() {
        return super.getEngine();
    }

    @Override
    public int getCylinders() {
        return super.getCylinders();
    }

    @Override
    public int getWheels() {
        return super.getWheels();
    }

    @Override
    public void startEngine() {
        System.out.println("Engine for Honda Started");
    }

    @Override
    public void acclerate() {
        System.out.println("Honda Accelerating");
    }

    @Override
    public void breakSpeed() {
        System.out.println("Honda breaks");
    }
}

class Porsche extends Car{
    public Porsche(String make, String model, String engine, int cylinders, int wheels) {
        super(make, model, engine, cylinders, wheels);
    }

//    public Porsche(String make, String model, int cylinders) {
//        this(make,model,"Bajaj",cylinders,4);
//        //super(make, model, cylinders);
//    }


    @Override
    public String getMake() {
        return super.getMake();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public String getEngine() {
        return super.getEngine();
    }

    @Override
    public int getCylinders() {
        return super.getCylinders();
    }

    @Override
    public int getWheels() {
        return super.getWheels();
    }

    @Override
    public void startEngine() {
        System.out.println("Engine for Porsche Started");
    }

    @Override
    public void acclerate() {
        System.out.println("Porsche Accelerating");
    }

    @Override
    public void breakSpeed() {
        System.out.println("Porsche breaks");
    }

}

class Suzuki extends Car{
    public Suzuki(String make, String model, String engine, int cylinders, int wheels) {
        super(make, model, engine, cylinders, wheels);
    }

//    public Suzuki(String make, String model, int cylinders) {
//        this(make,model,"Bajaj",cylinders,4);
//        //super(make, model, cylinders);
//    }


    @Override
    public String getMake() {
        return super.getMake();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public String getEngine() {
        return super.getEngine();
    }

    @Override
    public int getCylinders() {
        return super.getCylinders();
    }

    @Override
    public int getWheels() {
        return super.getWheels();
    }

    @Override
    public void startEngine() {
        System.out.println("Engine for Suzuki Started");
    }

    //Nothing here

}








public class Main {

    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            Car car=randomCar();
            System.out.println("Car #"+i+":");
            System.out.println("Car make is \n"+"Car model is "+car.getModel());
            car.startEngine();
            car.acclerate();
            car.breakSpeed();

        }

    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3 )+ 1;
        System.out.println("Random number generated is: "+randomNumber);


        switch (randomNumber) {
            case 1:
                return new Honda("Honda", "Civic","Bajaj", 10,4);
                //break;
            case 2:
                return new Porsche("Porscshe", "Cayenne","Bajaj", 12,4);
                //break;
            case 3:
                return new Suzuki("Suzuki", "Maruti","Bajaj", 8,4);
                //break;



        }
        return null;
    }

}
