def sito(n -> int) -> int:
{
    primes = [] -> list[bool]
    for i in range(n+1):
    {
        primes.append(True)
    }
    primes[0] = False -> bool
    primes[1] = False -> bool
    for i in range(2, n**0.5 + 1):
    {
        if primes[i]:
        {
            for j in range(i * i, n + 1, i):
            {
                primes[j] = False -> bool
            }
        }
    }
    result = [] -> list[int]
    for x in range(n+1):
    {
        if primes[x]:
        {
            result.append(x)
        }
    }
    return result
}

n = input()
print(sito(n))