# OOPJ — Object Oriented Java Programming (23CS3PCOOJ)

Lab programs for the Object Oriented Java Programming course at B.M.S. College of Engineering
(VTU, Sept 2024 – Jan 2025). The programs are submitted coursework and are kept as submitted.
The written lab report is [`VIAMRSH-REPORT.pdf`](VIAMRSH-REPORT.pdf) (32 pages). Its index lists the
ten lab programs below, plus the course outcomes.

## Toolchain

Plain JDK, no build file. Every command below was run with the JDK in the routine environment unless
a note says otherwise. Programs that read input use `java.util.Scanner` on standard input.

## Programs

### Lab programs (index of the report)

| # | Path | What it does |
|---|------|--------------|
| 1 | [`Quadratic.java`](Quadratic.java) | Reads `a`, `b`, `c` and reports the roots of `ax² + bx + c = 0` by discriminant. **Does not compile as committed** — see [Known issues](#known-issues). |
| 2 | [`Student.java`](Student.java) (and `student.java`) | `Student` class: reads USN, name and credits/marks for two semesters, prints SGPA per semester and the average of the two as CGPA. |
| 3 | [`Lab 3/Book.java`](Lab%203/Book.java) | `Book` class with constructor, getter and `toString()`. Reads `n` books, then searches by name (case-insensitive). |
| 4 | [`Lab 4/Shape.java`](Lab%204/Shape.java) | Abstract `Shape` with `Rectangle`, `Triangle`, `Circle` subclasses overriding `printArea()`. Fixed sizes, no input. |
| 5 | [`Lab 5/Bank.java`](Lab%205/Bank.java) | Abstract `Account` with `SavingsAccount` and `CurrentAccount`; menu for deposit, withdraw, balance, exit. |
| 6 | [`Lab 6/`](Lab%206) | Packages `cie` (`Student`, `Internals`) and `see` (`External`); `Main` reads marks for `n` students and prints combined marks. |
| 7 | [`Lab 7/Main.java`](Lab%207/Main.java) | Custom checked exception `WrongAge`, thrown by `Father`/`Son` constructors for invalid ages. |
| 8 | [`Lab 8/Main.java`](Lab%208/Main.java) | Two threads: prints "BMS College of Engineering" every 10 s and "CSE" every 2 s. |
| 9 | [`Lab 9/Main.java`](Lab%209/Main.java) | Swing GUI for integer division; dialogs for non-integer input and division by zero. |
| 10 | [`Lab 10/`](Lab%2010) | `Main.java`: a deadlock demo. `InterprocessCommunication.java`: producer/consumer with `wait`/`notify`. |

### Other root-level programs

| Path | What it does |
|------|--------------|
| [`Max.java`](Max.java) | Largest of three integers. |
| [`Prime.java`](Prime.java) | Trial-division primality check. Its class is named `Max` (see below). |
| [`Factorial.java`](Factorial.java) | Factorial with an `int` loop. |
| [`Fibonacci.java`](Fibonacci.java) | Prints the first `n` Fibonacci terms. |
| [`TypeCast.java`](TypeCast.java) | Widening (`int` → `double`) and explicit (`double` → `int`) conversion. |
| [`ClassDemo.java`](ClassDemo.java) | A `Car` class used from `Main`; reads name, model and year. |
| [`Book.java`](Book.java) | An earlier copy of the Lab 3 `Book` program. |

## How to compile and run

Several files declare `class Main`, and some files declare a class with a different name from the
file, so **compile each program on its own into its own output directory** and name the class to run.
Compiling two `Main`-declaring files into the same directory overwrites `Main.class`.

| Program | Compile | Run |
|---------|---------|-----|
| `Max.java` | `javac -d out/max Max.java` | `java -cp out/max Max` |
| `Prime.java` | `javac -d out/prime Prime.java` | `java -cp out/prime Max` |
| `Factorial.java` | `javac -d out/fact Factorial.java` | `java -cp out/fact Factorial` |
| `Fibonacci.java` | `javac -d out/fib Fibonacci.java` | `java -cp out/fib Fibonacci` |
| `TypeCast.java` | `javac -d out/cast TypeCast.java` | `java -cp out/cast TypeCast` |
| `ClassDemo.java` | `javac -d out/car ClassDemo.java` | `java -cp out/car Main` |
| `Student.java` | `javac -d out/student Student.java` | `java -cp out/student Student` |
| `Book.java` | `javac -d out/book Book.java` | `java -cp out/book Main` |
| Lab 3 | `javac -d out/l3 "Lab 3/Book.java"` | `java -cp out/l3 Main` |
| Lab 4 | `javac -d out/l4 "Lab 4/Shape.java"` | `java -cp out/l4 Main` |
| Lab 5 | `javac -d out/l5 "Lab 5/Bank.java"` | `java -cp out/l5 Bank` |
| Lab 6 | `cd "Lab 6" && javac -d ../out/l6 Main.java cie/*.java see/*.java` | `java -cp out/l6 Main` (from the repo root) |
| Lab 7 | `javac -d out/l7 "Lab 7/Main.java"` | `java -cp out/l7 Main` |
| Lab 8 | `javac -d out/l8 "Lab 8/Main.java"` | `java -cp out/l8 Main` |
| Lab 9 | `javac -d out/l9 "Lab 9/Main.java"` | `java -cp out/l9 IntegerDivisionApp` |
| Lab 10 | `javac -d out/l10 "Lab 10"/*.java` | `java -cp out/l10 Deadlock` or `java -cp out/l10 PCFixed` |

`out/` is a scratch directory; delete it when done.

### Behaviour notes

- **Lab 6** is a package layout (`cie/`, `see/`); `Main` imports from both, so all four files must be
  compiled together as shown. For each student it asks for 5 internal marks (out of 50) and 5 SEE marks
  (out of 100) and prints `internal + SEE / 2` per course. The heading it prints says "Internal Marks"
  but the values are the combined final marks.
- **Lab 8** never ends on its own (both threads loop forever); stop it with Ctrl-C.
- **Lab 9** opens a window, so it needs a display (a desktop JDK session, not a headless server).
  It was compiled here but not launched.
- **Lab 10** — `Deadlock` hangs by design: after printing "MainThread trying to call BB.last()" and
  "RacingThread trying to call AA.last()" both threads wait on each other's lock forever. `PCFixed`
  (in `InterprocessCommunication.java`) runs forever alternating `Put: n` / `Got: n`; stop with Ctrl-C.
- **Lab 5** — a current account must receive an opening deposit of at least 8500; a savings deposit
  adds 5% on top of the amount. Option 4 exits.

### Sample runs

Produced by running the programs:

```
$ echo "3 9 5" | java -cp out/max Max
Enter the values for :
X = Y = Z = The Largest is 9

$ echo 6 | java -cp out/fib Fibonacci
Enter the number of terms: 0 1 1 2 3 5

$ printf '7\n3.9\n' | java -cp out/cast TypeCast
Enter an integer for widening conversion: Widening conversion: 7.0
Enter a double for explicit conversion: Explicit conversion: 3

$ java -cp out/l4 Main
Rectangle Shape
The area is : 10
Triangle Shape
The area is : 5.0
Circle Shape
The area is : 78.53981633974483

$ printf '40\n50\n' | java -cp out/l7 Main
Enter father's age: Enter son's age: Exception: Son's age should be less than the father's age.
```

(Standard input was piped, so prompts appear on one line.)

## Known issues

These are in the code exactly as it was submitted and are recorded here, not fixed:

- `Quadratic.java` fails to compile (`illegal character: '–'` at line 25, stray pasted text inside the
  code). Separately, its distinct-roots formula does not divide `sqrt(discriminant)` by `2a`.
- `Student.java` and `student.java` differ only in case of the file name, which cannot both be checked
  out on a case-insensitive file system (default macOS, Windows).
- `Prime.java` declares `class Max`, and treats 0 and 1 as prime.
- `Factorial.java` uses `int` (overflows from 13!) and prints a misleading message for negative input.
