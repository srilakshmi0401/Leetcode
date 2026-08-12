-- Last updated: 8/12/2026, 12:04:21 PM
# Write your MySQL query statement below
SELECT name
FROM SalesPerson
WHERE sales_id NOT IN (
    SELECT sales_id
    FROM Orders
    WHERE com_id = (
        SELECT com_id
        FROM Company
        WHERE name = 'RED'
    )
);