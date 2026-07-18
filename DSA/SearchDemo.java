class Product {

    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

public class SearchDemo {

    // Linear Search
    public static Product linearSearch(Product[] products, String name) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    // Binary Search (Array must be sorted by product name)
    public static Product binarySearch(Product[] products, String name) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int compare = products[mid].productName.compareToIgnoreCase(name);

            if (compare == 0)
                return products[mid];

            if (compare < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Keyboard", "Electronics"),
                new Product(102, "Laptop", "Electronics"),
                new Product(103, "Mouse", "Electronics"),
                new Product(104, "Phone", "Electronics"),
                new Product(105, "Printer", "Electronics")
        };

        Product result1 = linearSearch(products, "Mouse");

        if (result1 != null) {
            System.out.println("Linear Search Found:");
            System.out.println(result1.productId + " " + result1.productName);
        }

        Product result2 = binarySearch(products, "Printer");

        if (result2 != null) {
            System.out.println("\nBinary Search Found:");
            System.out.println(result2.productId + " " + result2.productName);
        }
    }
}