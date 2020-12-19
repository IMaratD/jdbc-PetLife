package tech.itpark.jdbc.manager;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;
import tech.itpark.jdbc.mapper.UsersRowMapper;
import tech.itpark.jdbc.model.Users;

import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class UsersManager {
    private final NamedParameterJdbcTemplate template;
    private final UsersRowMapper rowMapper = new UsersRowMapper();

    public List<Users> getAll() {
        return template.query(
                "SELECT id, name, city, pet_age, typeOfAnimals, breed, pet_name, pet_gender FROM users ORDER BY id",
                rowMapper
        );

    }

    public Users getById(long id) {
        return template.queryForObject(
                "SELECT id, name, city, pet_age, typeOfAnimals, breed, pet_name, pet_gender FROM users WHERE id = :id",
                Map.of("id", id),
                rowMapper
        );
    }

    public List<Users> search(String breed) {
        return template.query(
                "SELECT id, name, city, pet_age, typeOfAnimals, breed, pet_name, pet_gender FROM users WHERE breed = :breed",
                Map.of("breed", breed),
                rowMapper
        );
    }

    public Users save(Users item) {
        if (item.getId() == 0) {
            KeyHolder keyHolder = new GeneratedKeyHolder();
            template.update(
                    "INSERT INTO users (name, city, pet_age, typeOfAnimals, breed, pet_name, pet_gender)" +
                            "VALUES (:name, :city, :pet_age, :typeOfAnimals, :breed, :pet_name, :pet_gender)",

                    new MapSqlParameterSource(Map.of(
                            "name", item.getName(),
                            "city", item.getCity(),
                            "pet_age", item.getPetAge(),
                            "typeOfAnimals", item.getTypeOfAnimal(),
                            "breed", item.getBreed(),
                            "pet_name", item.getPetName(),
                            "pet_gender", item.getPetGender()
                    )),
                    keyHolder
            );
            long id = keyHolder.getKey().longValue();
            return getById(id);
        }

            template.update(
                    "UPDATE users SET name = :name, city = :city, pet_age = :pet_age, typeOfAnimals = :typeOfAnimals, " +
                            "breed = :breed, pet_name = :pet_name, pet_gender = :pet_gender WHERE id = :id",
                    Map.of(
                            "id", item.getId(),
                            "name", item.getName(),
                            "city", item.getCity(),
                            "pet_age", item.getPetAge(),
                            "typeOfAnimals", item.getTypeOfAnimal(),
                            "breed", item.getBreed(),
                            "pet_name", item.getPetName(),
                            "pet_gender", item.getPetGender()
                    )
            );


        return getById(item.getId());
    }

    public Users removeById(long id) {
        Users item = getById(id);
        template.update(
                "DELETE FROM users WHERE id = :id",
                Map.of(
                        "id", item.getId()
                )
        );
        return item;
    }

}
