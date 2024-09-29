""" Write a Python script to display the 
a) Current date and time
b) Current year in full
c) Month of year full name
d) Weekday of the week
e) Day of the month
f) Day of week in full name
6: Python program to convert a string to datetime:
          'Jul 1 2016  2:43AM' into 2016-07-01 02:43:00"""

from datetime import datetime , timedelta
Curr_time = datetime.now()
print("current time is :" , Curr_time)
print("current year is full is :" , Curr_time.strftime("%Y"))
print("current month name is : ", Curr_time.strftime("%B"))
print("Weekday of current date is :" , Curr_time.weekday())
print("Day of the month is : ", Curr_time.strftime("%d"))
print("Day of week in full name is : " ,Curr_time.strftime("%A") )

custom_date = "Jul 1 2016  2:43AM"
print("given string is : ", custom_date)
date_object = datetime.strptime(custom_date,"%b %d %Y %I:%M%p")
print("The conversion of string to datetime is :" , date_object.strftime("%Y-%m-%d %H:%M:%S"))

