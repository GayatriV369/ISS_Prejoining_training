# 1. BREAK - Exit the loop completely
print("\n1. BREAK - Exit Loop")
print("Finding first even number:")
numbers = [1, 3, 5, 8, 9, 10]
for num in numbers:
    print(f"Checking: {num}")
    if num % 2 == 0:
        print(f"Found first even number: {num}")
        break
    print(f"{num} is odd, continuing...")

# 2. CONTINUE - Skip current iteration
print("\n2. CONTINUE - Skip Iteration")
print("Printing only positive numbers:")
numbers = [-2, -1, 0, 1, 2, 3]
for num in numbers:
    if num <= 0:
        continue  # Skip non-positive numbers
    print(f"Positive number: {num}")

# 3. BREAK in While Loop
print("\n3. BREAK in While Loop")
print("Password attempts:")
attempts = 0
correct_password = "python123"

while True:
    attempts += 1
    # Simulate user input
    user_password = "wrong" if attempts < 3 else "python123"
    print(f"Attempt {attempts}: Trying '{user_password}'")

    if user_password == correct_password:
        print("Login successful!")
        break

    if attempts >= 3:
        print("Too many failed attempts!")
        break

# 4. CONTINUE in While Loop
print("\n4. CONTINUE in While Loop")
print("Processing valid data only:")
data = [10, -5, 0, 15, -3, 20]
index = 0

while index < len(data):
    current = data[index]
    index += 1  # Important: increment before continue

    if current <= 0:
        print(f"Skipping invalid data: {current}")
        continue

    print(f"Processing valid data: {current}")

# 5. NESTED LOOPS with Break/Continue
print("\n5. NESTED LOOPS")
print("Finding target in 2D array:")
matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
target = 5
found = False

for i, row in enumerate(matrix):
    for j, value in enumerate(row):
        if value == target:
            print(f"Found {target} at position ({i}, {j})")
            found = True
            break  # Break inner loop
    if found:
        break  # Break outer loop