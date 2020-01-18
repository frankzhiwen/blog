package frank.blog.service;

import frank.blog.mapper.UserMapper;
import frank.blog.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean login(User user) {
        return userMapper.login(user);
    }
}
