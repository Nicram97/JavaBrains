package io.javabrains.courseapidata;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

//Data service
public interface TopicRepository extends CrudRepository<Topic,String> { // extending interface with basic CRUD functions

}
