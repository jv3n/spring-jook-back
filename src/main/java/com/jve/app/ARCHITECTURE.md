# Clean Architecture in the Project

This project follows the principles of Clean Architecture, proposed by Robert C. Martin (Uncle Bob). The philosophy of Clean Architecture prescribes an arrangement of software in concentric layers with a strong emphasis on separation of concerns.

### Domain Layer

- `EntityGateway`: An interface acting as a port for outgoing interactions with the database.
- `UseCaseBoundary`: A boundary interface outlining the structure of use cases.
- `UseCaseInteractor`: Contains the actual business logic for the use case.

### Application Layer

- `ApplicationController`: Acts as an entry point to the domain layer, consuming domain services and transforming the results as necessary.

### Infrastructure Layer

- `InfrastructureDAO`: An implementation of `EntityGateway`, responsible for actual database access.
- `InfrastructureRepository` & `InfrastructureRecordMapper`: Manage data persistency details.

### Web Layer

Handles HTTP-related activities, including the conversion of HTTP requests/responses to and from domain models.

- `WebController`, `WebResponse`, and `WebResponseMapper`: Responsible for handling HTTP requests, responses, and related conversions.

The code and logic in each layer have defined responsibilities, without unnecessary dependency on other layers. The inner layers (like the Domain layer) are insulated from changes in the outer layers.

## Code Package Structure

Packaging is done by feature, with all related classes/interfaces of a feature being grouped together. This modularity enables easy navigation and management of related code, improving maintainability.

## Key Advantages

- **Independent of external factors:** The business logic remains unaffected due to changes in the UI, database, frameworks, etc.
- **Testability:** The business rules can be tested independently without any need for the UI, database, web server, or any other external element.
- **Readability:** Code becomes easy to read and understand due to the separation of responsibilities among different layers.
- **Flexibility:** The modular package structure and decoupling of code make it easy to track bugs, maintain code, and manage the project.