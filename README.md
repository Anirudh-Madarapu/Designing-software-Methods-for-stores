# Algorithms for Barista
For this problem, I am using a HashMap that maps card numbers to customers. Customer is a class that consists of customer's information such as their favorite coffee, number of coupons they have, number of coffees they have, and their card Number. I have two classes Barista. In this scenario barista is not the person but the coffee shop name that customer has visited. I accidentally Named Barista because I didn't know the actual meaning of Barista before. I tried changing it to some other generic name, but I faced some refactoring issues. The reason behind using Map is to hold key and pair values together. On top of that, I used Hash Map because it takes less time to insert and search than TreeMap.
   Conventions and Assumptions made for this problem:

            Several types of coffees are similar in name, for example, Strawberry latte, Strawberry Dalgona,
            Strawberry milkshake, Strawberry macchiato, etc. Therefore, for simplicity favourites can be represented by numbers and strings.
            For example, a customer can put 5 as their favourite coffee also, they can add coffee name to the list.

     Classes Implemented:

            Barista

     Methods Used:

        All of the methods throw Unsupported operation exception, if the card number is negative or if the card number does not exist.
        If we try to add a card number that already exists, we still get an Unsupported operation exception.

              add()(Time complexity: O(1) & Space complexity: O(n)): An object of Barista invokes a customer class object upon calling with an Integer attribute.
              After creating a customer object, the card number and customer object will be added to the hash Map.

              order()(Time complexity: O(1) & Space complexity: O(n)):Takes card number and takes a specific number of orders.
              Based on the card Number, the number of coffees get updated accordingly for that particular Customer object.
              To fetch Customer object, we are using get operation.

              getCoupons(), getfavorite(),addfavorite()(Time complexity: O(1) & Space complexity: O(n)): All of these methods work similarly.
              They return number of coupons, favorite coffee, and assign favourite to the Customer respectively.

              containsCustomer(), getCustomer() (Time complexity: O(1) & Space complexity: O(n)): returns true if customer is present,
              false if not & returns customer based on card number respectively.


# Write Up For problem 6
For this problem, I have decided to use two HashMaps. One Hash Map maps Integers to people and the other Hash Map maps String to Numbers. People and Numbers are two classes. People stores names of customers that have same number. Numbers class objects store numbers of one particular name. I am using Hash Maps because the question specifies to search and add as quickly as possible. To achieve this goal, Hash Map is a best solution.

      Conventions and Assumptions made for this problem:
                    Phone Numbers should not be negative. Whenever, we try to add a negative number, we will
                    get unsupported operation exception.

           Classes Implemented:
                AddressBook
                People
                Numbers

            Methods Used:

                 add()(Time complexity: O(1) & Space complexity: O(n)): This method takes a string and integer. The String gets added to People Class object
                that corresponds to the given number. Similarly, the number gets added to Numbers Class object that corresponds to given String.
                This method involves get and contains operation so in worst case, this methid takes O(n) space.

                containsNumber()(Time complexity: O(1) & Space complexity: O(n)): This method takes an Integer and checks the hash Map that pairs Integers to
                people to see if the given number is there in the hash map by using containsKey() operation.

                containsPerson()(Time complexity: O(1) & Space complexity: O(n)): This method takes an string and checks the hash Map that pairs strings to
                Numbers to see if the given string is there in the hash map by using containsKey() operation.

                paired()(Time complexity: O(1) & Space complexity: O(n)): This method takes an Integer and a string to see if there exists atleast one pair
                where the given string and given integer match each other. In other words, the given string must have the given number in <String, Numbers> hash map
                and vice versa in <Integer, People>.

                printSortedNames() & printSortedNumbers()(Time complexity: O(nlogn) & Space complexity: O(n)):
# Write Up For problem 7
For this problem, I am using a Hash Map. This Hash Map maps string to class Line. When a customer enters the number of items they have, the items will get divided by 10 and then get incremented. Later this number will be added to string "line". Each kay in the map is a string called line and followed by a number. For example, line1, line2, lin3, etc. When we try to remove a person by the items they have, they line will be decided after dividing number of items by 10 and adding 1 to it. If a person has 23 items, they are in "line3" as 23/10 + 1 = 3 and "line"+3 is line3.

           Conventions and Assumptions made for this problem:
           
                Items cannot be less than 0. Whenever, we try to add a negative number, we will
                face unsupported operation exception. As asked in the question, 1-10 items go in line 1. Therefore,
                for integers that are divisible by 10(10,20,30) we will not increment line number by 1. In other words, 10 items customer
                will stay in line 1 not line 2.

           Classes used:

             GroceryStore
             Line(linked list, we will add a person to the list)

          Methods Used:

                add()(Time complexity: O(1) & Space complexity: O(n)): This method takes a name and number of items. Uses get and contains operations
                to place the element in the correct spot.

                remove()(Time complexity: O(1) & Space complexity: O(n)): This method takes number of items. Based on the number of items,
                it decides which key and value pair the line corresponds to. From there, it will remove the first element from the line.

                removeByline()(Time complexity: O(1) & Space complexity: O(n)): This method works similar to remove() except for taking line number
                instead of taking number of items.

                contains()(Time complexity: O(1) & Space complexity: O(n)): Returns a boolean value based on if the give person exists in the line.

                peek() & peekByline()(Time complexity: O(1) & Space complexity: O(n)): Returns the name of person that is in front of the queue based
                on number of items and line number respectively

                greet() & greetByline()(Time complexity: O(1) & Space complexity: O(n)): greets the person that is in front of the queue based
                on number of items and line number respectively

                linelength()(Time complexity: O(1) & Space complexity: O(n)): returns length of the line




