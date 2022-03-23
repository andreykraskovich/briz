INSERT INTO Students(students_id, surname, name, lastname, birthday, gender) values (0, 'petrov', 'petr', 'petrovich', 2007, 'm');
INSERT INTO Students(students_id, surname, name, lastname, birthday, gender) values (1, 'peov', 'petr', 'petrovich', 2007, 'm');
INSERT INTO Students(students_id, surname, name, lastname, birthday, gender) values (2, 'ptrov', 'petr', 'petrovich', 2007, 'm');
INSERT INTO Students(students_id, surname, name, lastname, birthday, gender) values (3, 'etrov', 'petr', 'petrovich', 2007, 'm');
INSERT INTO Students(students_id, surname, name, lastname, birthday, gender) values (5, 'petro', 'petr', 'petrovich', 2007, 'm');
INSERT INTO Students(students_id, surname, name, lastname, birthday, gender) values (6, 'perov', 'petr', 'petrovich', 2007, 'm');

INSERT INTO Teachers(teachers_id, surname, name, lastname, birthday, gender, object) values (0, 'ivanov', 'ivan', 'ivanovich', 1997, 'm', 'history');
INSERT INTO Teachers(teachers_id, surname, name, lastname, birthday, gender, object) values (1, 'ivanov', 'ivan', 'ivanovich', 1997, 'm', 'history');
INSERT INTO Teachers(teachers_id, surname, name, lastname, birthday, gender, object) values (2, 'ivanov', 'ivan', 'ivanovich', 1997, 'm', 'history');
INSERT INTO Teachers(teachers_id, surname, name, lastname, birthday, gender, object) values (3, 'ivanov', 'ivan', 'ivanovich', 1997, 'm', 'history');
INSERT INTO Teachers(teachers_id, surname, name, lastname, birthday, gender, object) values (4, 'ivanov', 'ivan', 'ivanovich', 1997, 'm', 'history');
INSERT INTO Teachers(teachers_id, surname, name, lastname, birthday, gender, object) values (5, 'ivanov', 'ivan', 'ivanovich', 1997, 'm', 'history');

INSERT INTO Forms(id, year, code, teachers_id, students_id) values (0, 2012, 'a', 0, ARRAY [0,1,2,3,4]);

