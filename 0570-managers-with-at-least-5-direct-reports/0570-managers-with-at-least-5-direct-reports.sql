select name 
from Employee e1 
where e1.id in(
select managerId
from Employee
group by managerId
having count(managerId)>=5)