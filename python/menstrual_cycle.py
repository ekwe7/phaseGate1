

from datetime import datetime, timedelta

#TRYING TO GET USER INFOR
my_last_period = input("Enter the date of your last period (yyyy-MM-d): ")
number_days_of_cycle = int(input("Enter number of days of your cycle: "))
number_days_of_cycles = int(input("How many future cycles do you want to see? "))

#MINIMUM CYCLE LENGTH BASED INFOR
minimum_cycle_length = max(number_days_of_cycle, 26)

start_date = datetime.strptime(my_last_period, "%Y-%m-%d")

print("===MY NEXT CYCLES ARE===")

for index in range(1, number_days_of_cycles + 1):
    next_date = start_date + timedelta(days=minimum_cycle_length * index)
    print(f"Cycle {index}: {next_date.strftime('%Y-%m-%d')}")
