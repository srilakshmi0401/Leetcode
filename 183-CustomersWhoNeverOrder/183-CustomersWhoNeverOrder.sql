-- Last updated: 8/12/2026, 12:12:01 PM
# Write your MySQL query statement below
SELECT C.name AS Customers
FROM Customers C
LEFT JOIN Orders O
    ON C.id = O.customerId
WHERE O.id IS NULL;