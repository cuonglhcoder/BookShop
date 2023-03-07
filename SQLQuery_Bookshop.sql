use Book_Management
select * from BookData

drop table BookData

create table BookData(
bookISBN int primary key,
bookTitle nvarchar(255),
author nvarchar(255),
publisher nvarchar(255),
yearOfManufacture int,
listedPrice decimal(18,2),
quantity int

)