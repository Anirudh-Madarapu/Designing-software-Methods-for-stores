import java.util.*;

public class Barista {
   private HashMap<Integer, Customer> customer; //let's create a HashMap that maps integer to customers
   private int cardNumber; //HashMap only deals with Card Numbers as that's the only thing fetched by swipe machine

   public Barista() {
	   customer = new HashMap<Integer, Customer>();
   }

   public void add(int cardNumber) {

	 if(cardNumber<0) { // by convention cardNumbers cant't be less than that
		throw new UnsupportedOperationException();
     }

	 if(customer.containsKey(cardNumber)) {
		 throw new UnsupportedOperationException(); // we don't want duplicate card Numbers
	 }

	 Customer c1 = new Customer(cardNumber);
     this.customer.put(cardNumber, c1);
   }

   public void order(int cardNumber, int coffees) {

	   if(!this.customer.containsKey(cardNumber)) {// if the card number is not registered the user is not considered our customer
		   throw new UnsupportedOperationException();
	   }
	   if(cardNumber<0) { // by convention cardNumbers cant't be less than that
		  throw new UnsupportedOperationException();
	   }
	   if(coffees<0) { // by convention cardNumbers cant't be less than that
			  throw new UnsupportedOperationException();
	   }
	   Customer c2 = customer.get(cardNumber);
	   c2.Order(coffees);
   }

   public int getCoupons(int cardNumber) {
	   if(!customer.containsKey(cardNumber)) {// if the card number is not registered the user is not considered our customer
		   throw new UnsupportedOperationException();
	   }
	   if(cardNumber<0) { // by convention cardNumbers cant't be less than that
			throw new UnsupportedOperationException();
	   }
	   Customer c2 = customer.get(cardNumber);
       return c2.getCoupons();

   }

   public int getfavorite(int cardNumber) {
	   if(!customer.containsKey(cardNumber)) { // if the card number is not registered the user is not considered our customer
		   throw new UnsupportedOperationException();
	   }
	   if(cardNumber<0) { // by convention cardNumbers cant't be less than that
			throw new UnsupportedOperationException();
	   }
	   Customer c2 = customer.get(cardNumber);
	   return c2.getfavorite();
   }

   public void addfavorite(int cardNumber, int favorite) {
	   if(!customer.containsKey(cardNumber)) { // if the card number is not registered the user is not considered our customer
		   throw new UnsupportedOperationException();
	   }

	   if(cardNumber<0) { // by convention cardNumbers cant't be less than that
			throw new UnsupportedOperationException();
	   }

	   if(favorite<0) { // by convention cardNumbers cant't be less than that
			throw new UnsupportedOperationException();
	   }
	   Customer c2 = customer.get(cardNumber);
	   c2.addfavorite(favorite);
   }

   public boolean containsCustomer(int cardNumber) {
	   if(cardNumber<0) { // by convention cardNumbers cant't be less than that
			throw new UnsupportedOperationException();
	   }
	   if(!customer.containsKey(cardNumber)) {
		   return false;
	   }
	   return true;
   }

   public Customer getCustomer(int cardNumber) {
	   if(cardNumber<0) { // by convention cardNumbers cant't be less than that
			throw new UnsupportedOperationException();
	   }
	   return customer.get(cardNumber);
   }
   public void addfavoriteName(int cardNumber, String fav){
	   if(cardNumber<0 || !customer.containsKey(cardNumber)) { // by convention cardNumbers cant't be less than that
			throw new UnsupportedOperationException();
	   }
	   Customer c2 = customer.get(cardNumber);
	   c2.addfavoriteName(fav);
   }

   public String getfavoriteName(int cardNumber){
	  if(cardNumber<0 || !customer.containsKey(cardNumber)) { // by convention cardNumbers cant't be less than that
			throw new UnsupportedOperationException();
	   }
	   Customer c2 = customer.get(cardNumber);
	   return c2.getfavoriteName();

   }


}
