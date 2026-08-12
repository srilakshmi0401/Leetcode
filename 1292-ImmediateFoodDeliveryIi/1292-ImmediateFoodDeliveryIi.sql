-- Last updated: 8/12/2026, 11:57:42 AM
# Write your MySQL query statement below
# Write your MySQL query statement below
with t1 as (select * from Delivery 
group by customer_id
having min(order_date)=min(customer_pref_delivery_date))
select round(((select count(*) from t1)/(select count(distinct customer_id) from Delivery))*100,2)
as immediate_percentage
;