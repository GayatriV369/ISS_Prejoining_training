# 1. BASIC PASS - Placeholder for empty code blocks
print("\n1. BASIC PASS - Empty Code Blocks")

# Empty function (would cause SyntaxError without pass)
def placeholder_function():
    pass  # TODO: Implement this function later

print("Function with pass created successfully")

# Empty class
class EmptyClass:
    pass

print("Empty class created successfully")

# Empty if statement
x = 5
if x > 0:
    pass  # TODO: Add positive number logic
else:
    print("Number is not positive")

print("If statement with pass executed")

# 2. PASS in Exception Handling
print("\n2. PASS in Exception Handling")

numbers = [1, 2, 0, 4, 5]
for num in numbers:
    try:
        result = 10 / num
        print(f"10 / {num} = {result}")
    except ZeroDivisionError:
        pass  # Silently ignore division by zero
        print(f"Skipped division by zero for {num}")

# 3. PASS in Loops
print("\n3. PASS in Loops")

# Placeholder in loop
print("Processing numbers 1-5:")
for i in range(1, 6):
    if i == 3:
        pass  # TODO: Special handling for number 3
    print(f"Number: {i}")

# 4. PASS vs Other Statements
print("\n4. PASS vs Other Statements")

# Demonstrating the difference
data = [1, 2, 3, 4, 5]

print("Using pass (does nothing):")
for item in data:
    if item % 2 == 0:
        pass  # Does nothing, continues to next line
    print(f"Item: {item}")

print("\nUsing continue (skips iteration):")
for item in data:
    if item % 2 == 0:
        continue  # Skips the rest of this iteration
    print(f"Odd item: {item}")