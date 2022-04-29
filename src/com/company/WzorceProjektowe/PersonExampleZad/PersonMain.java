package com.company.WzorceProjektowe.PersonExampleZad;

public class PersonMain {
    public static void main(String[] args) {

        Person person1 = new Person("Karol", "44051401458");
        Person person2 = new Person("Karol", "44051401458");
        PersonRepository personRepository = new PersonRepository();

        personRepository.addPerson(person1);
        personRepository.addPerson(person2);
        personRepository.reomovePerson(new Person("Karol", "1dshg"));

        System.out.println(personRepository.getPersonList());

        System.out.println(personRepository);



    }
}
