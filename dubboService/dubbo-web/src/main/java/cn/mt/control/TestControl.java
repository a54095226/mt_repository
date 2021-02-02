package cn.mt.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControl {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
