package com.practical.webservices.restfulwebservices.helloWorld;

import com.practical.webservices.restfulwebservices.User.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    // DISPATCHER SERVLET - used to get the all the rest call and send back the response
    // springboot AutoConfiguration does all the autoConfiguration process.
    //HttpMessageConvertersAutoConfiguration and JacksonAutoConfiguration is responsible for json response

    //GET
    //URI - hello-world
   // @RequestMapping(method = RequestMethod.GET, path="/hello-world")
    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "hello world good";
    }

    //hello-world bean
    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("bean hello world");
    }

    //hello-world/path-variable/springboot
    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("hello world path %s", name));
    }
}
