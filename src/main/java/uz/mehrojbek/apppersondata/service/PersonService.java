package uz.mehrojbek.apppersondata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.mehrojbek.apppersondata.entity.Person;
import uz.mehrojbek.apppersondata.payload.ApiResponse;
import uz.mehrojbek.apppersondata.repository.PersonRepository;

import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public ApiResponse getBySeriesAndNumber(String series, String number) {
        Optional<Person> optionalPerson = personRepository.findBySeriesAndNumber(series, number);
        return optionalPerson.map(person -> new ApiResponse("ok", true, person)).orElseGet(() -> new ApiResponse("data not found", false));
    }
}
