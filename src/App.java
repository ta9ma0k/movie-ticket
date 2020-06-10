
import java.time.LocalTime;

import movie.Movie;
import ticketorder.TicketOrder;


public class App {
    public static void main(String[] args) throws Exception {
        Movie doraemon = new Movie("ドラえもん", LocalTime.of(10, 0), 100);
        Movie kamerawotomeruna = new Movie("カメラを止めるな", LocalTime.of(21, 00), 30);

        TicketOrder order1 = new TicketOrder(1,1,doraemon);
        TicketOrder order2 = new TicketOrder(1, 1, kamerawotomeruna);

        order1.show();
        order2.show();
        // title: 
        // start time :
        // adult: 1500 yen 
        // child: 2000 yen
        // total: 3500 yen
    }
    
}
