CREATE TABLE PHONE (
    id INT AUTO_INCREMENT PRIMARY KEY,
    brand VARCHAR (50) NOT NULL,
    model VARCHAR(20) NOT NULL,
    color VARCHAR(50) NOT NULL
);

INSERT INTO PHONE(brand, model, color) VALUES
('Apple','7','SpaceGrey'),
('Apple','8','White'),
('Apple','X','Pink'),
('Apple','11','SepangBlue');
