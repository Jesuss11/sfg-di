package jpico.springFrameworkCourse.sfgdi.controllers;

import jpico.springFrameworkCourse.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        System.out.println("Hello World!!!");
        return "Hi";
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
