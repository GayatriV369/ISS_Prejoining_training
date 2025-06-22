# 1. Basic While Loop
print("\n1. Basic While Loop")
count = 0
while count < 3:
    print(f"Count: {count}")
    count += 1

# 2. User Input Loop
print("\n2. User Input Simulation")
attempts = 0
max_attempts = 3
password = "secret"

while attempts < max_attempts:
    user_input = "wrong" if attempts < 2 else "secret"  # Simulate input
    print(f"Attempt {attempts + 1}: Trying '{user_input}'")

    if user_input == password:
        print("Access granted!")
        break
    else:
        attempts += 1
        print("Wrong password!")

if attempts == max_attempts:
    print("Access denied - too many attempts")

# 3. While with Else
print("\n3. While with Else")
num = 5
while num > 0:
    print(num)
    num -= 1
else:
    print("Countdown finished!")

# 4. Infinite Loop Prevention
print("\n4. Safe Loop with Counter")
counter = 0
while True:
    counter += 1
    print(f"Loop iteration: {counter}")

    if counter >= 3:  # Safety exit
        print("Breaking out of infinite loop")
        break

# 5. Processing Data Until Condition
print("\n5. Processing Data")
numbers = [1, 2, 3, 0, 4, 5]  # Stop at 0
index = 0

while index < len(numbers) and numbers[index] != 0:
    print(f"Processing: {numbers[index]}")
    index += 1

print(f"Stopped at index {index}")

