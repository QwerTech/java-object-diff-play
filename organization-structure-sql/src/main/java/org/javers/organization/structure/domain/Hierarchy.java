package org.javers.organization.structure.domain;


import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Entity
@Table
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Hierarchy implements Serializable {

  @Id
  private String name;

  @OneToMany(mappedBy = "hierarchy", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  private List<HierarchyEmployees> hierarchyEmployees;
}
