package com.codesquadz.repository;

import org.springframework.data.repository.CrudRepository;

import com.codesquadz.entity.Country;

public interface CountryRepository extends CrudRepository<Country, Integer> {

}