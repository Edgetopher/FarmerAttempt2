package Just;

import Arod.Person;

import java.util.ArrayList;
import java.util.List;

public class Farmhouse {

    private ArrayList<Person> people = new ArrayList<Person>();
    private int numOfPeople = people.size();

    public Farmhouse(ArrayList<Person> people) {
        this.people = people;
    }

    public void addPeople(Person person) {
        people.add(person);
    }

    public String getPeople() {
        String str = "";
        for (int i = 0; i < people.size(); i++) {
            str = str + people.get(i) + "\n";
        }
        return str;
    }
        public int getNumOfPeople(Farmhouse farmhouse){
            return numOfPeople;
        }
    }

