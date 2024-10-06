import mysql.connector
conn = mysql.connector.connect(
    user="root",
    host="localhost",
    database="Lab_11",
    password="Shivam@123"
)
cursor = conn.cursor()
def insert_data(table, data):
    placeholders = ', '.join(['%s' for _ in data[0]])
    query = f"INSERT INTO {table} VALUES ({placeholders})"
    
    for record in data:
        for record in data:
            try:
                cursor.execute(query, record)
            except mysql.connector.IntegrityError as e:
                print(f"Duplicate data: {record} already exists. Skip insertion. Error: {e}")
                conn.rollback()
            except mysql.connector.Error as e:
                print(f"Error inserting {record}: {e}")
                conn.rollback()


cursor.execute("""
CREATE TABLE IF NOT EXISTS CLIENT_MASTER(
    ClientNo VARCHAR(6) PRIMARY KEY CHECK (ClientNo LIKE 'C%'),
    Name VARCHAR(20) NOT NULL,
    City VARCHAR(15),
    PinCode INT(8),
    State VARCHAR(15),
    BalDue DECIMAL(10,2)
);""")

cursor.execute("""
CREATE TABLE IF NOT EXISTS PRODUCT_MASTER(
    ProductNo VARCHAR(6) PRIMARY KEY CHECK (ProductNo LIKE 'P%'),
    Description VARCHAR(15) NOT NULL,
    ProfitPercent DECIMAL(4,2),
    UnitMeasure VARCHAR(10) NOT NULL,
    QtyOnHand INT(8) NOT NULL,
    ReorderLvl INT(8) NOT NULL,
    SellPrice DECIMAL(8,2) NOT NULL CHECK (SellPrice <> 0),
    CostPrice DECIMAL(8,2) NOT NULL CHECK (CostPrice <> 0)
);""")

cursor.execute("""
CREATE TABLE IF NOT EXISTS SALESMAN_MASTER(
    SalesmanNo VARCHAR(6) PRIMARY KEY CHECK (SalesmanNo LIKE 'S%'),
    SalesmanName VARCHAR(20) NOT NULL,
    Address1 VARCHAR(30) NOT NULL,
    Address2 VARCHAR(30),
    City VARCHAR(20),
    Pincode INT(8),
    State VARCHAR(20),
    SalAmt DECIMAL(8, 2) NOT NULL CHECK (SalAmt <> 0),
    TgtToGet DECIMAL(6, 2) NOT NULL CHECK (TgtToGet <> 0),
    YtdSales DECIMAL(6, 2) NOT NULL,
    Remarks VARCHAR(60)
);""")

cursor.execute("""
CREATE TABLE IF NOT EXISTS SALES_ORDER(
    OrderNo VARCHAR(6) PRIMARY KEY CHECK (OrderNo LIKE 'O%'),
    ClientNo VARCHAR(6),
    OrderDate DATE NOT NULL,
    DelyAddr VARCHAR(25),
    SalesmanNo VARCHAR(6),
    DelyType CHAR(1),
    Billyn CHAR(1),
    DelyDate DATE,
    OrderStatus VARCHAR(10),
    FOREIGN KEY (ClientNo) REFERENCES CLIENT_MASTER(ClientNo),
    FOREIGN KEY (SalesmanNo) REFERENCES SALESMAN_MASTER(SalesmanNo)
);""")

cursor.execute("""
CREATE TABLE IF NOT EXISTS SALES_ORDER_DETAILS(
    OrderNo VARCHAR(6),
    ProductNo VARCHAR(6),
    QtyOrdered INT(8),
    QtyDisp INT(8),
    ProductRate DECIMAL(10, 2),
    FOREIGN KEY (OrderNo) REFERENCES SALES_ORDER(OrderNo),
    FOREIGN KEY (ProductNo) REFERENCES PRODUCT_MASTER(ProductNo),
    PRIMARY KEY (OrderNo, ProductNo)
);""")


client_data = [
    ("C00001", "Ivan Bayross", "Mumbai", "400054", "Maharashtra", 15000.00),
    ("C00003", "Chhaya Bankar", "Mumbai", "400057", "Maharashtra", 5000.00),
    ("C00004", "Ashwini Joshi", "Bangalore", "560001", "Karnataka", 0.00),
    ("C00005", "Hansel Colaco", "Mumbai", "400060", "Maharashtra", 2000.00),
    ("C00006", "Deepak Sharma", "Mangalore", "560050", "Karnataka", 0.00)
]

product_data = [
    ("P00001", "T-Shirts", 5.00, "Piece", 200, 50, 350.00, 250.00),
    ("P03453", "Shirts", 6.00, "Piece", 150, 50, 500.00, 350.00),
    ("P06734", "Cotton Jeans", 5.00, "Piece", 100, 20, 600.00, 450.00),
    ("P07865", "Jeans", 5.00, "Piece", 100, 20, 750.00, 500.00),
    ("P07868", "Trousers", 2.00, "Piece", 150, 50, 850.00, 550.00),
    ("P07885", "Pull Overs", 2.50, "Piece", 80, 30, 700.00, 450.00),
    ("P07965", "Denim Shirts", 4.00, "Piece", 100, 40, 350.00, 250.00),
    ("P07975", "Lycra Tops", 5.00, "Piece", 70, 30, 300.00, 175.00),
    ("P08865", "Skirts", 5.00, "Piece", 75, 30, 450.00, 300.00)
]

salesman_data = [
    ("S00001", "Aman", "A/14", "Worli", "Mumbai", "400002", "Maharashtra", 3000.00, 100.00, 50.00, "Good"),
    ("S00002", "Omkar", "65", "Nariman", "Mumbai", "400001", "Maharashtra", 3000.00, 200.00, 100.00, "Good"),
    ("S00003", "Raj", "P-7", "Bandra", "Mumbai", "400032", "Maharashtra", 3000.00, 200.00, 100.00, "Good"),
    ("S00004", "Ashish", "A/5", "Juhu", "Bombay", "400044", "Maharashtra", 3500.00, 200.00, 150.00, "Good")
]

sales_order_data = [
    ("O19003", "C00001", "2002-04-03", "Delhi", "S00001", "F", "Y", "2002-04-07", "Fulfilled"),
    ("O46866", "C00004", "2002-05-20", "Delhi", "S00002", "P", "N", "2002-05-22", "Cancelled"),
    ("O19008", "C00005", "2002-05-24", "Delhi", "S00004", "F", "N", "1996-07-26", "In Process"),
    ("O19001", "C00001", "2002-06-12", "Delhi", "S00001", "F", "N", "2002-07-20", "In Process"),
    ("O19002", "C00002", "2002-06-25", "Delhi", "C00002", "P", "N", "2002-07-27", "Cancelled")
]

sales_order_details_data = [
    ("O19001", "P00001", 4, 4, 525.00),
    ("O19001", "P07965", 2, 1, 8400.00),
    ("O19001", "P07885", 2, 1, 5250.00),
    ("O19002", "P00001", 10, 0, 525.00),
    ("O46865", "P07868", 3, 3, 3150.00),
    ("O46865", "P07885", 3, 1, 5250.00),
    ("O46865", "P00001", 10, 10, 525.00),
    ("O46865", "P03453", 4, 4, 1050.00),
    ("O19003", "P03453", 2, 2, 1050.00),
    ("O19003", "P06734", 1, 1, 12000.00),
    ("O46866", "P07965", 1, 0, 8400.00),
    ("O46866", "P07975", 1, 0, 1050.00),
    ("O19008", "P00001", 10, 5, 525.00),
    ("O19008", "P07975", 5, 3, 1050.00)
]


insert_data('CLIENT_MASTER', client_data)
conn.commit()

insert_data('PRODUCT_MASTER', product_data)
conn.commit()

insert_data('SALESMAN_MASTER', salesman_data)
conn.commit()

insert_data('SALES_ORDER', sales_order_data)
conn.commit()

insert_data('SALES_ORDER_DETAILS', sales_order_details_data)
conn.commit()

cursor.close()
conn.close()

print("Data added Successfully !")
