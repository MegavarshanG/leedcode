# Write your MySQL query statement below
select uni.unique_id, e.name from  Employees e left join Employeeuni uni on e.id=uni.id;