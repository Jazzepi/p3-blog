package com.pinnegar;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonTest {

    @Test
    public void should_not_have_child_after_death() {
        Person sicklyChild = new Person("Sickly Child 2");
        Person person = new Person("Mike").addChildren(new Person("Child 1"), sicklyChild, new Person("Child 3"));

        sicklyChild.die();

        assertThat(person.getChildren()).hasSize(2);
        assertThat(sicklyChild.getLivingStatus()).isEqualTo(Person.LIVING_STATUS.DEAD);
    }
}
