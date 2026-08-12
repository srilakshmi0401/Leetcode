-- Last updated: 8/12/2026, 12:12:59 PM
# Write your MySQL query statement below
# Write your MySQL query statement below
select Person.firstName, Person.lastName, Address.city ,Address.state 
FROM Person
LEFT JOIN Address
ON Person.personId = Address.personId;