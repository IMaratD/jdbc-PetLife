CREATE TABLE classOfAnimals
(
    id    INTEGER AUTO_INCREMENT PRIMARY KEY,
    class TEXT NOT NULL
);

CREATE TABLE typeOfAnimals
(
    id    INTEGER AUTO_INCREMENT PRIMARY KEY,
    class_id INTEGER NOT NULL REFERENCES classOfAnimals,
    type TEXT NOT NULL,
    squad TEXT NOT NULL
);


CREATE TABLE breedOfDogs
(
    id    INTEGER AUTO_INCREMENT PRIMARY KEY,
    breed TEXT NOT NULL
);

CREATE TABLE breedOfCats
(
    id    INTEGER AUTO_INCREMENT PRIMARY KEY,
    breed TEXT NOT NULL
);


create table users
(
	id INTEGER primary key auto_increment,
	name TEXT not null,
	city TEXT not null,
	pet_age REAL not null,
	typeOfAnimals INTEGER not null,
	breed TEXT not null,
	pet_name TEXT not null,
	pet_gender TEXT not null
);




