public class Customer {
    int balance;
    int total = 0;
    int cAmount = 0;
    Customer(){
        this.balance = 3000;
    }
    public void addToCart(Product product){
        total += product.GetCost();
        cAmount++;
    }
    public int getTotal(){
        return this.total;
    }

    public void Purchase(){
        this.balance -= this.total;
        System.out.println("Total purchase: "+ this.total+" SEK");
    }
}


