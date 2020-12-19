INSERT INTO classOfAnimals (id, class)
VALUES (1, 'Invertebrates'),
       (2, 'Fish'),
       (3, 'Amphibians'),
       (4, 'Reptiles'),
       (5, 'Birds'),
       (6, 'Mammals');

INSERT INTO typeOfAnimals (id, class_id, type, squad)
VALUES (1, 6, 'Dogs', 'Carnivores'),
       (2, 6, 'Cats', 'Carnivores');

INSERT INTO breedOfDogs (id, breed)
VALUES (1, 'Akita'),
       (2, 'Alaskan Malamute'),
       (3, 'American Bulldogs'),
       (4, 'Labrador Retriever'),
       (5, 'Rottweiler'),
       (6, 'Russell Terrier'),
       (7, 'Toy Fox Terrier'),
       (8, 'Siberian Husky'),
       (9, 'Shetland Sheepdog'),
       (10, 'West Siberian Laika');


INSERT INTO breedOfCats (id, breed)
VALUES (1, 'Abyssinian'),
       (2, 'Birman'),
       (3, 'British Shorthair'),
       (4, 'Himalayan'),
       (5, 'Maine Coon'),
       (6, 'Persian'),
       (7, 'Scottish Fold'),
       (8, 'Siberian Cat'),
       (9, 'Siamese'),
       (10, 'Sphynx');


INSERT INTO users (id, name, city, pet_age, typeOfAnimals, breed, pet_name, pet_gender)
VALUES (1, 'Vasya', 'Kazan', 5, 1, 'Akita', 'Archie', 'male'),
       (2, 'Petya', 'Moscow', 3.5, 1, 'Labrador Retriever', 'Alma', 'female'),
       (3, 'Masha', 'Moscow', 3.5, 1, 'Labrador Retriever', 'Alma', 'female'),
       (4, 'Vladik', 'Moscow', 3.5, 1, 'Labrador Retriever', 'Alma', 'female'),
       (5, 'Olya', 'Saint-Petersburg', 2, 2, 'Scottish Fold', 'Bella', 'female'),
       (6, 'Katya', 'Kazan', 4, 1, 'Toy Fox Terrier', 'Ponya', 'female'),
       (7, 'Anya', 'Kazan', 4, 1, 'Akita', 'Alexa', 'female'),
       (8, 'Vanya', 'Saint-Petersburg', 3, 2, 'Scottish Fold', 'Bars', 'male');
