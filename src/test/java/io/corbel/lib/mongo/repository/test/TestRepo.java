package com.bq.corbel.lib.mongo.repository.test;

import org.springframework.data.repository.CrudRepository;

import com.bq.corbel.lib.mongo.repository.PartialUpdateRepository;

/**
 * @author Alexander De Leon
 * 
 */
public interface TestRepo extends CrudRepository<TestBean, String>, PartialUpdateRepository<TestBean, String> {

	public TestBean findByA(String a);

}
