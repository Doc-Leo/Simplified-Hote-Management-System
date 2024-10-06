public class Cart implements HotelService{

    public void requestCart(int numberOfCarts) {
        System.out.println("Requesting " + numberOfCarts + " luggage carts.");
    }

    @Override
    public void service() {
    System.out.println("Cart service is in progress.");
    }

}
