# Simple CRUD Example with H2 Database and Spring Boot

This is a simple CRUD (Create, Read, Update, Delete) application built using Spring Boot and H2 database. The application manages a list of items, allowing basic operations via a RESTful API.

## Features

- Create new items
- Retrieve all items
- Retrieve a single item by ID
- Update an existing item
- Delete an item by ID
- In-memory H2 database for easy setup and testing

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven

### Running the Application

1. **Clone the repository:**
    ```bash
    git clone https://github.com/yourusername/crud-example.git
    cd crud-example
    ```

2. **Build and run the application:**
    ```bash
    ./mvnw spring-boot:run
    ```

3. **Access the H2 database console:**
    - URL: `http://localhost:8009/h2-console`
    - JDBC URL: `jdbc:h2:mem:testdb`
    - Username: `sa`
    - Password: (leave it empty)

## API Endpoints

- **Create a new item**
    - **URL:** `POST /api/items`
    - **Request Body:**
        ```json
        {
            "name": "Item Name",
            "description": "Item Description"
        }
        ```
    - **Response:**
        ```json
        {
            "id": 1,
            "name": "Item Name",
            "description": "Item Description"
        }
        ```

- **Retrieve all items**
    - **URL:** `GET /api/items`
    - **Response:**
        ```json
        [
            {
                "id": 1,
                "name": "Item Name",
                "description": "Item Description"
            }
        ]
        ```

- **Retrieve a single item by ID**
    - **URL:** `GET /api/items/{id}`
    - **Response:**
        ```json
        {
            "id": 1,
            "name": "Item Name",
            "description": "Item Description"
        }
        ```

- **Update an existing item**
    - **URL:** `PUT /api/items/{id}`
    - **Request Body:**
        ```json
        {
            "name": "Updated Item Name",
            "description": "Updated Item Description"
        }
        ```
    - **Response:**
        ```json
        {
            "id": 1,
            "name": "Updated Item Name",
            "description": "Updated Item Description"
        }
        ```

- **Delete an item by ID**
    - **URL:** `DELETE /api/items/{id}`
    - **Response:** `204 No Content`

## Project Structure

