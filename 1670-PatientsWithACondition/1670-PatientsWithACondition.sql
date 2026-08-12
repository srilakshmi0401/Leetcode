-- Last updated: 8/12/2026, 11:56:09 AM
# Write your MySQL query statement below
/* Write your PL/SQL query statement below */
SELECT patient_id, patient_name, conditions
FROM Patients
WHERE conditions LIKE 'DIAB1%' OR conditions LIKE '% DIAB1%'