from datetime import datetime , timedelta

todays_date = datetime.now()
nextdate = todays_date
for i in range(1,11):
    print ("Date ", i , " is : ", nextdate.strftime("%Y-%m-%d %H:%M:%S"))
    nextdate = nextdate + timedelta(days = 14)
    
