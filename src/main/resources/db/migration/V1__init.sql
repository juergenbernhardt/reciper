CREATE TABLE CAT_UNIT(
UNT_ID INT AUTO_INCREMENT PRIMARY KEY,
UNT_NAME varchar(10),
UNT_DESCRIPTION varchar(255) NULL,
UNT_CODE varchar(2) UNIQUE
);

CREATE TABLE INGREDIENT(
ING_ID INT AUTO_INCREMENT PRIMARY KEY,
ING_NAME  varchar(255)
);

CREATE TABLE RECIPE(
REC_ID INT AUTO_INCREMENT PRIMARY KEY,
REC_NAME  varchar(255)
);

CREATE TABLE RECIPE_INGREDIENT(
REC_ID INT,
ING_ID INT,
RET_DESCRIPTION varchar(255),
RET_CAT_UNIT varchar(2),
PRIMARY KEY (REC_ID, ING_ID),
FOREIGN KEY (RET_CAT_UNIT) REFERENCES CAT_UNIT(UNT_CODE),
FOREIGN KEY (REC_ID) REFERENCES RECIPE(REC_ID),
FOREIGN KEY (ING_ID) REFERENCES INGREDIENT(ING_ID)
);