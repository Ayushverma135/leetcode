# Write your MySQL query statement below
select s1.student_id, s1.student_name, e1.subject_name, count(e2.subject_name) as attended_exams
from students s1 natural join Subjects e1 left join Examinations e2
on s1.student_id=e2.student_id and e1.subject_name=e2.subject_name
group by s1.student_id, s1.student_name, e1.subject_name
order by s1.student_id,s1.student_name,e1.subject_name;