-- Type of Triangle

select case
    when A+B>C and A+C>B and B+C>A then
        case
        when A=B and B=C then 'Equilateral'
        when A=B or B=C or A=C then 'Isosceles'
        else 'Scalene'
        end
    else 'Not A Triangle'
    end
from triangles;

-- The PADS

select name || '(' || substr(occupation, 1, 1) || ')'
from occupations
order by name;
select 'There are a total of ' || count(occupation) || ' ' || lower(occupation) || 's.' as total
from occupations
group by occupation
order by total;