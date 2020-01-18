package frank.blog.mapper;

import frank.blog.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    boolean login(User user);
}
