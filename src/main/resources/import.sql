insert into USER (ID, FIRST_NAME, LAST_NAME, LOGIN, PASSWORD) values (1,'Fleurisse','Atangana','bkzion@hotmail.fr','laforce')
insert into USER (ID, FIRST_NAME, LAST_NAME, LOGIN, PASSWORD) values (2,'Sylvie','Wagner','syzion@hotmail.fr','lesecret')
insert into USER (ID, FIRST_NAME, LAST_NAME, LOGIN, PASSWORD) values (3,'Roger','Smith','smithrog@hotmail.fr','unpassword')
insert into USER (ID, FIRST_NAME, LAST_NAME, LOGIN, PASSWORD) values (4,'Erik','Jackson','jacksEr@hotmail.fr','unknown')
insert into USER (ID, FIRST_NAME, LAST_NAME, LOGIN, PASSWORD) values (5,'Daniela','Sagna','sagnaD@hotmail.fr','flawless')

insert into ITEM (ID, INTEGRATION) values (1,'2022-03-30')
insert into ITEM (ID, INTEGRATION) values (2,'2021-06-08')
insert into ITEM (ID, INTEGRATION) values (3,'2022-08-08')
insert into ITEM (ID, INTEGRATION) values (4,'2020-11-08')
insert into ITEM (ID, INTEGRATION) values (5,'2019-02-18')
insert into ITEM (ID, INTEGRATION) values (6,'2018-08-08')
insert into ITEM (ID, INTEGRATION) values (7,'2017-03-04')
insert into ITEM (ID, INTEGRATION) values (8,'2019-08-19')
insert into ITEM (ID, INTEGRATION) values (9,'2022-06-30')
insert into ITEM (ID, INTEGRATION) values (10,'2020-05-08')
insert into ITEM (ID, INTEGRATION) values (11,'2022-01-08')
insert into ITEM (ID, INTEGRATION) values (12,'2020-08-08')
insert into ITEM (ID, INTEGRATION) values (13,'2022-08-30')
insert into ITEM (ID, INTEGRATION) values (14,'2019-08-08')
insert into ITEM (ID, INTEGRATION) values (15,'2018-08-25')

insert into CD (ID, ARTIST, DURATION, NB_TITLE, RELEASE_DATE,TITLE) values (1,'Kanye West', 125, 20,'2003-12-02','The college Dropout');
insert into CD (ID, ARTIST, DURATION, NB_TITLE, RELEASE_DATE,TITLE) values (2,'Jay Z', 120, 54,'2003-11-14','The Black Album');
insert into CD (ID, ARTIST, DURATION, NB_TITLE, RELEASE_DATE,TITLE) values (3,'Aaliyah', 73, 18,'1996-08-13','One in a million');
insert into CD (ID, ARTIST, DURATION, NB_TITLE, RELEASE_DATE,TITLE) values (4,'D Angelo', 78, 13,'2000-01-25','Voodoo');
insert into CD (ID, ARTIST, DURATION, NB_TITLE, RELEASE_DATE,TITLE) values (5,'Nas', 60, 18,'2006-12-19','HipHop is Dead');

insert into DVD (ID, DIRECTOR, DURATION, RELEASE_DATE, TITLE, TYPE) values (6,'Scorcese Martin', 178,'1995-01-01','Casino', 'DVD');
insert into DVD (ID, DIRECTOR, DURATION, RELEASE_DATE, TITLE, TYPE) values (7,'Scorcese Martin', 146,'1990-01-01','Les Affranchis', 'BLURAY');
insert into DVD (ID, DIRECTOR, DURATION, RELEASE_DATE, TITLE, TYPE) values (8,'Tarantino Quentin', 164,'1994-01-01','Pulp Fiction', 'DVD');
insert into DVD (ID, DIRECTOR, DURATION, RELEASE_DATE, TITLE, TYPE) values (9,'Nolan Christopher', 147,'2010-01-04','Inception', 'DVD');
insert into DVD (ID, DIRECTOR, DURATION, RELEASE_DATE, TITLE, TYPE) values (10,'Brian De Palma', 170,'2005-04-04','Casino', 'BLURAY');

insert into BOOK (ID,TITLE, AUTHOR, NB_ISBN, RELEASE_DATE) values (11,'1984', 'Georges Orwell','207036822X','1949-06-08');
insert into BOOK (ID,TITLE, AUTHOR, NB_ISBN, RELEASE_DATE) values (12,'The Animal Farm', 'Georges Orwell','307036822X','1945-05-08');
insert into BOOK (ID,TITLE, AUTHOR, NB_ISBN, RELEASE_DATE) values (13,'Notre de Dame de Paris', 'Victor Hugo','407036822X','1831-03-19');
insert into BOOK (ID,TITLE, AUTHOR, NB_ISBN, RELEASE_DATE) values (14,'Pride and Prejudice', 'Jane Austen','507036822X','1813-09-21');
insert into BOOK (ID,TITLE, AUTHOR, NB_ISBN, RELEASE_DATE) values (15,'Le Horla', 'Guy de Maupassant','607036822X','1886-11-19');

insert into BORROW (ID, START_DATE, END_DATE, USERS_ID) values (1,'2022-03-08','2022-03-15',1)

insert into COPIE (ITEM_ID,ID, BORROW_ID ) values (1,1,1)
insert into COPIE (ITEM_ID,ID) values (2,2)
insert into COPIE (ITEM_ID,ID) values (3,3)
insert into COPIE (ITEM_ID,ID) values (1,4)
insert into COPIE (ITEM_ID,ID) values (4,5)
insert into COPIE (ITEM_ID,ID) values (1,6)
insert into COPIE (ITEM_ID,ID) values (2,7)
insert into COPIE (ITEM_ID,ID) values (3,8)
insert into COPIE (ITEM_ID,ID) values (3,9)
insert into COPIE (ITEM_ID,ID) values (4,10)
insert into COPIE (ITEM_ID,ID) values (5,11)
insert into COPIE (ITEM_ID,ID) values (6,12)
insert into COPIE (ITEM_ID,ID) values (7,13)
insert into COPIE (ITEM_ID,ID) values (8,14)
insert into COPIE (ITEM_ID,ID) values (9,15)
insert into COPIE (ITEM_ID,ID) values (10,16)
insert into COPIE (ITEM_ID,ID) values (11,17)
insert into COPIE (ITEM_ID,ID) values (12,18)
insert into COPIE (ITEM_ID,ID) values (13,19)
insert into COPIE (ITEM_ID,ID) values (14,20)
insert into COPIE (ITEM_ID,ID) values (15,21)