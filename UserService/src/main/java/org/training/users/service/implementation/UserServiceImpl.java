package org.training.users.service.implementation;

import org.springframework.stereotype.Service;
import org.training.users.model.dto.Response;
import org.training.users.model.dto.UserDto;
import org.training.users.service.UserService;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public Response createUser(UserDto userDto) {
        // write your logic here
        return null;
    }

    @Override
    public List<UserDto> getAllUsers() {
        // write your logic here
        return null;
    }

    @Override
    public UserDto getUserProductInfoByUserId(Long userId) {
        // write your logic here
        return null;
    }

    @Override
    public Response updateUser(Long userId, UserDto userDto) {
        // write your logic here
        return null;
    }
}
