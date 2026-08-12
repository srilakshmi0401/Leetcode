-- Last updated: 8/12/2026, 11:58:54 AM
# Write your MySQL query statement below
# Write your MySQL query statement below

SELECT  customer_id FROM Customer GROUP BY customer_id
HAVING COUNT(distinct product_key) = (SELECT COUNT(product_key) FROM Product)