def longest(a1, a2):
    resTab = []
    res=""
    ab = a1+a2
    for i in range(len(ab)):
        if ab[i] not in resTab:
            resTab.append(ab[i])
    resTab.sort()
    for i in range(len(resTab)):
        res+=resTab[i]
    return res
        