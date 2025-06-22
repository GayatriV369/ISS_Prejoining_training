# 1. Basic Iteration
print("\n1. Basic Iteration")
fruits = ["apple", "banana", "cherry"]
for fruit in fruits:
    print(fruit)


# 2. Range Function
print("\n2. Range Function")
for i in range(3):  # 0, 1, 2
    print(i)

# 3. Enumerate
print("\n3. Enumerate")
for index, fruit in enumerate(fruits):
    print(f"{index}: {fruit}")

# 4. Nested Loops
print("\n4. Nested Loops")
for i in range(2):
    for j in range(2):
        print(f"({i}, {j})")

# 5. Break and Continue
print("\n5. Break and Continue")
numbers = [1, 2, 3, 4, 5]
for num in numbers:
    if num == 3:
        break  # Exit loop
    if num == 2:
        continue  # Skip to next iteration
    print(num)