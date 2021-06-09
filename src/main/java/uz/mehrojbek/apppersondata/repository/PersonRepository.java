package uz.mehrojbek.apppersondata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.mehrojbek.apppersondata.entity.Person;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person,Integer> {

    Optional<Person> findBySeriesAndNumber(String series, String number);

}
