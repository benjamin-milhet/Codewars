SELECT COUNT(age) AS total_people, age
FROM people
GROUP BY age
HAVING COUNT(age) >=10;