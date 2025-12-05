def buggy(arg, result =[]):
    result.append(arg)
    print(result)
    
buggy('a', ['x','y','z'])