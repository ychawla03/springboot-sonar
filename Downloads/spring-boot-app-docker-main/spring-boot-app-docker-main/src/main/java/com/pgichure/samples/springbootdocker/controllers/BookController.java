/**
 * 
 */
package com.pgichure.samples.springbootdocker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author pgichure
 */
@RestController
@RequestMapping("/books")
public class BookController {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@GetMapping
    public ResponseEntity<String> getUsers() {
        String query = "SELECT COUNT(*) FROM books";
        Integer count = jdbcTemplate.queryForObject(query, Integer.class);
        return new ResponseEntity<>("Total users: " + count, HttpStatus.OK);
    }

}
