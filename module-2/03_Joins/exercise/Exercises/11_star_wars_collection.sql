-- 11. The titles of the movies in the "Star Wars Collection" ordered by release date, most recent to earliest (9 rows)
SELECT title
From movie
JOIN collection ON movie.collection_id = collection.collection_id
WHERE collection_name = 'Star Wars Collection'
ORDER BY release_date DESC;
