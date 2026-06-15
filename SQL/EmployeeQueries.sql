/*
Topic: SQL Basics
Concepts:
1. SELECT
2. WHERE
3. ORDER BY
4. COUNT
5. GROUP BY
6. AVG
7. BETWEEN
8. Subqueries
9. ROW_NUMBER()
10. DENSE_RANK()
*/

-- Q1
SELECT * FROM Employee;

-- Q2
SELECT name FROM Employee WHERE salary > 50000;

-- Q3
SELECT * FROM Employee WHERE department = 'IT';

-- Q4
SELECT * FROM Employee ORDER BY salary DESC;

-- Q5
SELECT MAX(salary) FROM Employee;

-- Q6
SELECT COUNT(*) FROM Employee;

-- Q7
SELECT department, COUNT(*)
FROM Employee
GROUP BY department;

-- Q8
SELECT AVG(salary)
FROM Employee;

-- Q9
SELECT *
FROM Employee
WHERE salary BETWEEN 40000 AND 55000;

-- Q10
SELECT MAX(salary)
FROM Employee
WHERE salary < (
    SELECT MAX(salary)
    FROM Employee
);
-- Q10 Method 2 (ROW_NUMBER)
SELECT salary
FROM (
    SELECT salary,
           ROW_NUMBER() OVER (ORDER BY salary DESC) AS rn
    FROM Employee
) t
WHERE rn = 2;
-- Q10 Method 3 (DENSE_RANK)
SELECT salary
FROM (
    SELECT salary,
           DENSE_RANK() OVER (ORDER BY salary DESC) AS rnk
    FROM Employee
) t
WHERE rnk = 2;