-- Last updated: 8/12/2026, 12:04:55 PM
# Write your MySQL query statement below
SELECT customer_number
FROM Orders 
GROUP BY customer_number
ORDER BY COUNT(customer_number) DESC
LIMIT 1;