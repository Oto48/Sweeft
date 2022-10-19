CREATE TABLE Teacher (
    TeacherID int,
    FirstName varchar(255),
    LastName varchar(255),
    Gender varchar(255),
    Subject varchar(255)
);

CREATE TABLE Pupil (
    PupilID int,
    FirstName varchar(255),
    LastName varchar(255),
    Gender varchar(255),
    Class varchar(255)
);

CREATE TABLE Class (
	TeacherID int,
    PupilID int
);


INSERT INTO Teacher VALUES (1, 'Davit','Davitashvili', 'Male', 'Math');
INSERT INTO Teacher VALUES (2, 'John','Doe', 'Male', 'History');
INSERT INTO Teacher VALUES (3, 'Maria','Doe', 'Female', 'Art');

INSERT INTO Pupil VALUES (1, 'Oto','Tchokhonelidze', 'Male', '4');
INSERT INTO Pupil VALUES (2, 'Johnny','Doe', 'Male', '5');
INSERT INTO Pupil VALUES (3, 'Guga','Tchokhonelidze', 'Male', '6');
INSERT INTO Pupil VALUES (4, 'Giorgi','Giorgobiani', 'Male', '6');

INSERT INTO Class VALUES (1,1);
INSERT INTO Class VALUES (1,2);
INSERT INTO Class VALUES (1,4);
INSERT INTO Class VALUES (2,4);



SELECT * FROM Teacher WHERE TeacherID IN 
   (SELECT TeacherID FROM Class WHERE PupilID IN
    (SELECT PupilID FROM Pupil WHERE FirstName = "Giorgi")
   )
   
