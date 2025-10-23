package encapsulation;

public class Product {
	    private int prodid;
	    private String prodname;
	    private double price;

	    // Getter and Setter methods
	    public int getProdid() {
	        return prodid;
	    }

	    public void setProdid(int prodid) {
	        this.prodid = prodid;
	    }

	    public String getProdname() {
	        return prodname;
	    }

	    public void setProdname(String prodname) {
	        this.prodname = prodname;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        if (price > 0) {
	            this.price = price;
	        } else {
	            System.out.println("Invalid price");
	        }
	    }
	}

