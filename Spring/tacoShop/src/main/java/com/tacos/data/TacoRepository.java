package com.tacos.data;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.tacos.model.Taco;

public interface TacoRepository extends PagingAndSortingRepository<Taco, Long> {

}
