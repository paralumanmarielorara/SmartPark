package com;

import com.model.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SmartPark System ===");
        System.out.println("Welcome to the Smart Parking Management System!");
        
        ParkingLot lot = new ParkingLot();
        lot.lotId = 1;
        lot.location = "Downtown";
        lot.capacity = 100;
        lot.occupiedSpaces = 45;
        
        System.out.println("\nPARKING LOT INFO:");
        System.out.println("ID: " + lot.lotId);
        System.out.println("Location: " + lot.location);
        System.out.println("Capacity: " + lot.capacity);
        System.out.println("Occupied: " + lot.occupiedSpaces);
        System.out.println("Available: " + (lot.capacity - lot.occupiedSpaces));
        
        Vehicle vehicle = new Vehicle();
        vehicle.licensePlate = "ABC-1234";
        vehicle.vehicleType = VehicleType.CAR;
        vehicle.ownerName = "John Doe";
        
        System.out.println("\nSAMPLE VEHICLE:");
        System.out.println("License Plate: " + vehicle.licensePlate);
        System.out.println("Type: " + vehicle.vehicleType);
        System.out.println("Owner: " + vehicle.ownerName);
        
        System.out.println("\nSystem is ready for parking management operations!");
    }
}
