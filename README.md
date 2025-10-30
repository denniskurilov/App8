# App8
## Spring Boot MVC CRUD Application (Entity + JPARepository + Service + Controller + Thymeleaf)

### Overview
**App8** is a Spring Boot application that provides a **web-based CRUD interface** for managing data in the `EMPLOYEE` table stored in an **Oracle Autonomous Database**.  
It follows a layered MVC architecture that uses **Spring Data JPA** with **JPARepository** for persistence, a **Service layer** for business logic, and **Thymeleaf** templates for the user interface.

---

### Technology Stack
- Java 17  
- Spring Boot  
- Maven  
- Oracle Autonomous Database (OCI)  
- Spring Web (MVC)  
- Spring Data JPA  
- Thymeleaf  

---

### Architecture
The project follows a standard **MVC + Service** structure:  
Controller → Service → Repository → Database  
and uses Thymeleaf templates for rendering UI views.

---

### Main Components
- **Entity** — represents the `Employee` data model  
- **Repository** — extends `JpaRepository` and provides CRUD operations  
- **Service** — contains business logic and communicates between Controller and Repository  
- **Controller** — handles web requests and returns Thymeleaf views  
- **Thymeleaf Templates** — render employee data in dynamic HTML pages  

---

### CRUD Operations (via Web Interface)
| Action | Endpoint | Description |
|--------|-----------|-------------|
| View all employees | `/employees` | Displays all employees in a table |
| Add new employee | `/employees/new` | Shows a form to create a new employee |
| Edit employee | `/employees/edit/{id}` | Shows a form to update existing employee |
| Delete employee | `/employees/delete/{id}` | Deletes an employee record |
