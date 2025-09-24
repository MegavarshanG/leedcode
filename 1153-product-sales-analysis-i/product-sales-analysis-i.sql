# Write your MySQL query statement below
select P.product_name,s.year , s.price from Sales S Left Join Product P ON 
 p.product_id = s.product_id;