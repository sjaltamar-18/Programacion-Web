package unimag.edu.co.rentacar;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "DriverLicenses")
public class DriverLicense {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;

    @Column(unique = true)
    String LicenseNumber;

    @Column(nullable = false)
    String Category;

    @Column(nullable = false)
    LocalDate IssueAt;

    @Column(nullable = false)
    LocalDate ExpiresAt;

    @OneToOne(optional = false)
    @JoinColumn(name = "User_Id", referencedColumnName = "Id")
    private User user;
}
