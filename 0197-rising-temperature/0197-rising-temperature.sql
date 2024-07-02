# Write your MySQL query statement below
-- select id from weather w1
-- where w1.temperature > (select w2.temperature from weather w2 where datediff(w1.recordDate,w2.recordDate)=1);

select w1.id from weather w1 inner join weather w2 
where datediff(w1.recordDate,w2.recordDate)=1 and w1.temperature>w2.temperature;