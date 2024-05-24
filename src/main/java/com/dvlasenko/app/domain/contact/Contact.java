package com.dvlasenko.app.domain.contact;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "phoneNumber")
    private String phoneNumber;


    @Override
    public String toString() {
        return String.format("{\"id\" : %d, " +
                        "\"firstName\" : %s, " +
                        "\"firstName\" : %s, " +
                        "\"phoneNumber\" : %s}",
                id, firstName, lastName, phoneNumber);
    }
}
