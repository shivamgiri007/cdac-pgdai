"7: Python program to convert Year/Month/Day to Day of Year."
from datetime import datetime

year = 2023
month = 9
day = 23
custom_date = date_object = datetime(year, month, day)

day_of_year = date_object.timetuple().tm_yday

print("the number of day of date ", custom_date.strftime('%Y-%m-%d') , "is " , day_of_year)

