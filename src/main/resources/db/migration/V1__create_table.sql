create table wt_teams (
id INT auto_increment NOT NULL,
team_name varchar(250),
rank_no varchar(1),
position_no int,
team_desc varchar(900),
image varchar(250),
PRIMARY KEY (id));

create table wt_members (
id INT auto_increment NOT NULL,
member_name varchar(500),
skill varchar(900),
image varchar(250),
team_id int,
PRIMARY KEY (id),
CONSTRAINT member1 FOREIGN KEY (team_id) REFERENCES wt_teams(id));

