package ir.preacher.mapper.modelMapper;

import ir.preacher.dto.UserDTO;
import ir.preacher.model.User;

public class ModelMapperImp implements ModelMapper{

    private final org.modelmapper.ModelMapper mapper;

    public ModelMapperImp() {
        mapper = new org.modelmapper.ModelMapper();
    }

    @Override
    public UserDTO userToUserDTO(User user) {
        return mapper.map(user, UserDTO.class);
    }
}
