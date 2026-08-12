-- Last updated: 8/12/2026, 12:12:40 PM
# Write your MySQL query statement below
SELECT
    s1.score,
    (
        SELECT COUNT(DISTINCT s2.score)
        FROM Scores s2
        WHERE s2.score >= s1.score
    ) AS `rank`
    -- Note: SQL Server Use `[rank]` instead of `rank`.
FROM Scores s1
ORDER BY s1.score DESC;