package de.kern.springbootstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * Created by Bernhard on 21.09.2015.
 */
@Service
public class PhoneBookService {

    @Autowired
    private ContactsRepository contactsRepository;

    @Transactional
    public List<Contact> findAll() {
        return contactsRepository.findAll();
    }

}
