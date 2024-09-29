from datetime import datetime, timedelta

given_date = datetime(2024, 9, 23)
new_date = given_date - timedelta(days=7)

print("current date is :", given_date.strftime("%Y-%m-%d"))
print("date before week is :", new_date.strftime("%Y-%m-%d"))
