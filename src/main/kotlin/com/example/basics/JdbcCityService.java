package com.example.basics;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class JdbcCityService implements CityService {

    final JdbcTemplate jdbcTemplate;

    @Override
    public Collection<City> all() {
         return jdbcTemplate.query("SELECT * FROM City",
                (ResultSet rs, int rowNum) -> new City(rs.getInt("city_id"), rs.getString("city")));
    }
}
