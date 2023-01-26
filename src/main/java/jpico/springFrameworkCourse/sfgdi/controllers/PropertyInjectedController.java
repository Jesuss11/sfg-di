package jpico.springFrameworkCourse.sfgdi.controllers;

import jpico.springFrameworkCourse.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("propertyGreetingService")
    public  GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
