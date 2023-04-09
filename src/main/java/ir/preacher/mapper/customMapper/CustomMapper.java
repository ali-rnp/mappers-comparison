package ir.preacher.mapper.customMapper;

import ir.preacher.dto.UserDTO;
import ir.preacher.model.User;

public class CustomMapper {
    public UserDTO userToUserDTO(User user){
        return new UserDTO(
                user.getName(),
                user.getFatherName(),
                user.getAge(),
                user.getUsername());
    }
}
