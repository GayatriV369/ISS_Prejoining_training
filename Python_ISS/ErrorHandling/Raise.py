
print("\n 1.Amount Withdrawal Example")

def withdraw_money(balance, amount):
    if amount <= 0:
        raise ValueError(f"Invalid amount: ${amount}")
    if amount > balance:
        raise ValueError(f"Insufficient funds: ${amount} > ${balance}")

    new_balance = balance - amount
    print(f"Withdrew ${amount}. New balance: ${new_balance}")
    return new_balance


print("Testing withdrawals:")
try:
    withdraw_money(100, 50)
    withdraw_money(50, -10)
except ValueError as e:
    print(f"Error: {e}")

try:
    withdraw_money(20, 100)
except ValueError as e:
    print(f"Error: {e}")

print(f"2. Discount Calculator Example")
print("\n10. PRACTICAL EXAMPLE")

def calculate_discount(price, discount_percent):
    # Input validation
    if price < 0:
        raise ValueError("Price cannot be negative")

    if discount_percent < 0 or discount_percent > 100:
        raise ValueError("Discount must be between 0 and 100")

    # Calculate discount
    discount_amount = price * (discount_percent / 100)
    final_price = price - discount_amount

    print(f"Original: ${price}")
    print(f"Discount: {discount_percent}% (${discount_amount})")
    print(f"Final: ${final_price}")

    return final_price


print("Testing discount calculator:")
try:
    calculate_discount(100, 20)
    calculate_discount(-50, 10)
except ValueError as e:
    print(f"Error: {e}")

try:
    calculate_discount(100, 150)
except ValueError as e:
    print(f"Error: {e}")