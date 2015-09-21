package de.kern.springbootstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class PhoneBookController {

    @Autowired
    private PhoneBookService phoneBookService;

    @RequestMapping("/")
    public List<Contact> findAll() {
        return phoneBookService.findAll();
    }

}
