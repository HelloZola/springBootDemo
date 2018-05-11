package com.vi.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 访问demo
 */
@RestController
@RequestMapping("/springboot")
public class HelloWorldController {

    /**
     * 访问方法
     * @param name
     * @return
     */
    //访问路径：http://localhost:8080/springboot/xxxxx
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String sayWorld(@PathVariable("name") String name) {
        System.out.println("name = [" + name + "]");
        System.out.println("name = [" + name + "]");
        System.out.println("name = [" + name + "]");
        SayHiTest.sayHi();
        System.out.println("name = [" + name + "]");
        System.out.println("name = [" + name + "]");
        System.out.println("name = [" + name + "]");
        return "Hello " + name;
    }
}
