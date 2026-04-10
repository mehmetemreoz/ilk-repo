from datetime import datetime
import time

current_date_and_time = datetime.now()
time_now = datetime.now()
current_time = time_now.strftime("%H:%M:%S")
current_time_2 = time.ctime()
current_time_3 = time.strftime("%H:%M:%S")

print("The current date and time is", current_date_and_time)
print(f"\nThe current time is {current_time}\n")
print(current_time_2)
print("\nThe current time is {}".format(current_time_3))
