# Write your MySQL query statement below
select a1.machine_id, round(avg(a2.timestamp-a1.timestamp),3) as processing_time from 
activity a1 inner join activity a2 on a1.machine_id=a2.machine_id
where a1.process_id=a2.process_id and a1.timestamp<a2.timestamp
group by a1.machine_id;