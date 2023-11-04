### Annotations Used in SpringBoot Application
#### ```@SpringBootApplication``` is an combination of ```@EnableAutoConfiguartion``` (Automatically configures the spring boot application with the ```pom.xml```) ,
```@ComponentScan``` (scans the bean so the bean will be visible IOC)  and 

### Spring Core annotations
```@configuartion``` (to define bean so the spring IOC can load them).

```@Component``` main stereotype annotation from which other annotations are derived (like service/ controller/ repo).

```@configuration``` - used to define bean with ```@bean``` without having to create object (just by using ```@Autowired``` above ```private SomeClass someClass``` in Controller the someClass object's bean will be created in the configuration Class with @bean above the method that returns the object)

```@Qualifier(someClassImplV2)``` - used below the ```@Autowired``` when two implemented classes are present for the interface, here the value in the brackets will be taken.

```@Primary``` - This annotation can be used below the ```@service``` which is one of the implementation class which will be loaded when the object is called.

```@Lazy``` - load the bean on demand. 

```@value``` - 