package product1.model;

public class OrderItem {
    private long id;
    private double price;
    private int quantity;
    private long orderId;
    private int cageId;
    private String farm;
    private double total;

    public OrderItem() {
    }

    public OrderItem(long id, double price, int quantity, long orderId, int productId, String productName, double total) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.orderId = orderId;
        this.cageId = productId;
        this.farm = productName;
        this.total = total;
    }

    public OrderItem(String record) {
        String[] fields = record.split(",");
        this.id = Long.parseLong(fields[0]);
        this.price = Double.parseDouble(fields[1]);
        this.quantity = Integer.parseInt(fields[2]);
        this.orderId = Long.parseLong(fields[3]);
        this.cageId = Integer.parseInt(fields[4]);
        this.farm = fields[5];
        this.total = Double.parseDouble(fields[6]);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return cageId;
    }

    public void setProductId(int productId) {
        this.cageId = productId;
    }

    public String getProductName() {
        return farm;
    }

    public void setProductName(String productName) {
        this.farm = productName;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return id + "," + price + "," + quantity + "," + orderId + "," + cageId + "," + farm + "," + total;
    }
}
