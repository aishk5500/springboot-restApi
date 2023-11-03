# springboot-restApi

### Trascation flow

Imagine a restraunt scenario where customer orders and waiter(controller) who accepts the order and passes the order to the specific chefs(service) who make those dishes, chefs will call the people to get the items(Dao/ repository) who goes and gets the stocks (Database).
#### Whenever a request hits the browser *Controller* is the first one to accept the request
#### 1. Controller
#### 2. Service layer
#### 3. Dao layer
#### 4. Database

###### In this Project for ```pom.xml``` we will be using ```spring-web``` ```mysql driver``` for using database ```spring data jpa``` dependencies are used. 
 Let's look at some of the annotations in the project,
```@SpringBootApplication``` - the starting point of the application which has the main class. main class has a run method ```SpringApplication.run```

```@RestController``` - Representational state transfer, the data is transfered in JOSN format and the controller is of REST API so the restController annotation is used.

```@PostMapping``` - to *Create* 

```@GetMapping``` - to *Retrieve*

```@PutMapping``` - to *Update*

```@DeleteMapping``` - to *Delete*

```@AutoWired``` - placed above the service class variable inside the Controller.
Spring creates a object of Implement class of the mentioned service and injects into the variable according to dependecy injection.
Helps in loose coupling (no need to modify the controller for any changes, only changing the implemented class will work without having to modify the whole controller).

```@Service``` - Spring gets to know that this is a service class which provides the *Implementation*

```@PathVariable``` - Used for indicating the variable passing from the url path

```@RequestMapping``` - A general annoation used in MVC, by default it will be GetMapping but by adding method it can be customised like
```@ReqestMapping(path="", method=RequestMethod.PUT)```

