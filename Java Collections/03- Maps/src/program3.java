/*
    Java Masterclass
    Kareem Abdelkader
    Create a Product Price Management program (TreeMap)
*/


import java.util.Map;
import java.util.TreeMap;

class ProductPriceManagement {

    TreeMap<String, Double> product;

    ProductPriceManagement(){
        this.product = new TreeMap<>();
    }

    public void addProduct(String name, double cost){
        product.put(name, cost);
    }

    public void displayProducts(){
        for (Map.Entry<String, Double> e : product.entrySet() ){
            System.out.println(e);
        }
    }

}

public class program3 {

    public static void main(String[] args) {

        ProductPriceManagement products = new ProductPriceManagement();

        products.addProduct("Apple Laptop", 2499.90);
        products.addProduct("Huawei Laptop", 2100.00);
        products.addProduct("Dell Laptop", 1680.50);
        products.addProduct("HP Laptop", 1500);

        products.displayProducts();

    }


}
