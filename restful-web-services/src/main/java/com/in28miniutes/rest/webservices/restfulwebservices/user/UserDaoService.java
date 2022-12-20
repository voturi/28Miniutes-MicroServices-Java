package com.in28miniutes.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static Integer userCount = 0;

    static {
        users.add(new User(++userCount,"Adam", LocalDate.now().minusYears(25)));
        users.add(new User(++userCount,"Eve", LocalDate.now().minusYears(45)));
        users.add(new User(++userCount,"Joseph", LocalDate.now().minusYears(56)));
    }

    public List<User> findAll(){
        return users;

    }
    public User findOneUser(Integer id ){
        Predicate<?super User> predicate = user -> user.getId().equals(id);
        return  users.stream().filter(predicate).findFirst().orElse(null);
    }

    public User save(User user){
        user.setId(++userCount);
        users.add(user);
        return user;
    }
    public void deleteUser(Integer id){
        Predicate<?super  User> predicate = user -> user.getId().equals(id);
         users.removeIf(predicate);
    }
}
