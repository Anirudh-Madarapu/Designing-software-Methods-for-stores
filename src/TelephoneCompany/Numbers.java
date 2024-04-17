import java.util.LinkedList;

public class Numbers {
    private LinkedList<Integer> n;
    public Numbers(){
        n = new LinkedList<Integer>();

    }

    public void addNumber(int number) {
         n.addFirst(number); // this takes O(1) to add
	}

    public boolean contains(int number){
        return n.contains(number); //returns true if there is given number
    }

}
