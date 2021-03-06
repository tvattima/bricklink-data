create table if not exists item
(
	item_id int auto_increment primary key,
	item_number varchar(15) not null,
	item_name varchar(100) null,
	number_of_pieces int null,
	issue_year int null,
	issue_location char null,
	theme_id int null,
	item_type_code char null,
	notes tinytext null,
	constraint item_id primary key (item_id)
);