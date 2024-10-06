public class Valet implements HotelService {

    public void pickUpVehicle(String plateNumber) {
        System.out.println("Picking up vehicle with plate number: "+ plateNumber);
    }

    @Override
    public void service() {
        System.out.println("Valet service in progress.");
    }
}
