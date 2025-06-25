import java.util.*;

class Product {
    int productId;
    String productName;
    String category;

    public Product(int id, String name, String cat) {
        this.productId = id;
        this.productName = name;
        this.category = cat;
    }

    @Override
    public String toString() {
        return "Product{" + productId + ", " + productName + ", " + category + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shirt", "Clothing"),
            new Product(3, "Book", "Education"),
            new Product(4, "Phone", "Electronics"),
            new Product(5, "Shoes", "Footwear")
        };

        Product result1 = linearSearch(products, "Phone");
        System.out.println("Linear Search: " + (result1 != null ? result1 : "Not found"));

        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
        Product result2 = binarySearch(products, "Phone");
        System.out.println("Binary Search: " + (result2 != null ? result2 : "Not found"));
    }

    public static Product linearSearch(Product[] products, String name) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String name) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(name);

            if (cmp == 0) return products[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }
}
