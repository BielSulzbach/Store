public class Store {

    String productType;
    int inventoryCount;
    double inventoryPrice;
    public Store (String product, int inventory, double price){
    inventoryCount = inventory;
    inventoryPrice = price;
    productType = product;
    System.out.println ( "I am inside the constructor method");
      
}
    public static void main(String[] args) {
        Store lemonadeStand = new Store ("lemonade", 10, 2.0);
        Store Cookieshop = new Store ( "cookie", 12, 3.75);
        System.out.println(Cookieshop.inventoryCount);
        System.out.println(Cookieshop.inventoryPrice);
        System.out.println(Cookieshop.productType);
    
}
}
