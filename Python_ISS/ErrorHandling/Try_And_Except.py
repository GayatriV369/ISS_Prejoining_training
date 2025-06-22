# 1. BASIC TRY-EXCEPT
print("\n1. BASIC TRY-EXCEPT")

def safe_divide(a, b):
    try:
        result = a / b
        print(f"{a} / {b} = {result}")
        return result
    except ZeroDivisionError:
        print("Error: Cannot divide by zero!")
        return None

print("Basic division examples:")
safe_divide(10, 2)
safe_divide(10, 0)
safe_divide(15, 3)

def safe_convert_to_int(value):
    try:
        number = int(value)
        print(f"Converted '{value}' to {number}")
        return number
    except ValueError:
        print(f"Error: '{value}' is not a valid number")
        return None

print("\nType conversion examples:")
safe_convert_to_int("123")
safe_convert_to_int("abc")
safe_convert_to_int("45.6")

# 2. MULTIPLE EXCEPT BLOCKS
print("\n2. MULTIPLE EXCEPT BLOCKS")


def process_list_item(data_list, index):
    try:
        value = data_list[index]
        number = int(value)
        result = 100 / number
        print(f"Result: 100 / {number} = {result}")
        return result

    except IndexError:
        print(f"Error: Index {index} is out of range")
        return None

    except ValueError:
        print(f"Error: '{data_list[index]}' cannot be converted to integer")
        return None

    except ZeroDivisionError:
        print("Error: Cannot divide by zero")
        return None


print("Multiple exception examples:")
data = ["10", "5", "0", "abc", "2"]

process_list_item(data, 0)  # Success
process_list_item(data, 2)  # ZeroDivisionError
process_list_item(data, 3)  # ValueError
process_list_item(data, 10)  # IndexError

# 3. CATCHING MULTIPLE EXCEPTIONS IN ONE BLOCK
print("\n3. CATCHING MULTIPLE EXCEPTIONS IN ONE BLOCK")


def safe_calculation(a, b, operation):
    try:
        a_num = float(a)
        b_num = float(b)

        if operation == "add":
            result = a_num + b_num
        elif operation == "subtract":
            result = a_num - b_num
        elif operation == "multiply":
            result = a_num * b_num
        elif operation == "divide":
            result = a_num / b_num
        else:
            raise ValueError("Invalid operation")

        print(f"{a} {operation} {b} = {result}")
        return result

    except (ValueError, TypeError) as e:
        print(f"Input error: {e}")
        return None

    except ZeroDivisionError:
        print("Error: Division by zero")
        return None


print("Multiple exceptions in one block:")
safe_calculation("10", "5", "add")
safe_calculation("abc", "5", "multiply")
safe_calculation("10", "0", "divide")
safe_calculation("10", "5", "invalid")