package ir.preacher.mapper.mapStruct;

import ir.preacher.dto.UserDTO;
import ir.preacher.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface Mapstruct {
    Mapstruct INSTANCE = Mappers.getMapper(Mapstruct.class);

    UserDTO userToUserDTO(User user);
}
