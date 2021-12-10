package pt.up.fe.ldts.example1;

public class OrderLine {
    public Product product;
    public int quantity;

    public Product getProduct(){
        return product;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setProduct(Product p){
        this.product = p;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public OrderLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    public double getTotal() {
        return getProduct().getPrice() * getQuantity();
    }
    @Override
    public String toString() {
        return getProduct().getName() + "(x" + getQuantity() + "): " + getTotal();
    }
}
