
public class HotelApp {
    public static void main(String[] args) {

        FrontDesk fd = new FrontDesk();

        fd.requestCart(4);
        fd.requestValet("GGG-1029");
        fd.requestHouseKeeping(12);

    }
}