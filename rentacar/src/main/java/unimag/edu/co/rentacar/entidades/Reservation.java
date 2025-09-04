package unimag.edu.co.rentacar.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(nullable = false)
    OffsetDateTime pickupAt;

    @Column(nullable = false)
    OffsetDateTime returnAt;

    @Column(nullable = false)
    BigDecimal totalPrice;

    @Column(nullable = false)
    String status;

    @ManyToMany
    @JoinTable(
            name ="Reservation_Vehicle",
            joinColumns = @JoinColumn(name = "Reservation_Id", referencedColumnName = "Id"),
            inverseJoinColumns = @JoinColumn(name = "Vehicles_Id",referencedColumnName = "Id")
    )
    private List<Vehicle> vehicles = new ArrayList<>();

    public void AddVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    @ManyToMany
    @JoinTable(
            name = "Reservation_User",
            joinColumns = @JoinColumn(name = "Reservation_Id", referencedColumnName = "Id"),
            inverseJoinColumns = @JoinColumn(name ="User_id", referencedColumnName = "Id")
    )
    private List<User> users = new ArrayList<>();
    public void AddUser(User user) {
        this.users.add(user);
    }
}
