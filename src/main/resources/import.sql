insert into USER (ID, FIRST_NAME, LAST_NAME, LOGIN, PASSWORD) values (1,'Fleurisse','Atg','bkzion@hotmail.fr','laforce')
insert into USER (ID, FIRST_NAME, LAST_NAME, LOGIN, PASSWORD) values (2,'Sylvie','Atg','syzion@hotmail.fr','laforce')

insert into ITEM (ID, INTEGRATION) values (1,'1949-08-08')
insert into ITEM (ID, INTEGRATION) values (2,'1949-08-08')
insert into ITEM (ID, INTEGRATION) values (3,'1949-08-08')

insert into CD (ID, ARTIST, DURATION, NB_TITLE, RELEASE_DATE,TITLE) values (1,'Kanye West', 125, 20,'2003-05-05','The college Dropout');

insert into DVD (ID, DIRECTOR, DURATION, RELEASE_DATE, TITLE, TYPE) values (2,'Scorcese', 145,'2005-04-04','Casino', 'DVD');


insert into BOOK (ID,TITLE, AUTHOR, NB_ISBN, RELEASE_DATE) values (3,'1984', 'Georges Orwell','207036822X','1949-06-08');

insert into BORROW (ID, START_DATE, END_DATE, USERS_ID) values (1,'1949-08-08','1949-06-08',1)

insert into COPIE (ITEM_ID,ID, BORROW_ID ) values (1,1,1)
insert into COPIE (ITEM_ID,ID) values (2,2)
insert into COPIE (ITEM_ID,ID) values (3,3)
insert into COPIE (ITEM_ID,ID) values (1,4)



