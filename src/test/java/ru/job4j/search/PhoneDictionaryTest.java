package ru.job4j.search;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(new Person("Petr", "Arsentev", "534872", "Bryansk"));
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname()).isEqualTo("Arsentev");
    }

    @Test
    public void whenNotFound() {
        PhoneDictionary phone = new PhoneDictionary();
        phone.add(new Person("Денис", "Лимитц", "3421123", "Москва"));
        ArrayList<Person> result = phone.find("Калининград");
        assertThat(phone.find("Roman")).isEmpty();
    }
}