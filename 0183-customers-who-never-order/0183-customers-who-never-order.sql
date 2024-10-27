/* Write your PL/SQL query statement below */
select name AS Customers From Customers where id not in (select customerId from Orders)