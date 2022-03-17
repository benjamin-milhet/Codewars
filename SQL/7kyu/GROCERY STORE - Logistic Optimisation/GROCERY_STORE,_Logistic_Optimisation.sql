SELECT COUNT(stock) AS count_products_types, producer
FROM products 
GROUP BY producer
ORDER BY count_products_types DESC, producer ASC;