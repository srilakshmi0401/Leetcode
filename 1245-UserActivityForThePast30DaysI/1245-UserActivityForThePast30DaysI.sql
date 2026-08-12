-- Last updated: 8/12/2026, 11:57:50 AM
# Write your MySQL query statement below
select activity_date as day,
       count(distinct user_id) as active_users
from Activity
where activity_date >= '2019-06-28'
  and activity_date <= '2019-07-27'
group by activity_date;