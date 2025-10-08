SELECT max( salary ) AS SecondHighestSalary
FROM Employee
where salary < (SELECT max(salary) from Employee);