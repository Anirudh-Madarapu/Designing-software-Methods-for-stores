import java.util.Arrays;
import static org.junit.Assert.fail;
import org.junit.Test;


public class TestRetailStore {
    @Test
	public void initializeRetailStore(){
		GroceryStore r = new GroceryStore();
    }

    @Test
	public void test() {
        GroceryStore r = new GroceryStore();

		r.add("Anirudh", 10);

		assert r.contains("Anirudh", 10) == true;
		//see if Anirudh is in line 1 or line 2

		r.add("Bose",12345); //let's test for very large items

		assert r.contains("Bose", 12345) == true;

		//lets add multiple elements into a same line
		r.add("Kelly",83);
		r.add("Bose",83);
		r.add("ryan",83);

		//let's see who is on top of our line
		assert r.peek(83) == "Kelly";

		//dequeue and see who is on top
		r.remove(83);//dequeue

		assert r.peek(83) == "Bose";

		//Edge cases
		//let us see if Anirudh is in line 1 or in line 2
		assert r.peekByLine(1) == "Anirudh";

		//test exceptions
		try{
			r.peekByLine(-1);
		}catch(UnsupportedOperationException ex){

		}

		try{
			r.peekByLine(0);
		}catch(UnsupportedOperationException ex){

		}

		try{
			r.add("xyw25lk",-10);
		}catch(UnsupportedOperationException ex){

		}

		try{
			r.add("xyw25lk",-10);
		}catch(UnsupportedOperationException ex){

		}

		try{
			r.add("Bose",0); //
		}catch(UnsupportedOperationException ex){

		}

		//conclusion: for 0 and negative items we don't have any queues in our store
		r.greet(83);
		assert r.greet(83).equals("Hello Bose, How are you doing today?");

		//let's us try to make our data fail
		r.add("May",22);
		r.add("Rose",28);
		r.add("Kate",25);
		r.add("Rosi",24);
		r.add("Kati",30);
		r.add("Kathy",25);
		r.add("Kate",25);

		r.peekByLine(3);
		assert r.peekByLine(3) == "May";

		//there are 5 customers in line 3, lets test that
		assert r.lineLength(3) == 7;

		r.removeByline(3);

		//now size should shrink by 1 and Rose will come on top;
		assert r.lineLength(3) == 6;
		assert r.peekByLine(3) == "Rose";

		assert r.greetByline(3).equals("Hello Rose, How are you doing today?");

		//let's see if can remove something from an empty list

		r.removeByline(3);
		r.remove(23); //remove from line 3 but by using a number that comes in line 3
		r.remove(21);
		r.remove(29);
		r.removeByline(3);
		r.removeByline(3);

		//now we should get an error
		try{
			r.remove(21); //
		}catch(UnsupportedOperationException ex){

		}

		//lets add something to line 3
		r.add("Rick",21);
		r.add("RiCk",21);
		r.add("RICK",21);
		r.add("Ric1k",21);

		assert r.peek(22) == "Rick";

		r.remove(29);
		assert r.peek(22) == "RiCk";

		r.removeByline(3);
		assert r.peek(22) != "RICk";
		assert r.peek(22) == "RICK";

		r.remove(29);
		r.remove(29);


		try{
			r.remove(27); //
		}catch(UnsupportedOperationException ex){

		}




	}

}
