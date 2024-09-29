def trycatch():
    try:
        result = 5/0
    except Exception as e :
        print("Exception is :",e)

trycatch()
