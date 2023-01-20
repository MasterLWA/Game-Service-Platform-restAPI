package com.example.rootcode.rest.Service;
import com.example.rootcode.rest.model.RestModel;
import com.example.rootcode.rest.repository.RestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.*;

public class RestService {
    @Autowired
    private RestService restRepository;

    public RestModel addBLMethod(RestModel restModel){
        return restRepository.save(restModel); //save the data in the database
    }

    public Iterable<RestModel> findAll(){
        return restRepository.findll(); //return data from database
    }


}
