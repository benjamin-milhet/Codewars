def narcissistic( value ):
    size = len(str(value))
    v = value
    res = 0
    resBool = 0
    for i in range(size):
        n = v%10
        res += pow(n,size)
        v = int((v-n)/10)
        
    if(res == value):
        resBool = 1
    elif (res == 0):
        resBool = 1
               
    return resBool
        