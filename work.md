@SpringBootApplication
    core of SpringBoot Annotation
    Combination of @Configuration , @AutoConfiguration, @ComponentScann
    we can declar more then Bean

@Configuration
    Spring @Configuration annotation is part of the spring core framework. Spring Configuration annotation indicates that the class has @Bean definition methods. So Spring container can process the class and generate Spring Beans to be used in the application.
    
@componentScan
@ComponentScan is an annotation used in the Spring Framework for auto-detecting and registering Spring-managed components (e.g. beans, controllers, services, repositories, etc.) within a specified package or set of packages.

@component
    to make the class  as object its used in class leble
    we cant write own logic
@Bean
    it diclar inside class and to make the class as bean object
    we can write own logice
    we declar the class as a method and use @Bean annotation

@Autowired
    @Autowired is an annotation in Spring Framework that enables dependency injection for Java classes. It allows Spring to automatically inject dependencies into the class, eliminating the need for manual configuration. This annotation can be used to inject dependencies into fields, methods, and constructors.

@Qualifier
    if Multipule Beanare present then to dedermime which bean to called

@ResponseBody
The @ResponseBody annotation tells a controller that the object returned is automatically serialized into JSON and passed back into the HttpResponse object.

@RequestBody
@RequestBody is used to extract the HTTP request body data, often in JSON or XML format, and deserialize it into a Java object. @RequestParam is used to extract individual parameter values from the request URL or submitted form data.
    
@RestController
    Combination of @Controller and @ResponseBody


@GetMapping
@GetMapping annotation is used for mapping HTTP GET requests onto specific handler methods. It is composed annotation that acts as a shortcut for @RequestMapping(method=RequestMethod. GET).
@PostMapping
Specifically, @PostMapping is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod. POST) . NOTE: This annotation cannot be used in conjunction with other @RequestMapping annotations that are declared on the same method.
@PutMapping
As we know PUT HTTP method is used to update/modify the resource so the @PutMapping annotation is used for mapping HTTP PUT requests onto specific handler methods. Specifically, @PutMapping is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod. PUT).
@Services
@Repository
@EnableAutoConfigurations
@EnableWebMvc
@PropertySource
@Value
@ConfigureProperties
@ConditionalOnProperty