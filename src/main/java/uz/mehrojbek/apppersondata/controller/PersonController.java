package uz.mehrojbek.apppersondata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.mehrojbek.apppersondata.payload.ApiResponse;
import uz.mehrojbek.apppersondata.service.PersonService;


@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping
    public HttpEntity<?> getBySeriesAndNumber(@RequestParam String series, @RequestParam String number){
        ApiResponse apiResponse = personService.getBySeriesAndNumber(series,number);
        return ResponseEntity.status(apiResponse.isSuccess()?200:404).body(apiResponse);
    }

}
