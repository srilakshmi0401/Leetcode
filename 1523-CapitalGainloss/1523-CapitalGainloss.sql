-- Last updated: 8/12/2026, 11:56:41 AM
# Write your MySQL query statement below
SELECT stock_name, SUM(
    CASE
        WHEN operation = 'Buy' THEN -price
        ELSE price
    END
) AS capital_gain_loss
FROM Stocks
GROUP BY stock_name