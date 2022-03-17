def nb_year(p0, percent, aug, p):
    res = 0
    while(p0 < p):
        p0 = int(p0 + p0*percent/100)
        p0+=aug
        p0 = int(p0)
        res+=1
    return res