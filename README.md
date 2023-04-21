# Introduction

This project is a Java programming project with Springboot framework to perform the basic four arithmetic operations with the two parameters received from the URL path. The system will receive two numbers to be used in arithmetic operations as parameters, perform the calculation using the specified operator, display the result, and save this information into a MySQL database that has been linked in advance.
</br>
</br>

# Functions

There are four components:
 * [`Controller`](#controller)
 * [`Service`](#service)
 * [`Repository`](#repository)
 * [`Entity`](#entity)
</br>
</br>

> ### Entity 
>
> Since the entity is linked with ***elements*** table in MySQL, `Elements.java` is the entity used for this service. There are five components: int type **calcID**, double type **a**, double type **b**, String type **type** and double type **result**. **Result** is calculated with two numbers **a** and **b**, **type** determines which operator would be modified for the arithmetic operation. 
</br>


> ### Repository 
>
> JPA Repository `ElementsRepository.java` for the `Elements.java` entity would be used for handling data access and storage. Springboot automatically create an instance of the repository and inject it into `Service` or `Controller` to simplify the process of managing data access to the ***Elements*** in MySQL. 
</br>


> ### Service 
>
> `Service` holds methods that would be modified for arithmetic operations. There are four methods written in Java corresponding to the four arithmetic types that are included in basic arithmetic operations. All those methods perform the arithmetic operation first, save two numbers thrown, the arithmetic type and computed results into the database, and finally return the result of the operation. `save()` is independently defined by automatically invoking specific function by the `ELementsRepository.java` to save information.

> ### Controller
> 
> Finally, `DemoController.java` would define URL paths based on methods in `SatoakiService.java`. **@GetMapping** annotation with `/calc/{type}` path is defined and two parameters (double type ***a*** and double type ***b***) are requested and string type ***type*** is required since it is **PathVariable**. Based on the arithmetic type specified through PathVariable, the corresponding case defined in a switch statement is executed and the result is displayed in the format of `a + symbol + b + " = " + result2`.
