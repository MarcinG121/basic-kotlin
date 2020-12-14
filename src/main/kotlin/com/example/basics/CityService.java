package com.example.basics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

public interface CityService {
    Collection<City> all();
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class City {
    Integer cityId;
    String city;
}