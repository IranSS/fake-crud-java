package MyCrud.project.Repository;

import MyCrud.project.users.UsuarioPadrao;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(UsuarioPadrao usuarioComum){
        if(usuarioComum.getId() == null){
            System.out.println("SAVE - salvando usuario.");
        }
        else{
            System.out.println("UPDATE - atualizando usuario no repositório");
        }
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir."));
        System.out.println(id);
    }
    public List<UsuarioPadrao> findAll(){
        System.out.println("LIST - listando os usuários do sistema.");
        List<UsuarioPadrao> usuarios = new ArrayList<>();
        usuarios.add(new UsuarioPadrao("Iran", "senha"));
        usuarios.add(new UsuarioPadrao("Larissa", "senha123"));
        return usuarios;
    }
    public UsuarioPadrao findById(Integer id){
        System.out.println(String.format("FIND/id - recebendo o id: %d para procurar no repositorio."));
        return new UsuarioPadrao("IranFindById", "senha");
    }
    public UsuarioPadrao findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar."));
        return new UsuarioPadrao("IranFindByName", "senha");
    }
}
