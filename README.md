# Metody i algorytmy kompilacji - projekt

## Konwerter języka Python do języka C++

- Założenia programu
  - Program czyta kod w języku *Python* i konwertuje go na język *C++* w wersji *C++11* i wyższych
  - Rodzaj translatora: **kompilator** 
  - Plik programu: **transcoder.py**
  - Wynik działania programu:
    - Poprawny kod: wyświetla się w konsoli
    - Niepoprawny kod: wypisanie komunikatu błędu wraz z jego pozycją
  - Język implementacji: **Python 3.12**
  - Generator skanera/parsera: **ANTLR4**

- Gramatyka i tokeny
  - Format: **EBNF**
  - [Link do gramatyki](https://github.com/p3t3rzb/py-cpp-compiler/blob/master/py.g4)

- Generator skanera/parsera: **ANTLR4**

## Różnice z Pythonem

- zamiast wcięć stosujemy klamry { }
- zakres ważności zmiennych to od ich deklaracji do końca funkcji
- nazwy funkcji nie mogą się powtarzać, niezależnie od miejsca ich deklaracji
- stosujemy type hints przy przypisaniu i w deklaracji zmiennych przyjmowanych przez funkcję

## Co potrafi program

Program potrafi przetworzyć podstawowe instrukcje jak:

- przypisanie (tylko dla jednej zmiennej na raz)
- operacje wejścia/wyjścia print(), input()
- instrukcje warunkowe
- pętle for (i funkcja range), while
- funkcje
- operatory break, continue
- wyrażenia logiczne i wartościowane
- typy int, string, float, bool, listy
- komentarze


## Przykłady

### Poprawny kod

Dla `inputs/czynnikipierwsze.py`:

```python
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
```

Drzewo wyprowadzenia (w konsoli):

Kod wynikowy

```cpp
#include <iostream>
#include <vector>
#include <cmath>

template <typename T>
std::ostream& operator<<(std::ostream& os, const std::vector<T>& vec) {
        os << "{";
        for (size_t i = 0; i < vec.size(); ++i) {
                os << vec[i];
                if (i != vec.size() - 1) {
                        os << ", ";
                }
        }
        os << "}";
        return os;
}

std::vector<int> range(int start, int stop, int step) {
    std::vector<int> result;

    for (int i = start; (step > 0) ? (i < stop) : (i > stop); i += step) {
        result.push_back(i);
    }

    return result;
}

std::vector<int> range(int start, int stop) {
    return range(start, stop, 1);
}

std::vector<int> range(int stop) {
    return range(0, stop, 1);
}

int main() {
        auto czynniki_pierwsze = [=](int n) {
                std::vector<int> czynniki = {};
                int d = 2;
                while (d * d <= n) {
                        while (n % d == 0) {
                                czynniki.push_back(d);
                                n = n / d;
                        }
                        d = d + 1;
                }
                if (n > 1) {
                        czynniki.push_back(n);
                }

                return czynniki;
        };
        int n; std::cin >> n;
        std::cout<<czynniki_pierwsze(n)<<std::endl;
}
```

### Niepoprawny kod

```py
a = 3
b = "abc]
```

```console
line 2:4 token recognition error at: '"abc]\n'
line 1:5 no viable alternative at input '3\n'
line 3:0 mismatched input '<EOF>' expecting {'f', 'not', 'True', 'False', 'None', NUMBER, STRING, IDENTIFIER, '(', '['}
```