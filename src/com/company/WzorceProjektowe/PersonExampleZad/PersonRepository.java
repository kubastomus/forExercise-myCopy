package com.company.WzorceProjektowe.PersonExampleZad;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PersonRepository implements IPersonRepository {

    List<Person> personList = new ArrayList<>();


    @Override
    public void addPerson(Person person) {
        if (!personList.contains(person)) {
            personList.add(person);
        } else {
            System.out.println("Osoba znajduje się w tablicy");
        }
    }

    @Override
        public void reomovePerson (Person person){
            if (personList.remove(person)){
                System.out.println("Udało się usunąć");
            };
        }


    @Override
    public List<Person> getPersonList() {
        return personList;    // do poprawy nie zwracamy oryginalnej listy
    }

    @Override
    public String toString() {
        return "PersonRepository{" +
                "personList=" + personList +
                '}';
    }


}
