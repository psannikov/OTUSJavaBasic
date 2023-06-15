create table questions (id SERIAL primary key, question text not null);
create table answers (id serial primary key, question_id integer  not null, answer text not null, isCorrectAnswer boolean not null);
ALTER TABLE answers ADD FOREIGN KEY(question_id) REFERENCES questions(id);
insert into questions (question)
(select 'Куда идем мы с Пятачком?' q
union all
select 'Кто убил Марка?'
union all
select 'Какое растение существует на самом деле?');
insert into answers (question_id, answer, isCorrectAnswer)
(select 1, 'На север', false
union all
select 1, 'На Юг', false
union all
select 1, 'Большой секрет', false
union all
select 1, 'Большой-большой секрет', true
union all
select 2, 'Мэр', false
union all
select 2, 'Не важно', true
union all
select 2, 'Прихвостни мэра', false
union all
select 3, 'Лох чилийский', false
union all
select 3, 'Лох индийский', true
union all
select 3, 'Лох греческий', false
union all
select 3, 'Лох русскийй', false);
select q.question , a.answer ,a.iscorrectanswer from questions q
join answers a on q.id=a.question_id;
