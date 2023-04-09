package ir.preacher.mapper.mapStruct;

import ir.preacher.dto.UserDTO;
import ir.preacher.model.User;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-09T09:21:58+0430",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.4.1 (Oracle Corporation)"
)
public class MapstructImpl implements Mapstruct {

    @Override
    public UserDTO userToUserDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setName( user.getName() );
        userDTO.setFatherName( user.getFatherName() );
        userDTO.setAge( user.getAge() );
        userDTO.setUsername( user.getUsername() );

        return userDTO;
    }
}
