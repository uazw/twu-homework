SELECT name from member
join checkout_item join book
on member.id = checkout_item.member_id and checkout_item.book_id = book.id
where book.title = 'The Hobbit';

select count(id) from member where id not in (select distinct member_id from checkout_item);

select title from book
where id not in
(select book_id from checkout_item where movie_id is null)
union
select title from movie
where id not in
(select movie_id from checkout_item where book_id is null)

select name from member where id in
(select member_id
from checkout_item
group by member_id
having count(member_id) > 1);

insert into book(title) values ('The Pragmatic Programmer');
insert into member(name) values ('uazw')
insert into checkout_item(book_id, member_id) values (11, 43);