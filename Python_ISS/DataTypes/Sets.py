# Basic set
fruits = {"apple", "banana", "cherry", "apple"}
print(fruits)  # {'banana', 'cherry', 'apple'}

# Creating an empty set
empty_set = set()
print(type(empty_set))  # <class 'set'>

# Set from a list
numbers = set([1, 2, 2, 3, 4, 4])
print(numbers)  # {1, 2, 3, 4}

# Set Operations
a = {1, 2, 3, 4}
b = {3, 4, 5, 6}

print(a | b)  # Union: {1, 2, 3, 4, 5, 6}
print(a & b)  # Intersection: {3, 4}
print(a - b)  # Difference: {1, 2}
print(a ^ b)  # Symmetric difference: {1, 2, 5, 6}

# Subset and superset checks
print({1, 2} <= a)  # True
print(a >= {1, 2})  # True

# Set Methods and Mutability
colors = {"red", "green"}
colors.add("blue")
print(colors)

colors.update(["yellow", "green"])  # 'green' already exists, so only 'yellow' is added
print(colors)

colors.remove("red")  # Raises KeyError if not present
colors.discard("purple")  # No error if not present
print(colors)

colors.clear()
print(colors)  # set()

frozen = frozenset([1, 2, 3])
print(frozen)
# frozen.add(4)  # AttributeError: 'frozenset' object has no attribute 'add'