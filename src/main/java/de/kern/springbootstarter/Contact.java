package de.kern.springbootstarter;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@SuppressWarnings({"WeakerAccess", "unused"})
@Entity
@Table(name = "contacts")
@Getter
@Setter
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

}
