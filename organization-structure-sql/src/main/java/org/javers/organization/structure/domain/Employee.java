package org.javers.organization.structure.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Entity
@Table
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Employee implements Serializable {

  @Id
  @Column(name = "domain_name")
  private String domainName;

  @OneToOne(cascade = CascadeType.ALL)
  @JsonIgnore
  private Person person;
}

