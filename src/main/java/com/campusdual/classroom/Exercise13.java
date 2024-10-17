package com.campusdual.classroom;

public class Exercise13 {
    public static void main(String[] args) {
        FuelTank ft = new FuelTank(10);
        ft.showDetails();
        System.out.println("Actualización capacidad");
        ft.setActualFuel(-5);
        ft.showDetails();
    }
}