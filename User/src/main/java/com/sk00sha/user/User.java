package com.sk00sha.user;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "users")
public class User {
    @Id
    @SequenceGenerator(
            name = "user_id_sequence",
            sequenceName = "user_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_id_sequence"
    )
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
}
