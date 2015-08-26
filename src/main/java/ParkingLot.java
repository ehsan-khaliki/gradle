package source;


public class ParkingLot {
  int spotsTaken;
  int capacity;
  public ParkingLot(int capacity) {
    spotsTaken = 0;
    this.capacity = capacity;
  }

  public boolean parkCar() {
    if(spotsTaken >= capacity)
      return false;
    spotsTaken++;
    return true;
  }

  public boolean takeCar() {
    if(spotsTaken == 0)
      return false;
    spotsTaken--;
    return true;
  }

  public static void main(String[] args){
    ParkingLot lot = new ParkingLot(20);
    System.out.println("created parking lot with 20 spots");
    lot.parkCar();
    System.out.println("parked car!");
    lot.takeCar();
    System.out.println("took car!");
  }
}
