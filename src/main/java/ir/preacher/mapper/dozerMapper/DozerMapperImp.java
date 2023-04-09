package ir.preacher.mapper.dozerMapper;

import ir.preacher.dto.UserDTO;
import ir.preacher.model.User;
import org.dozer.DozerBeanMapper;

public class DozerMapperImp implements DozerMapper{
    private final DozerBeanMapper mapper;

    public DozerMapperImp() {
        mapper = new DozerBeanMapper();
    }

    @Override
    public UserDTO userToUserDTO(User user) {
        return mapper.map(user,UserDTO.class);
    }
}
