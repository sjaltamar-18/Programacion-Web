package unimag.edu.co.rentacar;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "Vehicles")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;

    @Column(nullable = false)
    String Plate;

    @Column(nullable = false)
    String Brand;

    @Column(nullable = false)
    String Model;

    @Column(nullable = false)
    Integer Year;

    @Column(nullable = false)
    String Status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Station_id")
    private Station Station;

    @ManyToMany(mappedBy = "Vehicles")
    private Set<Reservation> Reservations;
}
