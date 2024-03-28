SELECT T1.id, T1.name, T1.age
FROM T1
LEFT JOIN T2 ON T1.id = T2.id
WHERE T2.id IS NULL
ORDER BY T1.id;

SELECT T1.id, T1.name, T1.age
FROM T1
LEFT JOIN T2 ON T1.id = T2.id
WHERE T2.id IS NULL;

SELECT id, name, age
FROM T1
WHERE id NOT IN (SELECT id FROM T2)
ORDER BY id;
