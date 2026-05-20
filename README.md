# Spring Boot Arithmetic Exception Demo

A Spring Boot project with intentional issues for AI analysis and debugging practice.

## Project Description

This project is similar to the `springboot-issues-demo` but features an **arithmetic exception** instead of a division by zero exception.

## Key Issues

### 1. **Arithmetic Exception (Modulo by Zero)**
   - **Location**: `BadRestController.java` - `/hello` endpoint
   - **Issue**: `int x = 10 % 0;` throws `ArithmeticException`
   - **Impact**: Any request to `/api/hello` will crash with an arithmetic exception

### 2. **Improper Dependency Injection**
   - **Location**: `BadRestController.java`
   - **Issue**: `BadService` is instantiated directly instead of using Spring's `@Autowired` annotation
   - **Impact**: Not leveraging Spring's dependency injection and IoC container

### 3. **Unused Fields**
   - **Location**: `BadRestController.java` - `unusedField` variable
   - **Issue**: Field is declared but never used
   - **Impact**: Code clutter and maintenance confusion

### 4. **Null Pointer Risk**
   - **Location**: `BadService.java` - `getUserById()` method
   - **Issue**: Method returns `null` without proper exception handling
   - **Impact**: Potential null pointer exceptions in calling code

### 5. **Hardcoded Logic**
   - **Location**: `BadService.java` - `getUserById()` method
   - **Issue**: User retrieval logic is hardcoded instead of using a repository pattern
   - **Impact**: Not following proper architectural patterns

### 6. **Inefficient Search**
   - **Location**: `BadRepository.java` - `findUser()` method
   - **Issue**: Linear search on a list without proper indexing
   - **Impact**: Poor performance as data grows

## How to Run

```bash
mvn clean package
mvn spring-boot:run
```

## Testing the Issue

To trigger the arithmetic exception, make a request to:
```
GET http://localhost:8080/api/hello
```

This will result in an `ArithmeticException: / by zero`.

## Endpoints

- **GET /api/hello** - Triggers the arithmetic exception
- **GET /api/user/{id}** - Retrieves user information by ID
