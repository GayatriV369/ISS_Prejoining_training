# 1. BASIC PARAMETERS AND ARGUMENTS
print("\n1. BASIC PARAMETERS AND ARGUMENTS")

def greet(name, age):  # name and age are parameters
    return f"Hello {name}, you are {age} years old"

# Calling with positional arguments
result1 = greet("Alice", 25)  # "Alice" and 25 are arguments
print(f"Positional: {result1}")

# Calling with keyword arguments
result2 = greet(age=30, name="Bob")  # Order doesn't matter with keywords
print(f"Keyword: {result2}")

# Mixed positional and keyword
result3 = greet("Charlie", age=35)  # Positional first, then keyword
print(f"Mixed: {result3}")

# 2. DEFAULT PARAMETERS
print("\n2. DEFAULT PARAMETERS")

def create_profile(name, age=18, city="Unknown", active=True):
    status = "Active" if active else "Inactive"
    return f"Profile: {name}, {age} years old, from {city} - {status}"

print("Using defaults:")
print(create_profile("Alice"))

print("\nOverriding some defaults:")
print(create_profile("Bob", 25))
print(create_profile("Charlie", city="New York"))
print(create_profile("Diana", active=False))

print("\nOverriding all defaults:")
print(create_profile("Eve", 30, "Boston", False))