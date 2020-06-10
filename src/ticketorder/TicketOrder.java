package ticketorder;

import movie.Movie;

// Value Object
// class TicketCount {
//     private int value;

//     public TicketCount(int value) {
//         if (value < 0) throw new 
//         this.value = value;
//     }
// }

public class TicketOrder {
    private final int ADULT_PRICE = 1800;
    private final int CHILD_PRICE = 1300;
    private final int DISCOUNT_PRICE = 500;

    private Movie movie;
    private int adult;
    private int child;

    public TicketOrder(int adult,int child,Movie movie){
        this.movie = movie;
        this.adult = adult;
        this.child = child;
    }

    public void show(){    
        print(movie.getTitle());
        print(movie.getStartTime().toString());
        print("Adult:" + totalAdultPrice());
        print("Child:" + totalChildPrice());
        print("Total:" + totalPrice());

    }

    private int totalAdultPrice() {
        return caclTotalPrice(ADULT_PRICE, adult);
    }
    
    private int totalChildPrice(){
        return caclTotalPrice(CHILD_PRICE, child);
    }

    private int caclTotalPrice(int price, int ticketCount) {
        if(movie.isLateShow()){
            return (price - DISCOUNT_PRICE) * ticketCount;
        }
        return price * ticketCount;
    }

    private int totalPrice(){return totalChildPrice() + totalAdultPrice();}

    private void print(String string){
        System.out.println(string);
    }

} 