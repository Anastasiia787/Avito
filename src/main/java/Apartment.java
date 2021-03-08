public class Apartment {
    long id;
    String url;
    String image;
    int numberOfRooms;
    double area;
    int floor;
    int totalFloor;
    long price;
    String verification;
    String residentialComplex;
    String address;
    String district;
    String metroStation;
    double distanceToMetro;
    String realEstateAgency;
    boolean like;
    long created;

    @Override
    public String toString() {
        return id +
                "\n" + url +
                "\n" + image +
                "\n" + numberOfRooms + "-к. квартира, " +
                area + " м², " +
                floor + "/"+
                totalFloor +" эт." +
                "\n" + price + " руб." +
                "\n" + verification +
                "\n" + residentialComplex +
                "\n" + address +
                "\n" + district +
                "\n" + metroStation + ", " + distanceToMetro + " км" +
                "\n" + realEstateAgency +
                "\n" + like +
                "\n" + created;
    }
}
