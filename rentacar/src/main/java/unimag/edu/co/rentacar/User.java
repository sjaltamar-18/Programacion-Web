package unimag.edu.co.rentacar;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    Long Id;

    @Column(nullable = false)
    String Name;

    @Column(nullable = false, unique = true)
    String Email;

    @Column(nullable = false, unique = true)
    String PhoneNumber;

    @ManyToMany(mappedBy = "Users")
    private List<Reservation> Reservations;

    @OneToOne(mappedBy = "Users")
    private DriverLicense DriverLicense;
}
