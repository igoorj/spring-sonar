package br.com.study.sonarqube;

import br.com.study.sonarqube.model.Person;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest(classes = Person.class)
public class PersonTest {

    @Test
    public void testGetName() {

        Person person = new Person();
        person.setName("Arnaldo");
        Assert.isTrue(person.getName().equals("Arnaldo"),"Success");

    }

    @Test
    public void testConstructor() {

        Person person = new Person("Arnaldo", 15, "Brazilian");
        Assert.isTrue(person.getName().equals("Arnaldo"),"Success");
    }

    @Test
    public void testGetAge() {

        Person person = new Person();
        person.setAge(25);
        Assert.isTrue(person.getAge() == 25,"Success");

    }

    @Test
    public void testGetNationality() {

        Person person = new Person();
        person.setNationality("Brazilian");
        Assert.isTrue(person.getNationality().equals("Brazilian"),"Success");

    }
}
