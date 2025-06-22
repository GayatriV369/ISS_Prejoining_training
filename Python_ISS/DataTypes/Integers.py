# Basic integer operations
user_id = 12345
age = 25
score = 95

print(f"Basic integers: user_id={user_id}, age={age}, score={score}")

# Integer arithmetic
total_users = 1000
new_users = 150
growth_rate = new_users * 100 // total_users  # Floor division
print(f"Growth rate: {growth_rate}%")

# Large integers
big_number = 123456789012345678901234567890
factorial_20 = 1
for i in range(1, 21):
    factorial_20 *= i

print(f"Big number: {big_number}")
print(f"20! = {factorial_20}")

# Binary, Octal, Hexadecimal
permissions = 0b111101101  # Binary
file_mode = 0o755         # Octal
color_code = 0xFF5733     # Hexadecimal

print(f"Binary {bin(permissions)} = {permissions}")
print(f"Octal {oct(file_mode)} = {file_mode}")
print(f"Hex {hex(color_code)} = {color_code}")

# Integer methods 
number = -42
print(f"Absolute value: {abs(number)}")
print(f"Bit length: {number.bit_length()}")

# Time calculations
seconds_in_day = 24 * 60 * 60
days_in_year = 365
seconds_in_year = seconds_in_day * days_in_year
print(f"Seconds in a year: {seconds_in_year:,}")

# Integer operations
a, b = 15, 4
print(f"\nInteger Operations with {a} and {b}:")
print(f"Addition: {a} + {b} = {a + b}")
print(f"Subtraction: {a} - {b} = {a - b}")
print(f"Multiplication: {a} * {b} = {a * b}")
print(f"Division: {a} / {b} = {a / b}")
print(f"Floor Division: {a} // {b} = {a // b}")
print(f"Modulus: {a} % {b} = {a % b}")
print(f"Power: {a} ** {b} = {a ** b}")