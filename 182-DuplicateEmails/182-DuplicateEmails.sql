-- Last updated: 8/12/2026, 12:12:07 PM
# Write your MySQL query statement below
SELECT email FROM Person
GROUP BY email
HAVING COUNT(email) > 1;