package zanele.muhadi.datamateinc;

public class Class5 {
    public static void main(String[] args) {
        displayCar();
    }
    public static void displayCar(){
        Car car = new Car();
        car.setModel("Toyota Corolla");
        car.setGears(6);
        car.setType("Diesel");
        car.setSpeed(340);

        System.out.println(car.getModel()+ " is  the  Model Of the Car");
        System.out.println("The Car Has "+car.getGears() + " Gears");
        System.out.println("The Car's  Maximum speed  is  "+car.getSpeed() + " KM/Hr");
        System.out.println("The Car Uses"+car.getType() + " For fuel");

    }
}
