package org.javers.organization.structure.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Exclude;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Entity
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class HierarchyEmployees implements Serializable {

  @Id
  @GeneratedValue
  private int id;

  @ToString.Exclude
  @EqualsAndHashCode.Exclude
  @ManyToOne//(cascade = CascadeType.ALL)
  @JsonIgnore
  private Hierarchy hierarchy;

  @ManyToOne(cascade = CascadeType.ALL)
  private Employee boss;

  @ManyToOne(cascade = CascadeType.ALL)
  private Employee subordinate;

}
