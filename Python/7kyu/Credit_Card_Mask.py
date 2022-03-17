def maskify(cc):
    res = "";
    for i in range(len(cc)):
        if (i < len(cc)-4):
            res += "#"
        else:
            res += cc[i]
    return res