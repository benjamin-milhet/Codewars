SELECT title FROM (
SELECT film.title
FROM film 
INNER JOIN film_actor
ON film.film_id = film_actor.film_id
WHERE (film_actor.actor_id = 105)) AS sydney
NATURAL JOIN 
(
SELECT film.title
FROM film 
INNER JOIN film_actor
ON film.film_id = film_actor.film_id
WHERE (film_actor.actor_id = 122)) AS salma
;