public class DeluxePizza extends Pizza {

    DeluxePizza(String base) {
        super(base);  
    }
    public void getPizzaPrice(){
        String bill="";
        bill+="deluxe pizza  :"+price+"\n";
        System.out.println(bill);
        
    }
    
}
