-- Last updated: 8/12/2026, 11:58:22 AM
# Write your MySQL query statement below
SELECT
    player_id,
    MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id;