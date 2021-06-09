package uz.mehrojbek.apppersondata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"series","number"}))
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastname;

    @Column(nullable = false)
    private String patronymic;

    @Column(nullable = false)
    private String series;//PASSPORT SERIES

    @Column(nullable = false)
    private String number;//PASSPORT NUMBER
}
