# Basic boolean values
is_active = True
is_deleted = False
has_permission = True
print(f"Basic booleans:")
print(f"is_active: {is_active}")
print(f"is_deleted: {is_deleted}")
print(f"has_permission: {has_permission}")

# Boolean operations
print(f"\nBoolean Operations:")
print(f"True and False: {True and False}")
print(f"True or False: {True or False}")
print(f"not True: {not True}")
print(f"not False: {not False}")

# Complex boolean expressions
user_age = 25
is_premium = True
account_balance = 150.0
can_purchase = user_age >= 18 and account_balance > 100
can_get_discount = is_premium or account_balance > 500
needs_verification = not (user_age >= 21 and is_premium)
print(f"\nComplex Boolean Logic:")
print(f"Can purchase (age >= 18 and balance > 100): {can_purchase}")
print(f"Can get discount (premium or balance > 500): {can_get_discount}")
print(f"Needs verification (not (age >= 21 and premium)): {needs_verification}")


# Truthiness and Falsiness
print(f"\nTruthiness Testing:")
values_to_test = [
    0, 1, -1,           # Numbers
    "", "hello",        # Strings
    [], [1, 2, 3],      # Lists
    {}, {"key": "val"}, # Dictionaries
    None,               # None
    set(), {1, 2, 3}    # Sets
]

for value in values_to_test:
    print(f"bool({repr(value):15}) = {bool(value)}")


# Boolean conversion
print(f"\nBoolean Conversion:")
print(f"bool('False'): {bool('False')}")  # String 'False' is truthy
print(f"bool(''): {bool('')}")            # Empty string is falsy
print(f"bool(0): {bool(0)}")              # Zero is falsy
print(f"bool(0.0): {bool(0.0)}")          # Zero float is falsy
print(f"bool([]): {bool([])}")            # Empty list is falsy


# Boolean in list comprehensions
scores = [85, 92, 78, 96, 88, 73]
passing_scores = [score for score in scores if score >= 80]
all_passed = all(score >= 70 for score in scores)
any_excellent = any(score >= 95 for score in scores)
print(f"\nGrade Analysis:")
print(f"All scores: {scores}")
print(f"Passing scores (>=80): {passing_scores}")
print(f"All passed (>=70): {all_passed}")
print(f"Any excellent (>=95): {any_excellent}")