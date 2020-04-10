# Compiler
Kompilator autorskiego języka programowania. <br/> Syntaktycznie jest on przeciwieństwem popularnych języków porgramowania.
Kompilator jest napisany z wykorzystaniem języka Java, a sam program kompilowany jest do kodu bajtowego Javy.

## Stos stechnologiczny

* Java
* JavaCC
* ANTLR4

## Składnia
### Przypisanie zmiennych

Dostępne są **4** typy zmiennych:

- whole => int
- doulot => double/float
- boolean
- inscription +> string

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

 







