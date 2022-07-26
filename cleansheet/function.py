def myFunc(panidrumCheck):
    panidrum = panidrumCheck[::-1] #reversing the string
    if(panidrum == panidrumCheck):
        return print("{0} is a panidrum".format(panidrumCheck))
    else: return  print("{0} is not a panidrum".format(panidrumCheck))
    
myFunc("mom")

def myFunc2(var):
    x = len(var)
    myArr = []
    for i in range(x-1, -1, -1):
        myArr.append(var[i])
    var2 = "".join(myArr).__str__()
    if(var == var2): return print("{0} is a panidrum".format(var))
    else: return print("{0} is not a panidrum".format(var))
    
myFunc2("dadd")


def doSome(a,b = 3):
    print(a+b)

doSome(1)

def doSome2(a, *b, **c):
    # b here is a list while c is a dictionary
    mySum = sum(b)
    myArr = sum(c.values())
    print(a + mySum + myArr)
    
doSome2(1,2,3,4,5,6,6,7,8,8, age=30, year=2022)