CREATE TABLE board (
                       seq INT AUTO_INCREMENT PRIMARY KEY,
                       title VARCHAR(255) NOT NULL,
                       contents VARCHAR(1000) NOT NULL,
                       reg_user VARCHAR(100) NOT NULL,
                       reg_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
);
