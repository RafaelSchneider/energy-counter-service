package com.zenhomes.repository;

import com.zenhomes.model.Counter;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CounterRepository extends CrudRepository<Counter, Long> {

    @Query(value="select * from counters where id=?", nativeQuery = true)
    Counter getCounter(Long id);

}
