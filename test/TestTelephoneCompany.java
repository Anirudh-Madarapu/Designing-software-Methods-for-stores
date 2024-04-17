import java.util.Arrays;
import static org.junit.Assert.fail;
import org.junit.Test;

public class TestTelephoneCompany {

    @Test
	public void initializeAddressBook(){
		AddressBook newBook = new AddressBook();
    }

    @Test
    public void test(){
        AddressBook newBook = new AddressBook();
        newBook.add(478934,"Anirudh");
        newBook.add(478334,"Kali");
        newBook.add(478134,"Justin");
        newBook.add(478634,"Jordan");

        assert newBook.containsNumber(478934) == true;

        assert newBook.paired(478934,"Anirudh") == true;

        assert newBook.containsPerson("Kali") == true;

        newBook.printSortedNames();

        newBook.add(478334,"Jordan");

        //edge cases

        try{
            newBook.containsNumber(-234);
        }catch(UnsupportedOperationException ex){

        }

        //let's add negative number

        try{
            newBook.add(-9786,"");
        }catch(UnsupportedOperationException ex){

        }

        //new edge cases
        newBook.add(00000,".....");
        newBook.add(1234558,"@#$!$&()");
        newBook.add(8,"@*^!$&([[[]]])");
        newBook.add(8,"@*^!$&([[[]]])"); //adding same element twice
        newBook.add(7262898,"(#$!$&()");
        newBook.add(1234558,"@)$!$&()");
        newBook.add(9282722,"@#^%$&()");
        newBook.add(4562628,"@#(&$&()");
        newBook.add(84647634,"@#(&$&()");
        newBook.add(1928727,"@#(&$&()");
        newBook.add(8761711,"@#(&$&()");
        newBook.add(2872829,"@#(&$&()");
        newBook.add(101019,"@#&*(&$&()");
        newBook.add(89,"@#(&$(76&()");



        newBook.printSortedNames(); //let's check if we can print names in list
        newBook.printSortedNumbers();//let's check if we can print numbers in list

    }

}
