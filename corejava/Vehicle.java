public class Vehicle {
    protected String brand = " ford";
    public void honk() {
        System.out.println("tooor,tooor!");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";
    public static void main(String [] args){

        //Create a myCar object
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + " " +myCar.modelName);
    }
}
