import java.util.Scanner;
public class Main {
    static String pChoice;
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);



        Customer kund1 = new Customer();

        Product vatten = new Product("Vatten", 5, 300);
        Discount kaffe = new Discount("Kaffe", 10, 300);
        kaffe.ReducedPrice();
        Product cola = new Product("Cola", 15, 300);

        Product[] store = {vatten, kaffe, cola};
        int isShopping = 0;
        do{
            for (Product product : store) {
                System.out.println(product.pName);
                System.out.println(product.GetCost()+" SEK");
                System.out.println("Stock: " + product.GetStock());
            }
            System.out.println("Select product by typing the name");
            pChoice = myScanner.next().toLowerCase();
            System.out.println(pChoice);
            //kund1.setCustomerTotal();
            System.out.println(kund1.getTotal());
            switch (pChoice) {
                case "vatten" -> {
                    kund1.addToCart(vatten);
                    vatten.SetStock();
                }
                case "kaffe" -> {
                    kund1.addToCart(kaffe);
                    kaffe.SetStock();
                }
                case "cola" -> {
                    kund1.addToCart(cola);
                    cola.SetStock();
                }
            }
            System.out.println("Cart total: "+kund1.getTotal()+" SEK");
            System.out.println("Purchase more items? Yes/No");
            pChoice = myScanner.next().toLowerCase();
            if(pChoice.length() == 2){
                isShopping++;
            }else {
                isShopping =0;
            }

        }while(isShopping<1);

        kund1.Purchase();
        System.out.println("New balance: "+kund1.balance+" SEK");
        System.out.println("Stopped shopping");
    }

  //  static int addCart(String pChoice){
    //    int cCost = 0;

      //  switch (pChoice){
        //    case "vatten": cCost = store[0].GetCost();
          //  break;
          //  case "kaffe": cCost = store[1].GetCost();
          //  break;
          //  case "cola": cCost = store[2].GetCost();
       // }
      //  return cCost;
   // }
}