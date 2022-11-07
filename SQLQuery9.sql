SELECT COUNT(IDTransaction) as 'Tranzactii'
FROM Tranzactii
WHERE IDClient = 1;

SELECT COUNT(IDTransaction) as 'Tranzactii'
FROM Tranzactii
WHERE IDClient = 1 AND IDProdus = 123;

SELECT COUNT(IDTransaction) as 'Tranzactii'
FROM Tranzactii
WHERE IDClient = 1 AND IDProdus =124;

SELECT COUNT(IDTransaction) as 'Produse cumparate'
FROM Tranzactii
WHERE IDProdus = 124;

SELECT COUNT(IDTransaction) as 'Produse cumparate'
FROM Tranzactii
WHERE IDProdus = 123;
