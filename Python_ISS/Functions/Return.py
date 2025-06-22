# 1. BASIC RETURN STATEMENTS
print("\n1. BASIC RETURN STATEMENTS")

def add_numbers(a, b):
    return a + b  # Returns a single value

def get_greeting():
    return "Hello, World!"  # Returns a string

def check_even(number):
    return number % 2 == 0  # Returns a boolean

print(f"5 + 3 = {add_numbers(5, 3)}")
print(f"Greeting: {get_greeting()}")
print(f"Is 4 even? {check_even(4)}")
print(f"Is 7 even? {check_even(7)}")

# 2. FUNCTIONS WITHOUT EXPLICIT RETURN
print("\n2. FUNCTIONS WITHOUT EXPLICIT RETURN")

def print_message(message):
    print(f"Message: {message}")
    # No return statement - returns None

def process_data(data):
    print(f"Processing: {data}")
    # Implicit return None

result1 = print_message("Hello")
result2 = process_data("sample data")

print(f"Result 1: {result1}")  # None
print(f"Result 2: {result2}")  # None
print(f"Type: {type(result1)}")

# 3. MULTIPLE RETURN VALUES (TUPLE UNPACKING)
print("\n3. MULTIPLE RETURN VALUES")

def get_name_age():
    return "Alice", 25  # Returns a tuple

def calculate_stats(numbers):
    if not numbers:
        return 0, 0, 0  # min, max, average
    return min(numbers), max(numbers), sum(numbers) / len(numbers)

def divide_with_remainder(dividend, divisor):
    quotient = dividend // divisor
    remainder = dividend % divisor
    return quotient, remainder

# Unpacking return values
name, age = get_name_age()
print(f"Name: {name}, Age: {age}")

# Using returned tuple directly
stats = calculate_stats([1, 5, 3, 9, 2])
print(f"Stats tuple: {stats}")

# Unpacking multiple values
min_val, max_val, avg_val = calculate_stats([10, 20, 30, 40])
print(f"Min: {min_val}, Max: {max_val}, Average: {avg_val}")

quotient, remainder = divide_with_remainder(17, 5)
print(f"17 ÷ 5 = {quotient} remainder {remainder}")