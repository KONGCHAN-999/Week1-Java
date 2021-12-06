number = [87,45,33,72,87,92,88,76]
number2=[]

def Score(scores):
    sum = 0
    for i in number:
        if i == max(number):
            continue
        if i == min(number):
            continue
        sum+=i
        number2.append(sum) 
    print(number,"Result ==>",sum//6)

Score(number)