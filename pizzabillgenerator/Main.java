import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("which pizza you want \n 1.VEG\n  2.Nonveg  \n 3.deluxe");
        String base=sc.next();
        if(base.equals("deluxe"))
        {
            Pizza p=new DeluxePizza(base);
            System.out.println("you want opt takeaway");
            int choice=sc.nextInt();
            if(choice==1){
                p.takeaway();
            }
            else{
                System.out.println("Welcome >>>>");
            }
            p.getPizzaPrice();
            
        }
        else{
            Pizza p=new Pizza(base);
        System.out.println("you want to add extracheese");
        int choice=sc.nextInt();
        if(choice==1){
            p.extracheese();
        }
        else{
            System.out.println("stay fit");
        }
        System.out.println("you want to add extra topings");
        choice=sc.nextInt();
        if(choice==1){
            p.extratopings();
        }
        else{
            System.out.println("you miss veggies");
        }
        System.out.println("you want opt takeaway");
        choice=sc.nextInt();
        if(choice==1){
            p.takeaway();
        }
        else{
            System.out.println("Welcome >>>>");
        }
        p.getPizzaPrice();
       
        }
        System.out.println("Thank you for choosing ....enjoy your pizza \n");
    }
}
