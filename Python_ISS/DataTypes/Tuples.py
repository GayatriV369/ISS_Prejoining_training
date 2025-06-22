# Basic tuple
coordinates = (10.5, 20.3)
person = ("Alice", 30, "Engineer")
empty_tuple = ()

# Single-element tuple
single = (42,)

print(coordinates)
print(person)
print(empty_tuple)
print(single)

# Tuple Unpacking
x, y = coordinates
name, age, profession = person

print(f"x: {x}, y: {y}")
print(f"Name: {name}, Age: {age}, Profession: {profession}")

# Swapping values
a, b = 1, 2
print(f"Before swapping values are a:{a} and b:{b}")
a, b = b, a
print(f"After swapping values are a:{a} and b:{b}")


# Immutability
try:
    coordinates[0] = 99  # Raises TypeError
except TypeError as e:
    print("Error:", e)


# Built-in functions
numbers = (1, 2, 2, 3, 4, 2)
print(f"Count of 2 in the tuple is {numbers.count(2)}")
print(f"Position of 3 is at index{numbers.index(3)}")
print(f"Length of the tuple is {len(numbers)}")
print(f"Max value in the tuple is {max(numbers)}")
print(f"Min value in the tuple is {min(numbers)}")
print(f"Sum of elements in the tuple is {sum(numbers)}")

