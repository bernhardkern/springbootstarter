package de.kern.springbootstarter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.collection.IsEmptyCollection.empty;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PhoneBookServiceTest {

    @Autowired
    private PhoneBookService sut;

    @Test
    public void testFindAll() {
        List<Contact> result = sut.findAll();

        assertThat(result, not(empty()));
    }

}