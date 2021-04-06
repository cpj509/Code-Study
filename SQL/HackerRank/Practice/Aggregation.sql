-- Revising Aggregations - The Count Function

select count(name)
from city
where population > 100000;

-- Japan Population

select sum(population)
from city
where countrycode = 'JPN';

-- Population Density Difference

select max(population) - min(population)
from city;