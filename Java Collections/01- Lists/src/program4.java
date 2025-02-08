import java.util.Vector;

class Products {
    private String pName;
    private String pDescription;
    private int pQuantity;
    private double pCost;

    Products(String name, String desc, int quantity, double cost){
        this.pName = name;
        this.pDescription = desc;
        this.pQuantity = quantity;
        this.pCost = cost;
    }

    public String getpName() {
        return pName;
    }
    public int getpQuantity() {
        return pQuantity;
    }


    public synchronized void updateQuantity(int amount){
        this.pQuantity += amount;
        System.out.println("Updated " + getpName() + " stock. New quantity: " + getpQuantity());
    }

    @Override
    public String toString() {
        return "Products{" +
                "pName= '" + pName + '\'' +
                ", pDescription= '" + pDescription + '\'' +
                ", pQuantity= " + pQuantity +
                ", pCost= " + pCost + "$" +
                '}';
    }
}


class StockInventory {
    Vector<Products> inventory = new Vector<Products>();

    public void addProducts(String name, String desc,int quantity, double cost){
        inventory.add(new Products(name, desc, quantity, cost));
        System.out.println("Add " + name +" to the stock successfully");
    }

    public void showAllProducts(){
        for(Products p : inventory){
            System.out.println(p.toString());
        }
    }

    public synchronized void updateProductQuantity(String name, int amount){
        for(Products p : inventory){
            if(p.getpName().equals(name)){
                p.updateQuantity(amount);
                return;
            }
        }

        System.out.println("Can not Find this Product! ");
    }

}



public class program4 {

    public static void main(String[] args) {
        StockInventory stock = new StockInventory();

        stock.addProducts("hp pavillion","HP Laptop",1,15500);
        stock.addProducts("Dell g15","Dell Laptop",1,18499.99);
        stock.addProducts("lenovo ideapad","HP Laptop",1,17500.5);

        stock.showAllProducts();

        // Simulating multiple threads updating stock
        // () -> method(), lambda expression
        Thread t1 = new Thread(() -> stock.updateProductQuantity("hp pavillion", 5));
        Thread t2 = new Thread(() -> stock.updateProductQuantity("Dell g15", 3));

        // Starting the threads
        t1.start();
        t2.start();

        // Ensuring Completion Before Proceeding
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();
        stock.showAllProducts();
    }
}
