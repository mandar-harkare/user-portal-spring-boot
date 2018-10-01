import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

@Service
import com.devglan.userportal.UserRepository;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User create(User user) {
        return repository.save(user);
    }

    @Override
    public User delete(int id) {
        User user = findById(id);
        if(user != null){
            repository.delete(user);
        }
        return user;
    }

    @Override
    public List findAll() {
        return (List) repository.findAll();
    }

    @Override
    public User findById(int id) {
        return repository.findOne(id);
    }

    @Override
    public User update(User user) {
        return null;
    }
}