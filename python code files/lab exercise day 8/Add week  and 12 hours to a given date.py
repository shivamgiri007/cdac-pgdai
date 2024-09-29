from datetime import datetime, timedelta

given_date = datetime(2023, 3, 22, 10, 0, 0)
new_date = given_date + timedelta(days=7, hours=12)


print("given time:", given_date.strftime("%Y-%m-%d %H:%M:%S"))
print("expected time in given format:", new_date.strftime("%Y-%m-%d %H:%M:%S"))
