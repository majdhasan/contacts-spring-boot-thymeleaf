package life.majd.contact.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Contact {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @NotEmpty
  private String firstName;
  @NotEmpty
  private String lastName;
  @Email
  @NotEmpty
  private String emailAddress;
  private String phoneNumber;

}
