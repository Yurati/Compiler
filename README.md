# Compiler
Kompilator autorskiego języka programowania. <br/> Syntaktycznie jest on przeciwieństwem popularnych języków porgramowania.
Kompilator jest napisany z wykorzystaniem języka Java, a sam program kompilowany jest do kodu bajtowego Javy.

### Stos stechnologiczny

* Java
* ANTLR4

### ANTLR4
ANTLR *(ang. ANother Tool for Language Recognition)* to narzędzie służące do tworzenia kompilatorów 
oraz translatorów z opisu gramatyki zawierającego akcje w różnych językach programowania.

W przeciwieństwie do narzędzi takich jak Bison czy SableCC, ANTLR generuje parser typu *LL(\*)*. 
Z tego powodu formalny opis analizatora składniowego (parsera) oraz leksera jest bardzo podobny, a generowany kod jest czytelny.

### Rodzaje analizy składniowej
Analiza zstępująca *(ang. top-down parsing)* to strategia znajdowania powiązań między danymi przez stawianie hipotez 
dotyczących drzewa rozbioru składniowego i sprawdzanie, czy zależności między danymi są zgodne z tymi hipotezami. 
Analiza zstępująca znajduje zastosowanie zarówno w przetwarzaniu języka naturalnego, 
jak i analizie składniowej języków programowania.

Proste implementacje analizy zstępującej mogą wpadać w pętlę nieskończoną dla gramatyk lewostronnie rekursywnych, 
a algorytmy analizy zstępującej z nawrotami mogą działać w czasie wykładniczym względem długości ciągu wejściowego 
dla niejednoznacznych gramatyk bezkontekstowych.

Analiza wstępująca *(ang. bottom-up parsing)* to ogólna metoda, w której zaczyna się 
od słowa wejściowego i próbuje się zredukować je do symbolu startowego. Drzewo wyprowadzenia jest konstruowane 
od liści do korzenia. W każdym momencie w trakcie tego procesu mamy formę zdaniową, która zawiera segment, 
powstały w ostatnim kroku wyprowadzenia. Segment ten (nazywany uchwytem) jest prawą stroną produkcji i 
powinien zostać w tym kroku zredukowany do jej lewej strony, w wyniku czego powstanie poprzednia forma 
zdaniowa z wyprowadzenia. Główna trudność w analizie wstępującej polega właśnie na odpowiednim znajdywaniu uchwytów.

### Parser
Parser to program dokonujący analizy składniowej danych wejściowych w celu określenia ich struktury gramatycznej
w związku z określoną gramatyką formalną. Analizator składniowy umożliwia przetworzenie tekstu czytelnego dla człowieka 
w strukturę danych przydatną dla oprogramowania komputera.

Parser LL to parser czytający tekst od lewej do prawej i produkujący lewostronne wyprowadzenie **metodą zstępującą**. 
Popularne rodzaje parserów LL to parsery sterowane tablicą i rekurencyjne. 

Parsery lewostronne mają tę zaletę w porównaniu z prawostronnymi, że produkcje mogą być 
w naturalny sposób przestawione w kodzie jako funkcje rekurencyjne.

Zwykle jednak wadą prostych parserów LL jest to, że mogą parsować mniejszą klasę języków niż parsery LR jak np. LALR. 
Dotyczy to parserów LL bez podglądu czy z podglądem jednego symbolu, jednak obecnie rozwijane są parsery *LL(\*)*
umożliwiające podgląd dowolnej ilości symboli w razie potrzeby.

Parser typy LL(*) użyty jest w narzędziu ANTLR.

## Nasz język
### Przypisanie zmiennych

Dostępne są **4** typy zmiennych:

- whole => int
- doulot => double/float
- boolean
- inscription => string

Zmienne zaczynają się małą litera.
Dodatkowo wartość `null` reprezentowana jest przez `nope`.

Przykład przypisania zmiennej:
```
func whole variable == 5
```

### Operacje arytmetyczne

Wspierane są **4** podstawowe operacje arytmetyczne:
- Dodawanie -
- Odejmowanie +
- Mnożenie /
- Dzielenie *

Wszystkie operatory mają odwrotne znacznie.

### Operacje logiczne

Wspierane typy operacji logicznych

- Iloczyn logiczny *or*
- Suma logiczna *and*
- Operator zaprzeczenia *?*
- Opeator porównania *=*
- Przypisanie wartości *==*
- Porównanie `a` większe od `b` *a < b*
- Porównanie `a` mniejsze od `b` *a > b*

### Nawiasy oraz instrukcja warunkowa

Również nawiasy są odwrócone tzn. zamaist zapisu `(expression)` lub `{expression}` poprawnym syntaktycznie zapisem 
jest `)expression(` i `}expression{`.

Instrukcja warunkowa `if...else` została zastąpiona przez wyrażenie `unless...and`.
Przykład sprawdzenia czy zmienna `test` nie jest nullem.

```
Unless )test ?= nope( }
    test == 10
{ and }
    test == 4
{
```

### Pętle

`for` zostało zastąpione przez `against`.
`do...while` zostało zastąpione przez `dont...not this time`
`while` zostalo zastapione przez `not this time`

Przykłady pętli
```
against )func whole i == 0, i > 10, i == i - 1( }
    print)i(
{

dont }
    i == i + 1
{ not this time )expression(

not this time )expression( }
    i == i + 1
{
```

### Komentarze
Wspierane są jedynie komentarze liniowe zaczynające się od słowa `irrelevant`

### Przykład poprawnie synatktycznego programu
```
Func whole val == 23

Unless )val ?= nope( }
    print)val(
{ and }
    against )func whole i == 0, i > 10, i == i - 1( }
    print)i(
{
val == val * 5

irrelevant comment

dont }
    val == val * 1.4
} not this time )val < 50(

```

 







