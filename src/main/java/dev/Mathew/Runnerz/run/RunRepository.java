package dev.Mathew.Runnerz.run;

import java.util.List;

import org.springframework.data.repository.ListCrudRepository;

public interface RunRepository extends ListCrudRepository<Run, Integer> {
    //@Query
    List<Run> findAllByLocation(String location);
    
}
