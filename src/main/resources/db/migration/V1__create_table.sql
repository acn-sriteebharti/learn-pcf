create table wt_members (
id INT auto_increment NOT NULL,
member_name varchar(1),
age int,
skill varchar(900),
image varchar(250),
PRIMARY KEY (id)
);

create table wt_teams (
id INT auto_increment NOT NULL,
team_name varchar(250),
rank_no varchar(1),
position_no int,
team_desc varchar(900),
image varchar(250),
member int,
PRIMARY KEY (id),
CONSTRAINT team2 FOREIGN KEY (member) REFERENCES wt_teams(id));