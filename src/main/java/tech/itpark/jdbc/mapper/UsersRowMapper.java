package tech.itpark.jdbc.mapper;

import org.springframework.jdbc.core.RowMapper;
import tech.itpark.jdbc.model.Users;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UsersRowMapper implements RowMapper<Users> {
    public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Users(
                rs.getLong("id"),
                rs.getString("name"),
                rs.getString("city"),
                rs.getInt("pet_age"),
                rs.getInt("typeOfAnimals"),
                rs.getString("breed"),
                rs.getString("pet_name"),
                rs.getString("pet_gender")
        );
    }

}
