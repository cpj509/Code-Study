-- Revising the Select Query I

select *
from city
where population > 100000 and countrycode = "USA";

-- Revising the Select Query II

select name
from city
where population > 120000 and countrycode = "USA";

-- Select All

select *
from city;

-- Select By ID

select *
from city
where id = 1661;

-- Japanese Cities' Attributes

select *
from city
where countrycode = "JPN";

-- Japanese Cities' Names

select name
from city
where countrycode = "JPN";

-- Weather Observation Station 1

select city, state
from station;

-- Weather Observation Station 3

select distinct city
from station
where id%2 = 0;

-- Weather Observation Station 4

select count(city)-count(distinct city)
from station;

-- Weather Observation Station 5

select city, length(city)
from station
order by length(city) asc, city asc limit 1;

select city, length(city)
from station
order by length(city) desc, city asc limit 1;

-- Weather Observation Station 6

select distinct city
from station
where REGEXP_LIKE(city, '^A|^E|^I|^O|^U');

-- Weather Observation Station 7

select distinct city
from station
where REGEXP_LIKE(city, 'a$|e$|i$|o$|u$');

Weather Observation Station 8

select city
from station
where REGEXP_LIKE(city, '^[aeiou].*[aeiou]$', 'i');