package de.kern.springbootstarter;

import junit.framework.TestCase;
import junit.framework.TestResult;
import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsEmptyCollection.empty;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringbootstarterApplication.class)
public class PhoneBookServiceTest extends TestCase {

    @Autowired
    private PhoneBookService sut;

    @Test
    public void testFindAll() {
        List<Contact> result = sut.findAll();

        assertThat(result, not(empty()));
    }

}