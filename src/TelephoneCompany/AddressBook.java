import java.util.*;
import java.util.Map;
import java.util.TreeMap;


public class AddressBook {
    private HashMap<Integer, People> p; //tree map sorts keys in an order and this operation is important for the question
	private HashMap<String, Numbers> q;

    public AddressBook(){
		//settingup objects
        p = new HashMap<Integer, People>();
        q = new HashMap<String, Numbers>();
    }

    public void add(int number, String name) {
		if(number<0){//negative numbers are not allowed
			throw new UnsupportedOperationException();
		}
		if(p.containsKey(number)) {//fetches the key if it already exists
			People n = p.get(number);
			n.addPerson(name);
		}
		else if(!p.containsKey(number)) {//create a new object called people
			People newp = new People();
			newp.addPerson(name);
			p.put(number,newp);
		}

		if(q.containsKey(name)) {
			Numbers t = q.get(name);
			t.addNumber(number);
		}
		else if(!q.containsKey(name)) {
			Numbers newn = new Numbers();
			newn.addNumber(number);
			q.put(name, newn);
		}

	}

	public boolean containsNumber(int number){
		if(number<0){//negative numbers are not allowed
			throw new UnsupportedOperationException();
		}
        return p.containsKey(number);
	}

	public boolean containsPerson(String person){
		return q.containsKey(person);
    }

	public boolean paired(int number, String name){
		if(number<0){ //negative numbers are not allowed
			throw new UnsupportedOperationException();
		}
		if(p.containsKey(number) && q.containsKey(name)){
            People p1 = p.get(number);
			Numbers n1 = q.get(name);
			if(p1.contains(name)&& n1.contains(number)){
				return true;
			}
		}
		return false;
	}

	public void printSortedNames(){
		Map<String, Numbers> sortedq = new TreeMap<String, Numbers>(this.q); //converts q into a sorted TreeMap
		System.out.println(sortedq.keySet());//keySet() allows us to print only keys by restricting values

	}

	public void printSortedNumbers(){
		Map<Integer, People> sortedp = new TreeMap<Integer, People>(this.p); //converts q into a sorted TreeMap
		System.out.println(sortedp.keySet());//keySet() allows us to print only keys by restricting values

	}


}
