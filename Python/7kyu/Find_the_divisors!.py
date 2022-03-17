def divisors(integer):
    res = []
    for i in range(1, integer):
        if(i!=1):
            if(integer%i == 0):
                res.append(i)
    if(len(res) == 0):
        return str(integer) + " is prime"
    return res
        
