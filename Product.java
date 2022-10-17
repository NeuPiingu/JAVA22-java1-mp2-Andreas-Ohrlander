public class Product {
    String pName;
     int pCost;
    private int pStock;

    Product(String name, int cost, int stock){
        this.pName = name;
        this.pCost = cost;
        this.pStock = stock;
    }
    int GetCost(){
        return this.pCost;
    }
    int GetStock(){
        return this.pStock;
    }
    public void SetStock(){
        this.pStock = pStock - 1;
    }
}
class Discount extends Product{
    final double percent = 0.01;
    public double discount = 20.00;

    Discount(String name, int cost, int stock) {
        super(name, cost, stock);
    }
    public void ReducedPrice(){
        Double discount2 = (discount * percent) * pCost;
        this.pCost = pCost-discount2.intValue();
    }
}
