SELECT people.id, people.name, COUNT(sales.sale) AS sale_count, 
RANK () OVER (ORDER BY COUNT(sales.sale) DESC) sale_rank
FROM people 
INNER JOIN sales ON 
people.id = sales.people_id
GROUP BY people.id;