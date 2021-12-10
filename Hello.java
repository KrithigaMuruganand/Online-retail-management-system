import java.util.*;
import java.io.*;
import au.com.bytecode.opencsv.CSVReader;
class welcome{
    void greeting(){
        System.out.println("\n" + "WELCOME TO ONLINE RETAIL SYSTEM" + "\n" + "Your satisfaction is our improvement.");
        Scanner scanner = new Scanner(new File("C:\\Users\\Balakrishanan\\Documents\\CSVDemo.csv"));
        
        scanner.useDelimiter(",");
        System.out.println();
        while (scanner.hasNext()) 
        {
            System.out.print(scanner.next() + "    ");
        }
         
        //Do not forget to close the scanner  
        scanner.close();
    }
}

class Categories extends welcome{
    void storeselection(){
        System.out.println("1.Stationary  2.Essentials 3.Groceries 4.Fruits 5.Clothes 6.To exit");
    }
}

class retailshopbilling extends Categories{
    public void StationaryItems() {
        int total=0;
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("1.Pen 2.Pencil 3.Ruler 4.Eraser 5.Sharpener 6.Pay bill");
            System.out.println("Enter nos 1 to 5 to purchase accordingly");
            int product=sc.nextInt();
            if(product==1){
                int price=20;
                System.out.println("Enter quantity in boxes (10 pcs/box)");
                int quantity=sc.nextInt();
                total+=(quantity*price);
            }
            else if(product==2){
                int price=30;
                System.out.println("Enter quantity in boxes (10 pcs/box)");
                int quantity=sc.nextInt();
                total+=(quantity*price);
            }
            else if(product==3){
                int price=30;
                System.out.println("Enter quantity in boxes (10 pcs/box)");
                int quantity=sc.nextInt();
                total+=quantity*price;
            }
            else if(product==4){
                int price=30;
                System.out.println("Enter quantity in boxes (10 pcs/box)");
                int quantity=sc.nextInt();
                total+=quantity*price;
            }
            else if(product==5){
                int price=30;
                System.out.println("Enter quantity in boxes (10 pcs/box)");
                int quantity=sc.nextInt();
                total+=quantity*price;
            }
            else if(product==6){
                System.out.println("Your Stationary bill :"+total);
                Scanner input = new Scanner(System.in);
                System.out.println("Enter total amount to pay the bill: ");
                int status = input.nextInt();
                if (status==total){
                System.out.println("Your order is placed");
                    break;
                }
                else{
                System.out.println("Please pay the bill to place order.");
                }
            }
            else{
                System.out.println("Enter a valid option!!");
            }
            
        
        }
        
    }
    public void Essentials(){
        int total=0;
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("1.Bath soap 2.Shampoo 3.Toothpaste 4.Napkin 5.Sanitizer 6.Pay bill");
            System.out.println("Enter nos 1 to 5 to purchase accordingly");
            int product=sc.nextInt();
            
            if(product==1){
                int price=20;
                System.out.println("Enter quantity: ");
                int quantity=sc.nextInt();
                total+=quantity*price;
            }
            else if(product==2){
                int price=80;
                System.out.println("Enter quantity: ");
                int quantity=sc.nextInt();
                total+=quantity*price;
            }
            else if(product==3){
                int price=40;
                System.out.println("Enter quantity: ");
                int quantity=sc.nextInt();
                total+=quantity*price;
            }
            else if(product==4){
                int price=70;
                System.out.println("Enter quantity: ");
                int quantity=sc.nextInt();
                total+=quantity*price;
            }
            else if(product==5){
                int price=40;
                System.out.println("Enter quantity: ");
                int quantity=sc.nextInt();
                total+=quantity*price;
            }
            else if(product==6){
                System.out.println("Your Essentials bill :"+total);
                Scanner input = new Scanner(System.in);
                System.out.println("Enter total amount to pay the bill: ");
                int status = input.nextInt();
                if (status==total){
                System.out.println("Your order is placed");
                    break;
                }
                else{
                System.out.println("Please pay the bill to place order.");
                }
            }
            else{
                System.out.println("Enter a valid option!!");
            }
        
        
        }

    }
    public void Groceries() {
        int total=0;
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("1.Bread 2.Cheese 3.Eggs(6/box) 4.Rice(1kg) 5.Chicken 6.Pay bill");
            System.out.println("Enter nos 1 to 5 to purchase accordingly");
            int product=sc.nextInt();
            if(product==1){
                int price=20;
                System.out.println("Enter quantity: ");
                int quantity=sc.nextInt();
                total+=quantity*price;
            }
            else if(product==2){
                int price=30;
                System.out.println("Enter quantity: ");
                int quantity=sc.nextInt();
                total+=quantity*price;
            }
            else if(product==3){
                int price=12;
                System.out.println("Enter quantity: ");
                int quantity=sc.nextInt();
                total+=quantity*price;
            }
            else if(product==4){
                int price=29;
                System.out.println("Enter quantity: ");
                int quantity=sc.nextInt();
                total+=quantity*price;
            }
            else if(product==5){
                int price=30;
                System.out.println("Enter quantity: ");
                int quantity=sc.nextInt();
                total+=quantity*price;
            }
            else if(product==6){
                System.out.println("Your Groceries bill :"+total);
                Scanner input = new Scanner(System.in);
                System.out.println("Enter total amount to pay the bill: ");
                int status = input.nextInt();
                if (status==total){
                System.out.println("Your order is placed");
                    break;
                }
                else{
                System.out.println("Please pay the bill to place order.");
                }
            }
            else{
                System.out.println("Enter a valid option!!");
            }
        }
    }
    public void Fruits() {
        int total=0;
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("(per 500g) 1.Apple 2.Orange 3.Strawberry 4.Banana(6 pieces) 5.Pineapple(1) 6.Pay bill");
            System.out.println("Enter nos 1 to 5 to purchase accordingly");
            int product=sc.nextInt();
            if(product==1){
                int price=25;
                System.out.println("Enter quantity: ");
                int quantity=sc.nextInt();
                total+=quantity*price;
            }
            else if(product==2){
                int price=30;
                System.out.println("Enter quantity: ");
                int quantity=sc.nextInt();
                total+=quantity*price;
            }
            else if(product==3){
                int price=40;
                System.out.println("Enter quantity: ");
                int quantity=sc.nextInt();
                total+=quantity*price;
            }
            else if(product==4){
                int price=30;
                System.out.println("Enter quantity: ");
                int quantity=sc.nextInt();
                total+=quantity*price;
            }
            else if(product==5){
                int price=40;
                System.out.println("Enter quantity: ");
                int quantity=sc.nextInt();
                total+=quantity*price;
            }
            else if(product==6){
                System.out.println("Your Fruits bill :"+total);
                Scanner input = new Scanner(System.in);
                System.out.println("Enter total amount to pay the bill: ");
                int status = input.nextInt();
                if (status==total){
                System.out.println("Your order is placed");
                    break;
                }
                else{
                System.out.println("Please pay the bill to place order.");
                }
            }
            else{
                System.out.println("Enter a valid option!!");
            }
            
        }
    }
    public void Clothes() {
        int total=0;
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("1.Tshirt 2.Shirt 3.Jeans 4.Dress 5.Saree 6.Pay bill");
            System.out.println("Enter nos 1 to 5 to purchase accordingly");
            int product=sc.nextInt();
            if(product==1){
                int price=500;
                System.out.println("Enter quantity ");
                int quantity=sc.nextInt();
                total+=quantity*price;
                
            }
            else if(product==2){
                int price=400;
                System.out.println("Enter quantity");
                int quantity=sc.nextInt();
                total+=quantity*price;
            }
            else if(product==3){
                int price=700;
                System.out.println("Enter quantity ");
                int quantity=sc.nextInt();
                total+=quantity*price;
            }
            else if(product==4){
                int price=800;
                System.out.println("Enter quantity ");
                int quantity=sc.nextInt();
                total+=quantity*price;
            }
            else if(product==5){
                int price=3000;
                System.out.println("Enter quantity");
                int quantity=sc.nextInt();
                total+=quantity*price;
            }
            else if(product==6){
                System.out.println("Your Clothes bill :"+total);
                Scanner input = new Scanner(System.in);
                System.out.println("Enter total amount to pay the bill: ");
                int status = input.nextInt();
                if (status==total){
                System.out.println("Your order is placed");
                    break;
                }
                else{
                System.out.println("Please pay the bill to place order.");
                }
            }
            else{
                System.out.println("Enter a valid option!!");
            }
        }
    }
    public void voucher() {
       String[] arr={"You have received a voucher worth ₹200. Valid upto 23-12-2021.",
      	              "Get flat 20% on purchase at our stationary store. Redeem today.",
      	              "Get flat 10% off on Essentials. Valid upto 20-12-2021.",
      	              "Try our new product samples for free. Redeem Today.",
      	              "Mystery flash offer valid until this sunday!" + "\n" + "Choose one symbol out of the three:" + "\n" + " ! & ?" + "\n" + "and win exciting prices."};
      	Random r=new Random();        
      	int randomNumber=r.nextInt(arr.length);
      	System.out.println("Your discount is :"+arr[randomNumber]);
        System.out.println("Thankyou for purchasing. Come again.");
    }
    
}
public class Hello{
    public static void main(String args[]){
    while(true){
        retailshopbilling t = new retailshopbilling();
         Scanner sc = new Scanner(System.in);
         t.greeting();
         t.storeselection();
         System.out.println("Enter choice :");
         int x = sc.nextInt();
          if(x==1){
                t.StationaryItems();
                t.voucher();
           }
           else if(x==2){
                 t.Essentials();
                 t.voucher();
            }
            else if(x==3){
                t.Groceries();
                t.voucher();
            }
            else if(x==4){
                t.Fruits();
                t.voucher();
            }
            else if(x==5){
                t.Clothes();
                t.voucher();
            }
            else if(x==6){
                break;
            }
            else{
                System.out.println("Wrong choice");
            }
    }
}   

    
