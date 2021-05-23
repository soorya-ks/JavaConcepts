package generics;

import java.util.HashSet;

public class App {

    public static void main(String[] args){

//        Container<String, Integer, Boolean> first = new Container<>("Matheesh", 21, true);
//        Container<String, Integer, Boolean> second = new Container<>("Ashok", 22, false);
//        Container<String, Integer, Boolean> third = new Container<>("Divya", 20, false);

        HashSet<Container> people = new HashSet<>(); // HashSet<? extends Container> people = new HashSet<>();

        Container<String, Integer, Boolean> user1 = new Container<>();
        Container<String, Integer, Boolean> user2 = new Container<>();
        user1.setAll("Matheesh", 21, true);
        user2.setAll("Ashok", 22, false);

        people.add(user1);
        people.add(user2);

        for(Container item : people){
            System.out.println(item.toString());
        }



    }

}
