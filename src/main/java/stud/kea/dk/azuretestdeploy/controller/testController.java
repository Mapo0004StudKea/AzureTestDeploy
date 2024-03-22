package stud.kea.dk.azuretestdeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @GetMapping("/")
    public String index() {
        return "Hello World"+"\n You Suck!";
    }
}
