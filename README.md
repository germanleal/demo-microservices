# Demo Microservicios Spring Boot & Spring Cloud

## Requerimientos

- Java 13
- Spring Boot 2
- Maven 
- MariaDB
- Docker
- Docker Compose

## Servicios


### Config Service
http://localhost:8090/customer-service/default
http://localhost:8090/product-service/default
http://localhost:8090/shopping-service/default
http://localhost:8090/registry-service/default

### Discovery  Service (Eureka)
    
http://localhost:8099/

### Microservice Productos
GET

http://localhost:8091/products

POST

http://localhost:8091/products

{
	"name":"Producto demo",
	"description":"Descripción producto demo",
	"stock":4,
	"price":30,
	"category":{"id":1,"name": "demo"}
}

### Microservice Clientes
GET

http://localhost:8092/customers

POST

http://localhost:8092/customers

{
	"numberID":"40408083",
	"firstName": "Pedro",
	"lastName": "Juan y Diego",
	"email": "pedro@juan.diego",
	"photoUrl": "",
	"region": {
		"id": 1
	}
}

### Microservice Shopping
GET

http://localhost:8093/invoices/

POST
http://localhost:8093/invoices/

{
	"numberInvoice": "002",
	"description": "invoice store",
	"customerId": 1,
	"items": [
		{
			"quantity": 1,
			"priceItem": 123.89,
			"productId": 1
		},

		{
			"quantity": 2,
			"priceItem": 45.01,
			"productId": 2
		}
	]
}

### Gateway 

Clientes

    http://localhost:8080/customers

Productos

    http://localhost:8080/products


Invoices

    http://localhost:8080/invoices

