package com.company.WzorceProjektowe.PersonExampleZad;

import java.util.List;

public interface IPersonRepository {

    void addPerson(Person person);
    void reomovePerson(Person person);
    List<Person> getPersonList();

}
