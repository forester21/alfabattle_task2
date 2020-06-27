package ru.forester.task5.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.forester.task5.model.Status;

@RestController
public class MainController {

    @GetMapping("/admin/health")
    public Status health(){
        return new Status("UP");
    }

    @GetMapping("/analytic/{userId}")
    public ResponseEntity<Status> analytic(@PathVariable String userId){
        return new ResponseEntity<>(new Status("user not found"), HttpStatus.NOT_FOUND);
    }


}
