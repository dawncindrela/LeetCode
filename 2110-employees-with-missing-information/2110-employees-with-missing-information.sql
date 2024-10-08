# Write your MySQL query statement below
Select e.employee_id 
from Employees e 
left join Salaries s on e.employee_id=s.employee_id
where salary is null
union
Select s.employee_id
from Salaries s
left join Employees e on e.employee_id=s.employee_id
where name is null 
order by employee_id;