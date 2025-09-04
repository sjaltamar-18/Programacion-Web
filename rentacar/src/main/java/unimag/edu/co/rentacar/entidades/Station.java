package unimag.edu.co.rentacar.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long Id ;

    @Column(nullable = false)
    String Name;

    @Column(nullable = false)
    String Address;

    @Column(nullable = false)
    String City;

    @OneToMany(mappedBy = "Station")
    private Set<Vehicle> Vehicles;

}
