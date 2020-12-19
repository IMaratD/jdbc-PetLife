package tech.itpark.jdbc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.itpark.jdbc.manager.UsersManager;
import tech.itpark.jdbc.model.Users;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    @Autowired
    private final UsersManager manager;

    @GetMapping
    public List<Users> getAll() {
        return manager.getAll();
    }

    @GetMapping("/{id}")
    public Users getById(@PathVariable long id) {
        return manager.getById(id);
    }

    @GetMapping("/search")
    public List<Users> search(@RequestParam("breed") String breed
    ) {
        return manager.search(breed);
    }



    @PostMapping
    public Users save(@RequestBody Users item) {
        return manager.save(item);
    }

    @DeleteMapping("/{id}")
    public Users removeById(@PathVariable long id) {
        return manager.removeById(id);
    }

}
