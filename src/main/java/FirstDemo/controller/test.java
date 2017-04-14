package FirstDemo.controller;

import FirstDemo.server.TestLogDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sunholdIng on 2017/1/12.
 */
@Controller
@RequestMapping(value = "/hello")
public class test {

    @Autowired
    private TestLogDemo testLogDemo;

    @RequestMapping(value = "/hello")
    public String hello(){
        testLogDemo.testLog();
        return "hello";
    }
}
