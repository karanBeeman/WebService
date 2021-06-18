package com.practical.webservices.restfulwebservices.helloWorld;


import com.practical.webservices.restfulwebservices.User.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserDaoService userDaoService;

    @Autowired
    private RecursiveBean recursiveBean;

    @Autowired
    private CustomCompareService customCompareService;

    @GetMapping(path = "/users")
    public List<User> retrievedAllUsers() {
        return userDaoService.findAll();
    }

    @GetMapping(path = "/users/{id}")
    public User retrieveUser(@PathVariable int id) {
        return userDaoService.findOne(id);
    }

    @PostMapping(path = "/users")
    public ResponseEntity createUser(@RequestBody User user) {
       User savedUser = userDaoService.save(user);

         URI loc = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId()).toUri();

       return ResponseEntity.created(loc).build();
    }

    @GetMapping(path = "/naturalCompareTo")
    public List<User> CompareToSort() {
       List<User> ascendingOrder = userDaoService.compareToMethod();
       return ascendingOrder;
    }

    @GetMapping(path = "/customSort")
    public List<CustomCompareByComparator> customSort() {
        return customCompareService.customSortMethod();
    }

}
