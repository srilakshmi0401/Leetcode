-- Last updated: 8/12/2026, 12:05:06 PM
# Write your MySQL query statement below
SELECT name
FROM Customer
WHERE referee_id <> 2
   OR referee_id IS NULL;
   