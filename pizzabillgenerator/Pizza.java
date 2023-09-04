public class Pizza{
     int price;
     String base;
    private int extracheese=100;
    private int extratopings=200;
    private int bacgpack=20;
    private int baseprize;

    private boolean cheese=false;
    private boolean toping=false;
    private boolean bag=false;

    Pizza(String base){
        this.base=base;
        if(base=="veg"){
            this.price=300;
        }
        else if(base.equals("deluxe")){
            this.price=700;
        }
        else{
            this.price=400;
        }
        baseprize=this.price;
    }
    
     void extracheese(){
       this.cheese=true;
        this.price+=extracheese;
    }
     void extratopings(){
        this.toping=true;
        this.price+=extratopings;
    }
     void takeaway(){
        this.bag=true;
        this.price+=bacgpack;
    }
     public void getPizzaPrice(){
       String bill="";
       bill+="base price   :"+baseprize+"\n";
       if(cheese){
            bill+="extra cheese   :"+extracheese+"\n";
       }
       if(toping){
            bill+="extra topings  :"+extratopings+"\n";
       }
       if(bag){
            bill+="carry bag cost  :"+bacgpack+"\n";
       }
       bill+="Your total bill is   :"+price+"\n";
       System.out.println(bill);
    }
}