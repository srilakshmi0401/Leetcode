-- Last updated: 8/12/2026, 11:56:02 AM
# Write your MySQL query statement below
SELECT  
    u.name,
    SUM(t.amount) AS balance
FROM Transactions t
LEFT JOIN Users u
    ON t.account = u.account
GROUP BY u.account, u.name
HAVING SUM(t.amount) > 10000;