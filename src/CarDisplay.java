public class CarDisplay {

    public static void main(String[] args) {
        Car car = new Car("Father", "Large");
        System.out.println(car);

        Sedan sedan = new Sedan("Mother", "Medium", 4, 2000);
        System.out.println(sedan);

        Sedan.SportsCar sportsCar = new Sedan.SportsCar("I", "Small", 2, 3000, "Red");
        System.out.println();


        Truck Truck = new Truck("grandpa", "large", 200);
    }

}


class Car {
    private String name; //owner name e.g. mother, father, son, daughter
    private String size;
    private String licensePlate;

    public Car(String name, String size) {
        this.name = name;
        this.size = size;
        this.licensePlate = licensePlate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "My " + name + " has/have a most luxurious car in my family, and my License Plate is " + licensePlate + ".";
    }
}

class Truck extends Car {

    private double cargoCapacity;

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public Truck(String name, String size, double cargoCapacity) {
        super(name, size);
        this.cargoCapacity = cargoCapacity;

        }

        @Override
    public String toString(){
        return  "This Truck belongs to " + super.getName() + "and is " + getSize() + "and the cargo capacity is " + cargoCapacity + "kg" + "and the license plate is " + getLicensePlate();
        }

    }


    class Sedan extends Car{
        private int doors;
        private int engineCapacity;

        public Sedan(String name, String size, int doors, int engineCapacity) {
            super(name, size);
            this.doors = doors;
            this.engineCapacity = engineCapacity;
        }

        public int getDoors() {
            return doors;
        }

        public void setDoors(int doors) {
            this.doors = doors;
        }

        public int getEngineCapacity() {
            return engineCapacity;
        }

        public void setEngineCapacity(int engineCapacity) {
            this.engineCapacity = engineCapacity;
        }

        @Override
        public String toString(){
            return super.getName() + " has/have a Sedan with " + doors + " doors and " + engineCapacity + " engine capacity";
        }



        static class SportsCar extends Sedan{

            private String color;


            public SportsCar(String name, String size, int doors, int engineCapacity, String color) {
                super(name, size, doors, engineCapacity);
                this.color = color;
            }

            @Override
            public String toString(){
                return super.getName() + " has/have a Sports Car with " + super.getDoors() + " doors and " + super.getEngineCapacity() + " engine capacity and " + color + " color";
            }
        }

    }
