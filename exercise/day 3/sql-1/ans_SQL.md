1. 
select d.name as department_name, SUM(salary) as total_salary
from departments d
join employees e on d.id = e.department_id
group by d.name
order by total_salary desc;

2. 
select name from employees
left join employee_projects on employees.id = employee_projects.employee_id
where employee_projects.project_id is null;

3. 
select 
	e.name as employee_name,
	d.name as department_name,
	e.salary
from (
	select
		e.*,
		row_number() over (partition by e.department_id order by e.salary desc) as rn
	from employees e
) e
join departments d on e.department_id = d.id
where e.rn <= 3
order by d.name, e.salary desc;

4. 

5. 
select e.name as employee_name, count(distinct ep.project_id) as total_projects
from employees e
join employee_projects ep on ep.employee_id = e.id
group by e.id, e.name
having count(distinct ep.project_id) >= 2;