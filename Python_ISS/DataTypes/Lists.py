# Basic list creation
numbers = [1, 2, 3, 4, 5]
names = ["Alice", "Bob", "Charlie"]
mixed_list = [1, "hello", 3.14, True, None]
empty_list= []

print(f"Basic Lists:")
print(f"Numbers: {numbers}")
print(f"Names: {names}")
print(f"Mixed types: {mixed_list}")
print(f"Empty list: {empty_list}")

# List creation methods
range_list = list(range(1, 6))
string_to_list = list("Python")
repeated_list = [0] * 5
nested_list = [[1, 2], [3, 4], [5, 6]]

print(f"\nList Creation Methods:")
print(f"From range: {range_list}")
print(f"From string: {string_to_list}")
print(f"Repeated elements: {repeated_list}")
print(f"Nested list: {nested_list}")

# List indexing and slicing
fruits = ["apple", "banana", "cherry", "date", "berry"]
print(f"\nIndexing and Slicing:")
print(f"Original list: {fruits}")
print(f"First element: {fruits[0]}")
print(f"Last element: {fruits[-1]}")
print(f"Second to last: {fruits[-2]}")
print(f"First three: {fruits[:3]}")
print(f"Last two: {fruits[-2:]}")
print(f"Middle elements: {fruits[1:4]}")
print(f"Every second element: {fruits[::2]}")
print(f"Reversed: {fruits[::-1]}")

# List modification
shopping_cart = ["laptop", "mouse"]
print(f"\nList Modification:")
print(f"Initial cart: {shopping_cart}")

# Adding elements
shopping_cart.append("keyboard")
print(f"After append: {shopping_cart}")

shopping_cart.insert(1, "monitor")
print(f"After insert at index 1: {shopping_cart}")

shopping_cart.extend(["speakers", "webcam"])
print(f"After extend: {shopping_cart}")

# Removing elements
removed_item = shopping_cart.pop()
print(f"After pop(): {shopping_cart}, removed: {removed_item}")

shopping_cart.remove("mouse")
print(f"After remove('mouse'): {shopping_cart}")

del shopping_cart[0]
print(f"After del shopping_cart[0]: {shopping_cart}")

# List methods
scores = [85, 92, 78, 96, 88, 73, 92]
print(f"\nList Methods:")
print(f"Scores: {scores}")
print(f"Length: {len(scores)}")
print(f"Max score: {max(scores)}")
print(f"Min score: {min(scores)}")
print(f"Sum: {sum(scores)}")
print(f"Average: {sum(scores) / len(scores):.2f}")
print(f"Count of 92: {scores.count(92)}")
print(f"Index of 96: {scores.index(96)}")

# Sorting
original_scores = scores.copy()
scores.sort()
print(f"Sorted (ascending): {scores}")

scores.sort(reverse=True)
print(f"Sorted (descending): {scores}")


# List comprehensions
print(f"\nList Comprehensions:")
squares = [x**2 for x in range(1, 6)]
print(f"Squares: {squares}")

even_numbers = [x for x in range(1, 11) if x % 2 == 0]
print(f"Even numbers: {even_numbers}")


# List operations
list1 = [1, 2, 3]
list2 = [4, 5, 6]
print(f"\nList Operations:")
print(f"List1: {list1}")
print(f"List2: {list2}")
print(f"Concatenation: {list1 + list2}")
print(f"Repetition: {list1 * 3}")
print(f"Membership: {2 in list1}")
print(f"Not in: {7 not in list1}")


