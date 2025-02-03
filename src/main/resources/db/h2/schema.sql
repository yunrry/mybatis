create table board(
    seq int auto_increment primary key,
    title varchar not null,
    contents varchar not null,
    reg_user varchar not null,
    reg_date TIMESTAMP default CURRENT_TIMESTAMP not null
);