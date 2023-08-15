# Spring Boot Microservices Application for Employee-Department Details
Developed a comprehensive Spring Boot microservices application consisting of multiple services to efficiently manage and present employee-department details within an organization.

![Screenshot 2023-08-15 at 4 42 40 PM](https://github.com/sandyhandle/employee-details/assets/64911148/3f566211-86dd-455a-86c5-9ff1e7dea993)

## Services and Responsibilities:

### Department-Service:

Created a robust service to store and manage department details, ensuring accurate categorization of employees.

### Employee-Service:

Developed an employee information service, allowing efficient storage and retrieval of employee profiles along with their respective department affiliations.


### Service-Registry:

Set up a service registry to serve as a central server, enabling seamless service discovery and registration.

### Config-Server:

Configured a dedicated configuration server that dynamically provides YAML configuration details to the department-service, employee-service, and api-gateway, enhancing flexibility and maintainability.

### API-Gateway:

Implemented a secure API gateway to streamline communication between external clients and the department-service and employee-service, enhancing accessibility and security.

### Key Achievements:

- Orchestrated the integration of various microservices, ensuring efficient communication and cooperation between components.
- Leveraged Spring Boot's microservices architecture to enhance scalability, maintainability, and separation of concerns.
- Utilized Service Registry and API Gateway patterns to optimize service discovery and external access while maintaining security.
- Employed Config Server to centralize and manage configuration details, simplifying maintenance and updates.
- Contributed to the development of a cohesive and user-friendly platform that offers clear insights into employee-department relationships within the organization.

***

## POST
```
http://localhost:8060/department
```
Individually posting below 3 departments.
```
{
    "id":"1",
    "name": "DevOps"
}
```
```
{
    "id":"2",
    "name": "Alpha"
}
```
```
{
    "id":"3",
    "name": "Beta"
}
```

## GET
```
http://localhost:8060/department
```
By using the above GET we can get the below answer.
```
[
    {
        "id": 1,
        "name": "DevOps",
        "employees": []
    },
    {
        "id": 2,
        "name": "Alpha",
        "employees": []
    },
    {
        "id": 3,
        "name": "Beta",
        "employees": []
    }
]
```


## POST
```
http://localhost:8060/employees
```
Posting some Employees with the position details in the employees post

## GET
```
http://localhost:8060/employees
```
By using get we will be getting this below output. 
```
[
    {
        "id": 1,
        "departmentId": 1,
        "name": "June",
        "age": 19,
        "position": "SRE-3"
    },
    {
        "id": 2,
        "departmentId": 1,
        "name": "July",
        "age": 22,
        "position": "SRE-2"
    },
    {
        "id": 3,
        "departmentId": 1,
        "name": "August",
        "age": 23,
        "position": "SRE-1"
    },
    {
        "id": 4,
        "departmentId": 2,
        "name": "Jack",
        "age": 23,
        "position": "SDE-1"
    },
    {
        "id": 5,
        "departmentId": 2,
        "name": "Amy",
        "age": 23,
        "position": "SDE-1"
    },
    {
        "id": 6,
        "departmentId": 3,
        "name": "Emmy",
        "age": 23,
        "position": "SDE-1"
    },
    {
        "id": 6,
        "departmentId": 3,
        "name": "Emma",
        "age": 25,
        "position": "SDE-2"
    }
]
```

## GET
```
http://localhost:8060/department/with-employees
```
By using with-employees we can connect the departments with the employees. 
```
[
    {
        "id": 1,
        "name": "DevOps",
        "employees": [
            {
                "id": 1,
                "departmentId": 1,
                "name": "June",
                "age": 19,
                "position": "SRE-3"
            },
            {
                "id": 2,
                "departmentId": 1,
                "name": "July",
                "age": 22,
                "position": "SRE-2"
            },
            {
                "id": 3,
                "departmentId": 1,
                "name": "August",
                "age": 23,
                "position": "SRE-1"
            }
        ]
    },
    {
        "id": 2,
        "name": "Alpha",
        "employees": [
            {
                "id": 4,
                "departmentId": 2,
                "name": "Jack",
                "age": 23,
                "position": "SDE-1"
            },
            {
                "id": 5,
                "departmentId": 2,
                "name": "Amy",
                "age": 23,
                "position": "SDE-1"
            }
        ]
    },
    {
        "id": 3,
        "name": "Beta",
        "employees": [
            {
                "id": 6,
                "departmentId": 3,
                "name": "Emmy",
                "age": 23,
                "position": "SDE-1"
            },
            {
                "id": 6,
                "departmentId": 3,
                "name": "Emma",
                "age": 25,
                "position": "SDE-2"
            }
        ]
    }
]
```
## Zipkin
Zipkin is running on a Docker containder
```
http://localhost:9411/zipkin/
```
![Screenshot 2023-08-15 at 5 21 03 PM](https://github.com/sandyhandle/employee-details/assets/64911148/13c01764-884d-4d67-979d-7697751e071d)

## Eureka
```
http://localhost:8761/
```
![Screenshot 2023-08-15 at 5 22 02 PM](https://github.com/sandyhandle/employee-details/assets/64911148/a3efacec-ed02-4cd2-aa34-b2362996e754)


