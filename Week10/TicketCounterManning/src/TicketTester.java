import java.util.Scanner;

public class TicketTester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (Ticket.getTicketsRemaining() > 0) {
		
			System.out.println("How many tickets would you like to buy?");
			int ticketsBuying = in.nextInt();
			
			Ticket myTicket = new Ticket();
			myTicket.setTicketsBuying(ticketsBuying);
			
			System.out.println(myTicket.ticketsStatement(myTicket));
			
			
		}
		
		System.out.println("The show is sold out!");
		
		in.close();

	}

}
