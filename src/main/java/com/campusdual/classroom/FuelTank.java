package com.campusdual.classroom;

public class FuelTank {

  private int actualFuel = 10;



  public FuelTank(int actualFuel) {
    this.setActualFuel(actualFuel);
  }

  public FuelTank(){

  }



  public void setActualFuel(int actualFuel) {
    if (actualFuel < 0){
      System.out.println("El valor del combustible no puede ser negativo");
    } else {
      this.actualFuel = actualFuel;
    }

  }

  public int getActualFuel() {
    return this.actualFuel;
  }

  public void showDetails() {
    System.out.println("La capacidad actual es de " + getActualFuel() + " litros.");
  }
}
