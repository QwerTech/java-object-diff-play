Sample application demonstrating the use of [java-object-diff](https://github.com/SQiShER/java-object-diff) with spring boot.

To start app execute :

```shell
./gradlew organization-structure-sql:run
```

## REST API

### Application exposes Swagger UI interface:

```http request
http://localhost:8080/swagger-ui/
```
#
### Create some hierarchical team

```http request
POST http://localhost:8080/audit/test/hierarchy
```

### Update created hierarchical team and show the diff

```http request
PUT http://localhost:8080/audit/test/hierarchy/{id}
```
Example output
```json
{
  "/hierarchyEmployees[HierarchyEmployeesDto(id=2, boss=EmployeeDto(domainName=frodo, person=PersonDto(id=0, firstName=Frodo, lastName=Baggins, sex=MALE, salary=9100, position=DEVELOPER)), subordinate=EmployeeDto(domainName=Holric, person=null))]/boss/domainName": "Property at path '/hierarchyEmployees[HierarchyEmployeesDto(id=2, boss=EmployeeDto(domainName=frodo, person=PersonDto(id=0, firstName=Frodo, lastName=Baggins, sex=MALE, salary=9100, position=DEVELOPER)), subordinate=EmployeeDto(domainName=Holric, person=null))]/boss/domainName' with value [ frodo ] has been removed",
  "/hierarchyEmployees[HierarchyEmployeesDto(id=2, boss=EmployeeDto(domainName=frodo, person=PersonDto(id=0, firstName=Frodo, lastName=Baggins, sex=MALE, salary=9100, position=DEVELOPER)), subordinate=EmployeeDto(domainName=Holric, person=null))]/boss/person/firstName": "Property at path '/hierarchyEmployees[HierarchyEmployeesDto(id=2, boss=EmployeeDto(domainName=frodo, person=PersonDto(id=0, firstName=Frodo, lastName=Baggins, sex=MALE, salary=9100, position=DEVELOPER)), subordinate=EmployeeDto(domainName=Holric, person=null))]/boss/person/firstName' with value [ Frodo ] has been removed",
  "/hierarchyEmployees[HierarchyEmployeesDto(id=2, boss=EmployeeDto(domainName=frodo, person=PersonDto(id=0, firstName=Frodo, lastName=Baggins, sex=MALE, salary=9100, position=DEVELOPER)), subordinate=EmployeeDto(domainName=Holric, person=null))]/boss/person/id": "Property at path '/hierarchyEmployees[HierarchyEmployeesDto(id=2, boss=EmployeeDto(domainName=frodo, person=PersonDto(id=0, firstName=Frodo, lastName=Baggins, sex=MALE, salary=9100, position=DEVELOPER)), subordinate=EmployeeDto(domainName=Holric, person=null))]/boss/person/id' has been added => [ null ]",
  "/hierarchyEmployees[HierarchyEmployeesDto(id=2, boss=EmployeeDto(domainName=frodo, person=PersonDto(id=0, firstName=Frodo, lastName=Baggins, sex=MALE, salary=9100, position=DEVELOPER)), subordinate=EmployeeDto(domainName=Holric, person=null))]/boss/person/lastName": "Property at path '/hierarchyEmployees[HierarchyEmployeesDto(id=2, boss=EmployeeDto(domainName=frodo, person=PersonDto(id=0, firstName=Frodo, lastName=Baggins, sex=MALE, salary=9100, position=DEVELOPER)), subordinate=EmployeeDto(domainName=Holric, person=null))]/boss/person/lastName' with value [ Baggins ] has been removed",
  "/hierarchyEmployees[HierarchyEmployeesDto(id=2, boss=EmployeeDto(domainName=frodo, person=PersonDto(id=0, firstName=Frodo, lastName=Baggins, sex=MALE, salary=9100, position=DEVELOPER)), subordinate=EmployeeDto(domainName=Holric, person=null))]/boss/person/position": "Property at path '/hierarchyEmployees[HierarchyEmployeesDto(id=2, boss=EmployeeDto(domainName=frodo, person=PersonDto(id=0, firstName=Frodo, lastName=Baggins, sex=MALE, salary=9100, position=DEVELOPER)), subordinate=EmployeeDto(domainName=Holric, person=null))]/boss/person/position' with value [ DEVELOPER ] has been removed",
  "/hierarchyEmployees[HierarchyEmployeesDto(id=2, boss=EmployeeDto(domainName=frodo, person=PersonDto(id=0, firstName=Frodo, lastName=Baggins, sex=MALE, salary=9100, position=DEVELOPER)), subordinate=EmployeeDto(domainName=Holric, person=null))]/boss/person/salary": "Property at path '/hierarchyEmployees[HierarchyEmployeesDto(id=2, boss=EmployeeDto(domainName=frodo, person=PersonDto(id=0, firstName=Frodo, lastName=Baggins, sex=MALE, salary=9100, position=DEVELOPER)), subordinate=EmployeeDto(domainName=Holric, person=null))]/boss/person/salary' with value [ 9100 ] has been removed",
  "/hierarchyEmployees[HierarchyEmployeesDto(id=2, boss=EmployeeDto(domainName=frodo, person=PersonDto(id=0, firstName=Frodo, lastName=Baggins, sex=MALE, salary=9100, position=DEVELOPER)), subordinate=EmployeeDto(domainName=Holric, person=null))]/boss/person/sex": "Property at path '/hierarchyEmployees[HierarchyEmployeesDto(id=2, boss=EmployeeDto(domainName=frodo, person=PersonDto(id=0, firstName=Frodo, lastName=Baggins, sex=MALE, salary=9100, position=DEVELOPER)), subordinate=EmployeeDto(domainName=Holric, person=null))]/boss/person/sex' with value [ MALE ] has been removed",
  "/hierarchyEmployees[HierarchyEmployeesDto(id=2, boss=EmployeeDto(domainName=frodo, person=PersonDto(id=0, firstName=Frodo, lastName=Baggins, sex=MALE, salary=9100, position=DEVELOPER)), subordinate=EmployeeDto(domainName=Holric, person=null))]/id": "Property at path '/hierarchyEmployees[HierarchyEmployeesDto(id=2, boss=EmployeeDto(domainName=frodo, person=PersonDto(id=0, firstName=Frodo, lastName=Baggins, sex=MALE, salary=9100, position=DEVELOPER)), subordinate=EmployeeDto(domainName=Holric, person=null))]/id' with value [ 2 ] has been removed",
  "/hierarchyEmployees[HierarchyEmployeesDto(id=2, boss=EmployeeDto(domainName=frodo, person=PersonDto(id=0, firstName=Frodo, lastName=Baggins, sex=MALE, salary=9100, position=DEVELOPER)), subordinate=EmployeeDto(domainName=Holric, person=null))]/subordinate/domainName": "Property at path '/hierarchyEmployees[HierarchyEmployeesDto(id=2, boss=EmployeeDto(domainName=frodo, person=PersonDto(id=0, firstName=Frodo, lastName=Baggins, sex=MALE, salary=9100, position=DEVELOPER)), subordinate=EmployeeDto(domainName=Holric, person=null))]/subordinate/domainName' with value [ Holric ] has been removed"
}
```
### Show the diff of two hierarchies

```http request
GET http://localhost:8080/audit/hierarchy/{left}/diff/{right}
```
