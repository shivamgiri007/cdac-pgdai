import mysql.connector

conn = mysql.connector.connect(user="root",
                               host="localhost",
                               database="Lab_11",
                               password="Shivam@123")
cursor = conn.cursor()


"""1. Create the following tables:
Table name: CLIENT_MASTER
Column Name Data Type Size Attributes
CLIENTNO Varchar 6 Primary Key / First letter must start with ‘C’
NAME Varchar 20 Not Null
CITY Varchar 15
PINCODE Number 8
STATE Varchar 15
BALDUE Number 10,2
-------------------------------------------------------------------"""
try:
    query = """CREATE TABLE IF NOT EXISTS CLIENT_MASTER(ClientNo VARCHAR(6) PRIMARY KEY
                CHECK (ClientNo LIKE "C%") ,
                Name VARCHAR(20) NOT NULL,
                City VARCHAR(15),
                PinCode INT(8),
                State VARCHAR(15),
                BalDue DECIMAL(10,2)
            );"""
    cursor.execute(query)

    conn.commit()
except Exception as e :
    print(e)


"""
Table_Name: PRODUCT_MASTER
Column Name Data Type Size Attributes
PRODUCTNO Varchar 6 Primary Key / First letter must start with ‘P’
DESCRIPTION Varchar 15 Not Null
PROFITPERCENT Number 4,2 Not Null
UNITMEASURE Varchar 10 Not Null
QTYONHAND Number 8 Not Null
REORDERLVL Number 8 Not Null
SELLPRICE Number 8,2 Not Null, cannot be 0
COSTPRICE Number 8,2 Not Null, cannot be 0
-------------------------------------------------------------------
"""
try:
    query = """CREATE TABLE IF NOT EXISTS PRODUCT_MASTER(ProductNo VARCHAR(6) PRIMARY KEY
                CHECK (ProductNo LIKE "P%") ,
                Description VARCHAR(15) NOT NULL,
                ProfitPercent DECIMAL(4,2),
                UnitMeasure VARCHAR(10) NOT NULL,
                QtyOnHand INT(8) NOT NULL,
                ReorderLvl INT(8) NOT NULL,
                SellPrice DECIMAL(8,2) NOT NULL CHECK (SellPrice <> 0),
                CostPrice DECIMAL(8,2) NOT NULL CHECK (CostPrice <> 0));"""
    cursor.execute(query)
    conn.commit()
except Exception as e :
    print(e)
    
"""
Table_Name: SALESMAN_MASTER

Column Name Data Type Size Attributes
SALESMANNO Varchar 6 Primary Key / First letter must start with ‘S’
SALESMANNAME Varchar 20 Not Null
ADDRESS1 Varchar 30 Not Null
ADDRESS2 Varchar 30
CITY Varchar 20
PINCODE Number 8
STATE Varchar 20
SALAMT Number 8,2 Not Null, cannot be 0
TGTTOGET Number 6,2 Not Null, cannot be 0
YTDSALES Number 6,2 Not Null
REMARKS Varchar 60
----------------------------------------------------------------"""
try:
    query = """CREATE TABLE IF NOT EXISTS SALESMAN_MASTER (
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
                Remarks VARCHAR(60));"""
                
    cursor.execute(query)
    conn.commit()
except Exception as e :
    print(e)

"""
Table_Name: SALES_ORDER

Column Name Data Type Size Attributes
ORDERNO Varchar 6 Primary Key / First letter must start with ‘O’
CLIENTNO Varchar 6 Foreign Key references ClientNo of
Client_Master tabl
ORDERDATE Date Not Null
DELYADDR Varchar 25
SALESMANNO Varchar 6 Foreign Key references SalesmanNo of
Salesman_Master table
DELYTYPE Char 1
BILLYN Char 1
DELYDATE Date
ORDERSTATUS Varchar 10
---------------------------------------------------------------------
"""
try:
    query = """CREATE TABLE IF NOT EXISTS SALES_ORDER (
                OrderNo VARCHAR(6) PRIMARY KEY CHECK (OrderNo LIKE 'O%'),
                ClientNo VARCHAR(6),
                OrderDate DATE NOT NULL,
                DelyAddr VARCHAR(25),
                SalesmanNo VARCHAR(6),
                DelyType CHAR(1),
                Billyn CHAR(1),
                DelyDate DATE,
                OrderStatus VARCHAR(10),
                FOREIGN KEY (ClientNo) REFERENCES Client_Master(ClientNo),
                FOREIGN KEY (SalesmanNo) REFERENCES SALESMAN_MASTER(SalesmanNo));"""
    
    cursor.execute(query)
    conn.commit()
except Exception as e :
    print(e)

"""
Table_Name: SALES_ORDER_DETAILS

Column Name Data Type Size Attributes
ORDERNO Varchar 6 Foreign Key references OrderNo of
Sales_Order table
PRODUCTNO Varchar 6 Foreign Key references ProductNo of
Product_Master table
QTYORDERED Number 8
QTYDISP Number 8
PRODUCTRATE Number 10,2
"""
try:
    query = """
            CREATE TABLE IF NOT EXISTS SALES_ORDER_DETAILS (
            OrderNo VARCHAR(6),
            ProductNo VARCHAR(6),
            QtyOrdered INT(8),
            QtyDisp INT(8),
            ProductRate DECIMAL(10, 2),
            FOREIGN KEY (OrderNo) REFERENCES SALES_ORDER(OrderNo),
            FOREIGN KEY (ProductNo) REFERENCES PRODUCT_MASTER(ProductNo),
            PRIMARY KEY (OrderNo, ProductNo));"""
    cursor.execute(query)
    conn.commit();
    

    query = """SHOW TABLES;"""
    cursor.execute(query)
    databases = cursor.fetchall() 
    for database in databases:
        print(database)
    

except Exception as e :
    print(e)

cursor.close();
conn.close();
