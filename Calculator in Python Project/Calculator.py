def add(a, b):
    return a + b

def subtract(a, b):
    return a - b

def multiply(a, b):
    return a * b

def divide(a, b):
    return a / b

def exponent(a, b):
    return a ** b

print("Calculator")

num1 = float(input("Enter the first number: "))
num2 = float(input("Enter the second number: "))

print("Select an operation")
print("1. Addition")
print("2. Subtraction")
print("3. Multiply")
print("4. Divide")
print("5. Exponent")

choice = input("Enter your choice 1-5: ")

if choice == '1':
    result = add(num1, num2)
    operator = '+'
elif choice == '2':
    result = subtract(num1, num2)
    operator = '-'
elif choice == '3':
    result = multiply(num1, num2)
    operator = '*'
elif choice == '4':
    result = divide(num1, num2)
    operator = '/'
elif choice == '5':
    result = exponent(num1, num2)
    operator = '^'
else:
    print("Invalid choice! Please pick a number 1-5")
    exit()

print(f"\n{num1} {operator} {num2} = {result}")
