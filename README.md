# Employee Details
This repo contains a simple project of maintaing a Employee and their respective Departments of an orginaziation. 

![Screenshot 2023-08-15 at 4 42 40 PM](https://github.com/sandyhandle/employee-details/assets/64911148/3f566211-86dd-455a-86c5-9ff1e7dea993)


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
