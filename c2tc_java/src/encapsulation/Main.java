package encapsulation;

public class Main {
	public static void main(String[] args) {
        Product p = new Product();
        p.setProdid(101);
        p.setProdname("Wireless Mouse");
        p.setPrice(799.99);

        //  product details
        System.out.println("Product ID: " + p.getProdid());
        System.out.println("Product Name: " + p.getProdname());
        System.out.println("Product Price: Rs." + p.getPrice());
    }
}



