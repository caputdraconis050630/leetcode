SELECT MAX(salary) AS SecondHighestSalary
FROM Employee
WHERE salary not in (
  SELECT MAX(salary) from employee
)