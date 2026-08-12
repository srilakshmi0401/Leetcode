-- Last updated: 8/12/2026, 12:03:53 PM
SELECT *
FROM Cinema
WHERE id % 2 = 1
  AND description <> 'boring'
ORDER BY rating DESC;