# Basic string creation
name = "Alice Johnson"
email = 'alice@company.com'
description = """Senior Software Engineer with 5+ years of experience"""

print(f"Basic strings:")
print(f"Name: {name}")
print(f"Email: {email}")
print(f"Description: {description}")

# Date and time formatting
from datetime import datetime, date
now = datetime.now()
today = date.today()

print(f"\nDate/Time Formatting:")
print(f"Current time: {now:%Y-%m-%d %H:%M:%S}")
print(f"Today's date: {today:%B %d, %Y}")


# Multi-line f-strings
order_id = 12
items = ["Laptop", "Mouse", "Keyboard"]
total = 1125.50
invoice = f"""
Invoice #{order_id}
Items: {', '.join(items)}
Total: ${total:,.2f}
Date: {today:%B %d, %Y}
"""
print(f"Multi-line F-string:{invoice}")
