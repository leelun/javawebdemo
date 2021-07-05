package com.newland.springdatademo.test1;

import com.newland.springdatademo.po.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	@Transactional
	public void savePersons(List<Person> persons){
//		personRepository.save(persons);
	}
	
	@Transactional
	public void updatePersonEmail(String email, Integer id){
		personRepository.updatePersonEmail(id, email);
	}
}
