def czynniki_pierwsze(n -> int):
{
    czynniki = [] -> list[int]
    d = 2 -> int
    while d * d <= n:
    {
        while n % d == 0:
        {
            czynniki.append(d)
            n = n//d -> int
        }
        d = d+1 -> int
    }
    if n > 1:
    {
        czynniki.append(n)
    }
    return czynniki
}

n = input() -> int
print(czynniki_pierwsze(n))