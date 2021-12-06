num = int(input("Enter your number : "))

result = [100]
defult = 100

if num < 100:
    while True:
        result.append(num)
        if num < 0:
            break
        x = defult - num
        defult = num
        num = x
    print("Result: ", result)

else:
    print("Error!")
