# 1. BASIC FOR-ELSE
print("\n1. BASIC FOR-ELSE")
print("Searching for number 7:")
numbers = [1, 3, 5, 9, 11]

for num in numbers:
    print(f"Checking: {num}")
    if num == 7:
        print("Found 7!")
        break
else:
    print("7 not found in the list")  # This runs because no break occurred

print("\nSearching for number 5:")
for num in numbers:
    print(f"Checking: {num}")
    if num == 5:
        print("Found 5!")
        break
else:
    print("5 not found in the list")  # This won't run because break occurred


# 2.Prime Number Checker
def is_prime(n):
    print(f"PRIME NUMBER CHECKER")
    if n < 2:
        return False

    print(f"Checking if {n} is prime:")
    for i in range(2, int(n ** 0.5) + 1):
        print(f"  Testing divisor: {i}")
        if n % i == 0:
            print(f"  {n} is divisible by {i}")
            return False
    else:
        print(f"  No divisors found")
        return True


# Test prime checker
test_numbers = [17, 18, 13]
for num in test_numbers:
    result = is_prime(num)
    print(f"{num} is {'prime' if result else 'not prime'}\n")

