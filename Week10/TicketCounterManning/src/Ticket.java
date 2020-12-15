
public class Ticket {
	private static int ticketsRemaining = 28;
	private int ticketsBuying;
	
	public Ticket() {
		
	}

	public Ticket(int ticketsBuying, int ticketsRemaining) {
		this.ticketsBuying = ticketsBuying;
		Ticket.ticketsRemaining = ticketsRemaining;
	}


	public static int getTicketsRemaining() {
		return ticketsRemaining;
	}

	public static void setTicketsRemaining(int ticketsRemaining) {
		Ticket.ticketsRemaining = ticketsRemaining;
	}

	public int getTicketsBuying() {
		return ticketsBuying;
	}

	public void setTicketsBuying(int ticketsBuying) {
		this.ticketsBuying = ticketsBuying;
	}

	
	public String ticketsStatement(Ticket myTicket) {
		String result = "";
		
		if(ticketsBuying < 1 || ticketsBuying > 4) {
			result = "You must buy between 1 and 4 tickets. There are " + ticketsRemaining + " tickets left.";
		}
		else {
		
			if (ticketsBuying > ticketsRemaining) {
				result = "Sorry there are only " + ticketsRemaining + " tickets left.";
			}
			else if (ticketsBuying == ticketsRemaining) {
				ticketsRemaining = ticketsRemaining - ticketsBuying;
				result = "Congrats! You took the last tickets. You bought " + ticketsBuying + " tickets. There are " + ticketsRemaining + " tickets left.";
			}
			else if (ticketsBuying < ticketsRemaining) {
				ticketsRemaining = ticketsRemaining - ticketsBuying;
				result = "You bought " + ticketsBuying + " tickets. There are " + ticketsRemaining + " tickets left.";
			}
		}
		return result;
	
	}
	
	

}
