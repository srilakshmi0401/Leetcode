-- Last updated: 8/12/2026, 11:58:52 AM
# Write your MySQL query statement below
SELECT actor_id,
       director_id
FROM ActorDirector
GROUP BY actor_id, director_id
HAVING COUNT(*) >= 3;