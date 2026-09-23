package day34;

public class TestMobile {
    static void main() {

        Mobile device1 = new Mobile();
        device1.brandName = "Samsung";
        device1.modelName = "S18";
        device1.ramSize = 5;
        device1.isRefurbished = false;
        device1.price = 1200;

        System.out.println("Brand Name: " + device1.brandName);
        System.out.println("Model Name: " + device1.modelName);
        System.out.println("RAM Size: " + device1.ramSize);
        System.out.println("Is Refurbished: " + device1.isRefurbished);
        System.out.println("Price: $" + device1.price);

        System.out.println("====================================");

        Mobile device2 = new Mobile();
        device2.brandName = "Apple";
        device2.modelName = "Max Pro";
        device2.ramSize = 10;
        device2.isRefurbished = true;
        device2.price = 1700;

        System.out.println("Brand Name: " + device2.brandName);
        System.out.println("Model Name: " + device2.modelName);
        System.out.println("RAM Size: " + device2.ramSize);
        System.out.println("Is Refurbished: " + device2.isRefurbished);
        System.out.println("Price: $" + device2.price);
    }
}
