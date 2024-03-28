# Active-Edge Exercises

## Description
Active-Edge Exercises solution


## Installation
## Installation
1. Clone the repository.
2. Navigate to the project directory containing the `pom.xml` file.
3. Build the project and install dependencies using Maven:
4. Start the Spring Boot application by running the following command:
`mvn spring-boot:run`




## Usage
Provide instructions on how to use your project, including any specific commands or steps needed.

## API Endpoints
- **GET /api/stocks/getAll**: Get all stocks.
- **GET /api/stocks/getById/{id}**: Get a stock by ID.
- **PUT /api/stocks/updatePrice/{id}**: Update the price of a stock.
- **POST /api/stocks/create**: Create a new stock.

## Sample Payloads
### Create New Stock
```json
{
  "id": 6,
  "name": "Corn",
  "currentPrice": 75.00,
  "createDate": "2024-03-28T15:41:56.763+00:00",
  "lastUpdate": "2024-03-28T15:41:56.763+00:00"
}
### Update Stock Price

{
  "currentPrice": 80.00
}