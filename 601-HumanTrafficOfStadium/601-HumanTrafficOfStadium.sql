-- Last updated: 8/12/2026, 12:04:33 PM
# Write your MySQL query statement below
WITH reduced_rows AS (
    SELECT *,
           id - ROW_NUMBER() OVER (ORDER BY id) AS grp
    FROM Stadium
    WHERE people >= 100
)

SELECT id, visit_date, people
FROM reduced_rows
WHERE grp IN (
    SELECT grp
    FROM reduced_rows
    GROUP BY grp
    HAVING COUNT(*) >= 3
)
ORDER BY visit_date;