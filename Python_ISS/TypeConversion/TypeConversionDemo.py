#  IMPLICIT TYPE CONVERSION
print("\n1. IMPLICIT TYPE CONVERSION")

# Python automatically converts smaller data type to larger
int_num = 10
float_num = 3.14
result = int_num + float_num
print(f"Integer: {int_num} (type: {type(int_num)})")
print(f"Float: {float_num} (type: {type(float_num)})")
print(f"Result: {result} (type: {type(result)})")

# Boolean to integer conversion
bool_val = True
int_val = 5
result2 = bool_val + int_val  # True becomes 1

print(f"Boolean: {bool_val} + Integer: {int_val} = {result2}")

# 2. EXPLICIT TYPE CONVERSION (MANUAL)
print("\n2. EXPLICIT TYPE CONVERSION")


# STRING CONVERSIONS
print("STRING CONVERSIONS:")
number = 42
float_number = 3.14159
boolean = True

str_from_int = str(number)
str_from_float = str(float_number)
str_from_bool = str(boolean)

print(f"int to str: {number} -> '{str_from_int}' (type: {type(str_from_int)})")
print(f"float to str: {float_number} -> '{str_from_float}' (type: {type(str_from_float)})")
print(f"bool to str: {boolean} -> '{str_from_bool}' (type: {type(str_from_bool)})")

# INTEGER CONVERSIONS
print("\nINTEGER CONVERSIONS:")
str_number = "123"
float_number = 45.67
bool_true = True
bool_false = False

int_from_str = int(str_number)
int_from_float = int(float_number)  # Truncates decimal part
int_from_bool_true = int(bool_true)
int_from_bool_false = int(bool_false)

print(f"str to int: '{str_number}' -> {int_from_str} (type: {type(int_from_str)})")
print(f"float to int: {float_number} -> {int_from_float} (type: {type(int_from_float)})")
print(f"bool True to int: {bool_true} -> {int_from_bool_true}")
print(f"bool False to int: {bool_false} -> {int_from_bool_false}")

# FLOAT CONVERSIONS
print("\nFLOAT CONVERSIONS:")
str_float = "3.14"
int_number = 42
bool_val = True

float_from_str = float(str_float)
float_from_int = float(int_number)
float_from_bool = float(bool_val)

print(f"str to float: '{str_float}' -> {float_from_str} (type: {type(float_from_str)})")
print(f"int to float: {int_number} -> {float_from_int} (type: {type(float_from_int)})")
print(f"bool to float: {bool_val} -> {float_from_bool}")

# BOOLEAN CONVERSIONS
print("\nBOOLEAN CONVERSIONS:")
test_values = [0, 1, -1, "", "hello", [], [1, 2], {}, {"key": "value"}, None]

print("Testing truthiness of different values:")
for value in test_values:
    bool_result = bool(value)
    print(f"bool({repr(value):15}) = {bool_result}")

# 3. COLLECTION TYPE CONVERSIONS
print("\n3. COLLECTION TYPE CONVERSIONS")

# LIST CONVERSIONS
original_list = [1, 2, 3, 4, 5]
print(f"Original list: {original_list}")

# List to other types
list_to_tuple = tuple(original_list)
list_to_set = set(original_list)
list_to_str = str(original_list)

print(f"List to tuple: {list_to_tuple} (type: {type(list_to_tuple)})")
print(f"List to set: {list_to_set} (type: {type(list_to_set)})")
print(f"List to string: {list_to_str}")

# STRING TO LIST
text = "Python"
string_to_list = list(text)
print(f"String to list: '{text}' -> {string_to_list}")

# TUPLE CONVERSIONS
original_tuple = (1, 2, 3, 2, 1)
print(f"\nOriginal tuple: {original_tuple}")

tuple_to_list = list(original_tuple)
tuple_to_set = set(original_tuple)  # Removes duplicates

print(f"Tuple to list: {tuple_to_list}")
print(f"Tuple to set: {tuple_to_set}")

# SET CONVERSIONS
original_set = {1, 2, 3, 4, 5}
print(f"\nOriginal set: {original_set}")

set_to_list = list(original_set)
set_to_tuple = tuple(original_set)

print(f"Set to list: {set_to_list}")
print(f"Set to tuple: {set_to_tuple}")

# 4. DICTIONARY CONVERSIONS
print("\n4. DICTIONARY CONVERSIONS")

student_dict = {"name": "Alice", "age": 25, "grade": "A"}
print(f"Original dict: {student_dict}")

# Dictionary views to lists
keys_list = list(student_dict.keys())
values_list = list(student_dict.values())
items_list = list(student_dict.items())

print(f"Keys to list: {keys_list}")
print(f"Values to list: {values_list}")
print(f"Items to list: {items_list}")

# List of tuples to dictionary
pairs = [("x", 1), ("y", 2), ("z", 3)]
dict_from_pairs = dict(pairs)
print(f"List of tuples to dict: {pairs} -> {dict_from_pairs}")

# 5. NUMERIC BASE CONVERSIONS
print("\n5. NUMERIC BASE CONVERSIONS")

decimal_num = 42
print(f"Decimal number: {decimal_num}")

# Convert to different bases
binary_str = bin(decimal_num)
octal_str = oct(decimal_num)
hex_str = hex(decimal_num)

print(f"To binary: {binary_str}")
print(f"To octal: {octal_str}")
print(f"To hexadecimal: {hex_str}")

# Convert back to decimal
binary_to_decimal = int("0b101010", 2)
octal_to_decimal = int("0o52", 8)
hex_to_decimal = int("0x2a", 16)

print(f"Binary to decimal: '0b101010' -> {binary_to_decimal}")
print(f"Octal to decimal: '0o52' -> {octal_to_decimal}")
print(f"Hex to decimal: '0x2a' -> {hex_to_decimal}")

