public class FrontDesk{

    private Cart cart;
    private HouseKeeping hs;
    private Valet val;

    public FrontDesk() {

        this.cart = new Cart();
        this.hs = new HouseKeeping();
        this.val = new Valet();
    }


    public void requestCart(int numberOfCarts) {
        System.out.println("FrontDesk- Requesting for cart service");
        cart.service();
        cart.requestCart(numberOfCarts);
    }

    public void requestValet(String plateNumber) {
        System.out.println("FrontDesk- Requesting for valet service");
        val.service();
        val.pickUpVehicle(plateNumber);
    }

    public void requestHouseKeeping(int roomNumber) {
        System.out.println("FrontDesk- Requesting for housekeeping service");
        hs.service();
        HouseKeeping.cleanRoom(roomNumber);
    }


}
