
import java.util.Arrays;
import static org.junit.Assert.fail;
import org.junit.Test;



public class TestBarista {

	@Test
	public void initializeBarista(){
		Barista ba = new Barista();
    }


	@Test
	public void testBarista() {
		Barista ba = new Barista();

		ba.add(10000);
		ba.add(10001);
		ba.add(10002);

		assert ba.containsCustomer(10000) == true;

		ba.order(10001,3);


		assert ba.getCoupons(10001) == 1;

		ba.order(10001, 30);
		assert ba.getCoupons(10001) == 11;

		//edge cases

		//let's see what happens when we add a card with number 0 on it
		ba.add(0);
		ba.order(0, 10000);
		assert ba.getCoupons(0) == 3333;


		//check to see if we get error when we order negative for 0 card number
		try {
			ba.order(0,-100);
		}catch(UnsupportedOperationException ex) {
			//does nothing
		}

		// checking if we can add card number with 1

		ba.add(1);
		ba.order(1, 235);
		ba.order(1, 34);
		assert ba.getCoupons(1) == 89;

		try {
			ba.add(-100);
		}catch(UnsupportedOperationException ex) {
			//does nothing
		}

		try {
			ba.order(0,-100);
		}catch(UnsupportedOperationException ex) {
			//does nothing
		}

        //try to add card number that is very long
		//adding favourite


		ba.add(2);
		ba.addfavorite(2,9);
		assert ba.getfavorite(2) == 9;

		ba.addfavoriteName(2,"chocolate");
		assert ba.getfavoriteName(2).equals("chocolate");

		ba.addfavoriteName(2,"choc");
		assert ba.getfavoriteName(2).equals("choc");

		try {
			ba.order(-0,-100);
		}catch(UnsupportedOperationException ex) {
			//does nothing
		}
		try {
			ba.order(980,1100);
		}catch(UnsupportedOperationException ex) {
			//does nothing
		}
		try {
			ba.addfavoriteName(882,"choc");
		}catch(UnsupportedOperationException ex) {
			//does nothing
		}








	}

}
