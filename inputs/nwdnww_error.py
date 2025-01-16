def nwd(a -> int, b -> int):
{
    while b:
    {
        t = a -> int
        a = b -> int
        b = t % b -> int
    }
    return a


def nww(a -> int, b -> int):
{
    return a * b // nwd(a, b)
}

a = input() -> int
b = input() -> int

print(nwd(a,b))
print(nww(a,b))