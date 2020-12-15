import cards.*;
import moneyclip.MoneyClip;
import java.time.LocalDate;

public class MoneyClipTesterManning {

	public static void main(String[] args) {
		DriverLicense dl = new DriverLicense("Kelli", "0098778", LocalDate.of(2021, 8, 23));
		DMACCOneCard dmacc = new DMACCOneCard("Erica", "900933249");
		
		MoneyClip cardSlot1 = new MoneyClip();
		
		cardSlot1.addCard(dl);
		cardSlot1.addCard(dmacc);
		
		System.out.println(cardSlot1.formatCards(dl, dmacc));
		
		DriverLicense emily = new DriverLicense("Emily", "0098778", LocalDate.of(2020, 3, 20));
		CreditCard joe = new CreditCard("Joe", "1234567899991111", 344);
		
		MoneyClip cardSlot2 = new MoneyClip();
		
		cardSlot2.addCard(emily);
		cardSlot2.addCard(joe);
		
		System.out.println(cardSlot2.formatCards(emily, joe));
		
		System.out.println(cardSlot2.getExpiredCardCount(emily, joe));
		
		DMACCOneCard me = new DMACCOneCard("Kelli", "1QAZXSW");
		DMACCOneCard friend = new DMACCOneCard("Kelli", "1QAZXSW");
		
		System.out.println(me.equals(friend));
		
		DMACCOneCard dmacc2 = new DMACCOneCard("Hannah", "933988250");
		CreditCard carson = new CreditCard("Carson", "1111222233334444", 552);
		
		MoneyClip cardSlot3 = new MoneyClip();
		
		cardSlot3.addCard(dmacc2);
		cardSlot3.addCard(carson);
		
		System.out.println(cardSlot3.formatCards(dmacc2, carson));
		
		//Card a = new Card();
	}

}
