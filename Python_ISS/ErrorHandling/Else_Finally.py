# Division example
def divide(x, y):
    print(f"1. Division Example")
    try:
        result = x / y
    except ZeroDivisionError:
        print("Can't divide by zero!")
    else:
        print("Division successful")
        return result
    finally:
        print("Division attempt finished")

divide(10, 2)
divide(5, 0)

# DB Connection Example
def connect_db(host):
    print(f"\n2. DB Connection Example")
    conn = None
    try:
        conn = "Connected to " + host
        print(conn)
    except Exception as e:
        print("Connection failed:", e)
    else:
        print("Connection successful")
    finally:
        if conn:
            print("Closing connection")

connect_db("localhost")