def find_it(seq):
    seq.sort()
    print(seq)
    for i in range(len(seq)):
        nb = 0
        for j in range(len(seq)):
            if(seq[i] == seq[j]):
                nb+=1
        if(nb%2 != 0):
            return seq[i]
        else:
            nb =0
    return 0
