package ir.preacher.mapper.dozerMapper;

import ir.preacher.dto.UserDTO;
import ir.preacher.model.User;

public interface DozerMapper {
    UserDTO userToUserDTO(User user);
}
