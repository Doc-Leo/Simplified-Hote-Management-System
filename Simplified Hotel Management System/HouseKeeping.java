public class HouseKeeping implements HotelService {

        public static void cleanRoom(int roomNumber) {
        System.out.println("Cleaning room number: " + roomNumber);
    }

    @Override
    public void service() {
        System.out.println("Housekeeping service in progress.");
    }
}