package com.in28miniutes.rest.webservices.restfulwebservices.user;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

@RestController
public class UserResource {

    private UserDaoService service;

    public UserResource(UserDaoService service) {
        this.service = service;
    }

    @GetMapping(path = "/users")
       public List<User> getAllUsers(){

           return  service.findAll();
       }

    @GetMapping(path = "users/{id}")
    public User  findOneUser(@PathVariable Integer id){

        User usr = service.findOneUser(id);;
        if(usr == null) throw new UserNotFoundException("Id:" + id);
        else return   usr;
    }
    @PostMapping(path = "/users")
    public  ResponseEntity<User> createUSer(@Valid @RequestBody User usr){
       User savedUser =  service.save(usr);
       URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand((savedUser.getId())).toUri();
         return ResponseEntity.created(location).build();

    }
    @DeleteMapping(path = "/users/{id}")
    public  void  deleteUser(@PathVariable Integer  id ){
        service.deleteUser(id);

    }
}
