import mysql.connector

# Connect to the database
conn = mysql.connector.connect(
    user="root",
    host="localhost",
    database="Lab_11",
    password="Shivam@123"
)
cursor = conn.cursor()

# Execute the required queries and print the results

# a. List the names of all clients having ‘a’ as the second letter in their names.
cursor.execute("SELECT Name FROM CLIENT_MASTER WHERE Name LIKE '_a%';")
clients_with_a = cursor.fetchall()
print("Client names (with 'a' as the second letter):", [row[0] for row in clients_with_a])
print("\n" + "-"*50 + "\n")

# b. List the clients who stay in a city whose first letter is ‘M’.
cursor.execute("SELECT Name FROM CLIENT_MASTER WHERE City LIKE 'M%';")
clients_in_m_city = cursor.fetchall()
print("Clients staying in cities starting with 'M':", [row[0] for row in clients_in_m_city])
print("\n" + "-"*50 + "\n")

# c. List all clients who stay in ‘Bangalore’ or ‘Mangalore’.
cursor.execute("SELECT Name FROM CLIENT_MASTER WHERE City IN ('Bangalore', 'Mangalore');")
clients_in_bangalore_mangalore = cursor.fetchall()
print("Clients staying in Bangalore or Mangalore:", [row[0] for row in clients_in_bangalore_mangalore])
print("\n" + "-"*50 + "\n")

# d. List all clients whose BalDue is greater than value 10000.
cursor.execute("SELECT Name FROM CLIENT_MASTER WHERE BalDue > 10000;")
clients_with_high_bal = cursor.fetchall()
print("Clients with BalDue greater than 10000:", [row[0] for row in clients_with_high_bal])
print("\n" + "-"*50 + "\n")

# e. List all information from the Sales_order table for orders placed in the month of June.
cursor.execute("SELECT * FROM SALES_ORDER WHERE MONTH(OrderDate) = 6;")
sales_orders_in_june = cursor.fetchall()
print("Sales order details for orders placed in June:")
for row in sales_orders_in_june:
    print(row)
print("\n" + "-"*50 + "\n")

# f. List the Order No & day on which clients placed their order.
cursor.execute("SELECT OrderNo, OrderDate FROM SALES_ORDER;")
order_no_and_date = cursor.fetchall()
print("Order number and order date:")
for row in order_no_and_date:
    print(row)
print("\n" + "-"*50 + "\n")

# g. List the names, city, and state of clients who are not in the state of ‘Maharashtra’.
cursor.execute("SELECT Name, City, State FROM CLIENT_MASTER WHERE State <> 'Maharashtra';")
clients_not_in_maharashtra = cursor.fetchall()
print("Names, city, and state of clients not in Maharashtra:")
for row in clients_not_in_maharashtra:
    print(row)
print("\n" + "-"*50 + "\n")

print("Exercises on Using Having, Group By, and Joins")
print("\n" + "-"*50 + "\n")
# a. Print the description and total quantity sold for each product.
cursor.execute("""
    SELECT P.Description, SUM(SD.QtyOrdered) AS TotalQuantitySold
    FROM PRODUCT_MASTER P
    JOIN SALES_ORDER_DETAILS SD ON P.ProductNo = SD.ProductNo
    GROUP BY P.Description;
""")
total_quantity_sold = cursor.fetchall()
print("Description and total quantity sold for each product:")
for row in total_quantity_sold:
    print(row)
print("\n" + "-"*50 + "\n")

# b. Calculate the average quantity sold for each client that has a maximum order value of 15000.00.
cursor.execute("""
    SELECT C.Name, AVG(SD.QtyOrdered) AS AverageQuantitySold
    FROM CLIENT_MASTER C
    JOIN SALES_ORDER S ON C.ClientNo = S.ClientNo
    JOIN SALES_ORDER_DETAILS SD ON S.OrderNo = SD.OrderNo
    WHERE S.OrderNo IN (
        SELECT OrderNo
        FROM SALES_ORDER
        WHERE BalDue <= 15000.00
    )
    GROUP BY C.Name;
""")
average_quantity_sold = cursor.fetchall()
print("Average quantity sold for each client with a maximum order value of 15000:")
for row in average_quantity_sold:
    print(row)
print("\n" + "-"*50 + "\n")
# Close the connection
cursor.close()
conn.close()
