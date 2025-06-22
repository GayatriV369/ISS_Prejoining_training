# 1. BASIC IF-ELSE STRUCTURE
print("\n1. BASIC IF-ELSE STRUCTURE")
age = int(input("Enter your age"))
print(f"Age: {age}")

if age >= 18:
    print("You are eligible to vote!")
else:
    print("You are not eligible to vote yet.")


# 2. IF-ELIF-ELSE
print("\n2. IF-ELIF-ELSE")

score = int(input("Enter the score"))
print(f"Student score: {score}")

if score >= 90:
    grade = "A"
    print("Excellent work!")
elif score >= 80:
    grade = "B"
    print("Good job!")
elif score >= 70:
    grade = "C"
    print("Satisfactory performance.")
elif score >= 60:
    grade = "D"
    print("Needs improvement.")
else:
    grade = "F"
    print("Failed. Please retake the exam.")

print(f"Final grade: {grade}")

# 3. NESTED IF-ELSE STATEMENTS
print("\n3. NESTED IF-ELSE STATEMENTS")

user_age = 25
has_license = True
has_car = False

print(f"Age: {user_age}, Has license: {has_license}, Has car: {has_car}")

if user_age >= 18:
    print("You are an adult.")
    if has_license:
        print("You can legally drive.")
        if has_car:
            print("You can drive your own car!")
        else:
            print("You might need to rent or borrow a car.")
    else:
        print("You need to get a driving license first.")
else:
    print("You are too young to drive.")