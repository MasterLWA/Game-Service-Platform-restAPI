package com.example.rootcode.rest.Controller;

import com.example.rootcode.rest.model.RestModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class RestControll {

    private RestModel restModel;
    public RestModel addorUpdate(@RequestBody RestModel restModel){

    }
    @PostMapping("/add")
    public void addRecord(){
        return restModel.addBLMethod(restModel);
    }

    @GetMapping("/get/{id}")
    public void findById(){

    }

     @GetMapping("/all")
     public void findAll(){
        return restModel.findAll();
     }
}
