from datetime import datetime

date_1 = datetime(2020, 2, 25)
date_2 = datetime(2020, 9, 17)

days_difference = (date_2 - date_1).days

print(f"{days_difference} days")
