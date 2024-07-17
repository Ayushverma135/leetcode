# Write your MySQL query statement below
select a1.name, a2.bonus from Employee a1 left join Bonus a2
on a1.empId=a2.empId where bonus < 1000 or bonus is null;