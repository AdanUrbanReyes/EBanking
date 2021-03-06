CREATE SCHEMA ebanking;
USE ebanking;

DROP TABLE IF EXISTS address;
CREATE TABLE address(
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
	street VARCHAR(30) NOT NULL,
	number VARCHAR(20) NOT NULL,
	colony VARCHAR(70) NOT NULL,
	city VARCHAR(40) NOT NULL,
	codigo_postal CHAR(5) NOT NULL,
	PRIMARY KEY(id)
);

DROP TABLE IF EXISTS bank;
CREATE TABLE bank(
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
	name VARCHAR(50) NOT NULL,
	rfc VARCHAR(13) NOT NULL,
	phone VARCHAR(13) NOT NULL,
	address INT UNSIGNED NOT NULL,
	PRIMARY KEY(id),
	FOREIGN KEY (address) REFERENCES address(id) ON UPDATE CASCADE ON DELETE CASCADE 
);

DROP TABLE IF EXISTS customer;
CREATE TABLE customer(
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
	bank INT UNSIGNED NOT NULL,
	full_name VARCHAR(90) NOT NULL,
	address INT UNSIGNED NOT NULL,
	birthday DATE NOT NULL,
	rfc VARCHAR(13) NOT NULL,
	PRIMARY KEY(id),
	FOREIGN KEY (address) REFERENCES address(id) ON UPDATE CASCADE ON DELETE CASCADE
	FOREIGN KEY (bank) REFERENCES bank(id) ON UPDATE CASCADE ON DELETE CASCADE
);

DROP TABLE IF EXISTS saving_account;
CREATE TABLE saving_account(
	number INT UNSIGNED NOT NULL AUTO_INCREMENT,
	customer INT UNSIGNED NOT NULL,
	opening DATE NOT NULL,
	inactiving DATE NOT NULL,
	balance DECIMAL(8, 2) NOT NULL,
	annualTax DECIMAL(8, 2) NOT NULL,
	state ENUM('ACTIVE', 'INACTIVE') NOT NULL DEFAULT 'ACTIVE',
	PRIMARY KEY(id),
	FOREIGN KEY (customer) REFERENCES customer(id) ON UPDATE CASCADE ON DELETE CASCADE
);

DROP TABLE IF EXISTS check_account;
CREATE TABLE check_account(
	number INT UNSIGNED NOT NULL AUTO_INCREMENT,
	customer INT UNSIGNED NOT NULL,
	opening DATE NOT NULL,
	inactiving DATE NOT NULL,
	balance DECIMAL(8, 2) NOT NULL,
	monthTax DECIMAL(8, 2) NOT NULL,
	state ENUM('ACTIVE', 'INACTIVE') NOT NULL DEFAULT 'ACTIVE',
	PRIMARY KEY(id),
	FOREIGN KEY (customer) REFERENCES customer(id) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO address (street, number, colony, city, codigo_postal)
	VALUES ('Allende', '18', 'San Rafael', 'Mexico', '54960'),
		('Paranagua', '221', 'San Pedro', 'Mexico', '07637')
;
		
INSERT INTO bank (name, rfc, phone, address) 
	VALUE ('Ayan S.A. de C.V.', 'UARA931229HMC', '5571648976')
;

INSERT INTO customer(bank, full_name, address, birthday, rfc)
	VALUE (1, 'Ayan Urban Reyes', 2, '1993-12-29', 'UARA931229AZ7')
;