package MyCrud.project.Controller;

import MyCrud.project.Repository.UserRepository;
import MyCrud.project.users.UsuarioPadrao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<UsuarioPadrao> list(){
        return repository.findAll();
    }
    @PostMapping
    public void save(@RequestBody UsuarioPadrao user){
        repository.save(user);
    }
    @PutMapping
    public void update(@RequestBody UsuarioPadrao user){
        repository.save(user);
    }
    @GetMapping("/{username}")
    public UsuarioPadrao find(@PathVariable("/username") String username){
        return repository.findByUsername(username);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("/id") Integer id){
        repository.deleteById(id);
    }
}
