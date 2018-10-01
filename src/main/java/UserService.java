import java.awt.List;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

public interface UserService {

	User create(User user);

	User delete(int id);

	List findAll();

	User findById(int id);

	User update(User user);

}
