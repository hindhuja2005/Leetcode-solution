# Write your MySQL query statement below
select name, bonus from Employee LEFT OUTER JOIN Bonus on Employee.empID=Bonus.empID 
where bonus < 1000 or Bonus is Null