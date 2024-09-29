"""Q2: Write a Python program to access the array element whose index is out of bound and handle
the corresponding exception
"""

def index_out_of_bond():
    try:
        arr = [1,2,34,5]
        index = 10
        print(arr[index])
    except Exception as e :
        print("The exception is :",e)

index_out_of_bond()
