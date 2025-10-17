package week;

    class Car {
        String brand;
        String model;
        int year;
        Car(String brand, String model, int year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }
        void displayDetails() {
            System.out.println("Car Brand: " + brand);
            System.out.println("Car Model: " + model);
            System.out.println("Car Year: " + year);
        }
        public static void main(String[] args) {
            Car car = new Car("Toyota", "Camry", 2022);
            car.displayDetails();
        }
    }



