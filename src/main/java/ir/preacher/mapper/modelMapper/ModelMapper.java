package ir.preacher.mapper.modelMapper;

import ir.preacher.dto.UserDTO;
import ir.preacher.model.User;

public interface ModelMapper {
    UserDTO userToUserDTO(User user);
}
