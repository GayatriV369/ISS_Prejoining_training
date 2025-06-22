# 1. BASIC *ARGS - VARIABLE POSITIONAL ARGUMENTS
print("\n1. BASIC *ARGS - Variable Positional Arguments")


def calculate_sum(*numbers):  # *args collects extra positional arguments
    print(f"Received numbers: {numbers}")  # numbers is a tuple
    print(f"Type: {type(numbers)}")
    return sum(numbers)


print(f"Sum of 1, 2, 3: {calculate_sum(1, 2, 3)}")
print(f"Sum of 10, 20: {calculate_sum(10, 20)}")
print(f"Sum of single number: {calculate_sum(5)}")
print(f"Sum of no numbers: {calculate_sum()}")


def print_items(*items):
    print(f"Items received: {len(items)}")
    for i, item in enumerate(items):
        print(f"  {i + 1}. {item}")


print("\nPrinting items:")
print_items("apple", "banana", "cherry")
print_items("hello")
print_items()

# 2. BASIC **KWARGS - VARIABLE KEYWORD ARGUMENTS
print("\n2. BASIC **KWARGS - Variable Keyword Arguments")


def create_profile(**details):  # **kwargs collects extra keyword arguments
    print(f"Profile details: {details}")  # details is a dictionary
    print(f"Type: {type(details)}")

    for key, value in details.items():
        print(f"  {key}: {value}")


print("Creating profiles:")
create_profile(name="Alice", age=25, city="New York")
create_profile(username="bob123", email="bob@email.com")
create_profile()


def display_settings(**settings):
    if not settings:
        print("No settings provided")
        return

    print("Current settings:")
    for setting, value in settings.items():
        print(f"  {setting} = {value}")


print("\nDisplay settings:")
display_settings(debug=True, port=8080, ssl_enabled=False)

# 5. COMBINING *ARGS AND **KWARGS
print("\n5. COMBINING *ARGS AND **KWARGS")


def flexible_function(*args, **kwargs):
    print(f"Positional arguments: {args}")
    print(f"Keyword arguments: {kwargs}")

    # Process positional arguments
    if args:
        print("Processing positional args:")
        for i, arg in enumerate(args):
            print(f"  Arg {i}: {arg}")

    # Process keyword arguments
    if kwargs:
        print("Processing keyword args:")
        for key, value in kwargs.items():
            print(f"  {key}: {value}")


print("Flexible function examples:")
flexible_function(1, 2, 3, name="Alice", age=25)
print()
flexible_function("hello", debug=True)
print()
flexible_function()