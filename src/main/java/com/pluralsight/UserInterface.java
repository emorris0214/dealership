package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    private DealershipFileManager fileManager = new DealershipFileManager();
    private Scanner keyboard = new Scanner(System.in);

    public void display() {
        dealership = fileManager.getDealership();
        boolean running = true;

        while (running) {
            System.out.println("Welcome to Decker's Dealership!");
            System.out.println("\n=== Dealership Menu ===");
            System.out.println("1 - Find vehicles within a price range");
            System.out.println("2 - Find vehicles by make/model");
            System.out.println("3 - Find vehicles by year range");
            System.out.println("4 - Find vehicles by color");
            System.out.println("5 - Find vehicles by mileage range");
            System.out.println("6 - Find vehicles by type");
            System.out.println("7 - List ALL vehicles");
            System.out.println("8 - Add a vehicle");
            System.out.println("9 - Remove a vehicle");
            System.out.println("99 - Quit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(keyboard.nextLine());
            keyboard.nextLine(); // clear newline

            switch (choice) {
                case 1 -> processGetByPriceRequest();
                case 2 -> processGetByMakeModelRequest();
                case 3 -> processGetByYearRequest();
                case 4 -> processGetByColorRequest();
                case 5 -> processGetByMileageRequest();
                case 6 -> processGetByVehicletypeRequest();
                case 7 -> processGetAllVehiclesRequest();
                case 8 -> addVehicle();
                case 9 -> removeVehicle();
                case 99 -> running = false;
                default -> System.out.println("Please try again, my friend.");
            }
        }
        System.out.println("Goodbye Y'all, thanks for visiting Decker's Dealership");
    }

    private void processGetByPriceRequest() {
        //todo
    }

    private void processGetByMakeModelRequest() {
        //todo
    }

    private void processGetByYearRequest() {
        //todo
    }

    private void processGetByColorRequest() {
        //todo
    }

    private void processGetByMileageRequest() {
        //todo
    }

    private void processGetByVehicletypeRequest() {
        //todo
    }

    private void processGetAllVehiclesRequest() {
        //todo
    }

    private void addVehicle() {
        System.out.print("Give us some vehicle details.");
        System.out.print("VIN: ");
        int vin = keyboard.nextInt();
        System.out.print("Year: ");
        int year = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Make: ");
        String make = keyboard.nextLine();
        System.out.print("Model: ");
        String model = keyboard.nextLine();
        System.out.print("Type (car/SUV/truck/van): ");
        String type = keyboard.nextLine();
        System.out.print("Color: ");
        String color = keyboard.nextLine();
        System.out.print("Mileage: ");
        int mileage = keyboard.nextInt();
        System.out.print("Price: ");
        double price = keyboard.nextDouble();

        Vehicle vehicle = new Vehicle(vin, year, make, model, type, color, mileage, price);
        dealership.addVehicle(vehicle);
        fileManager.saveDealership(dealership);
        System.out.println("Vehicle successfully added!");
    }

    private void removeVehicle() {
        System.out.print("Enter VIN of vehicle to remove: ");
        int vin = keyboard.nextInt();
        dealership.removeVehicle(vin);
        fileManager.saveDealership(dealership);
        System.out.println("Vehicle successfully removed (if found).");
    }


}
