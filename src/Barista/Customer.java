import java.util.Arrays;
import static org.junit.Assert.fail;
import org.junit.Test;



public class Customer {
	private int cardNumber;
	private int coupons;
	private int coffees;
	private int favorite;
	private String favoriteName;

  public Customer(int cardNumber) {
	  this.cardNumber = cardNumber;
  }

  public void Order(int coffee) {
	  this.coffees += coffee; // keep adding coffees ordered to coffees attribute
	  if(this.coffees >= 3) {
		  coupons += this.coffees/3; //integer division gives whole numbers so we only have coupouns for every 3 coffees
		  this.coffees = coffees%3;	  //because it will reset to three after every three orders

	  }

  }

  public int getCoupons() { // returns number of Coupons
	  return this.coupons;
  }

  public int getNumber() { // returns card number
	  return this.cardNumber;
  }

  public void addfavorite(int favorite) {

	  this.favorite = favorite;//assign fav based on int
  }

  public int getfavorite() {  // returns the favourite coffee of the person
	  return this.favorite;
  }

  public void addfavoriteName(String fav){
	  this.favoriteName = fav; //assign fav based on string
  }

  public String getfavoriteName(){
	return this.favoriteName;//return fav coffee
  }


}
