# Commit Backlog — OOPJ

Object Oriented Java Programming (23CS3PCOOJ) lab programs, BMSCE. This is **submitted coursework and
a public portfolio**: the work was graded, so every change must be additive.

## Rules

- ALLOWED: READMEs (repo index, per-lab notes), `.gitignore` entries, removing clearly accidental junk
  (`.class` files, `.DS_Store`, editor folders), notes on how to compile/run.
- FORBIDDEN: editing any `.java` file, changing an algorithm or its output, reformatting source, or
  anything that alters what was assessed. If a program looks wrong, record it under "Observations"
  below. Do not fix it.
- One item per commit, top unchecked item first. Verify any command a README tells the reader to run
  by actually running it (`javac`/`java` are available in the routine environment).
- Never state in a README what the code does until you have read that code.
- Stage named paths only. Tick the item and append to the Log in the same commit.

## Queue

- [ ] **B1 — Top-level `README.md`.** Index every program with a one-line description and its path
  (`Max`, `Prime`, `Factorial`, `Fibonacci`, `Quadratic`, `TypeCast`, `Student`/SGPA, `Book`, `ClassDemo`,
  and `Lab 3`–`Lab 10`), how to compile/run (note: many files declare `class Main`, and `Lab 6` is a
  package layout: `cie/`, `see/`), the toolchain (plain JDK, no build file), and a link to
  `VIAMRSH-REPORT.pdf` (the lab report; confirm its contents against the code before describing them).
- [ ] **B2 — `.gitignore`.** Ignore `*.class`, `.DS_Store`, `.idea/`, `.vscode/`, `out/`. No `.class` is
  tracked today, so this is purely preventive.
- [ ] **B3 — `Lab 3`–`Lab 5` READMEs** (Book search, abstract `Shape`, `Bank` accounts): the problem, the
  sample input to type, what it demonstrates (classes/constructors, abstract classes/polymorphism,
  inheritance).
- [ ] **B4 — `Lab 6`–`Lab 7` READMEs** (packages `cie`/`see`, custom exception `WrongAge`): exact compile
  command for the package layout, e.g. `javac -d out Main.java cie/*.java see/*.java`, then
  `java -cp out Main`.
- [ ] **B5 — `Lab 8`–`Lab 10` READMEs** (two threads, Swing integer-division GUI, deadlock demo +
  producer/consumer). Say plainly which ones never terminate by design (Lab 8, the Lab 10 deadlock demo,
  and `PCFixed`) and that Lab 9 needs a display.
- [ ] **B6 — README section on the root-level programs** if B1 left it as a bare table: sample
  input/output for each, produced by running them.

## Observations for VB to decide (do NOT change without an explicit instruction)

Verified on 2026-10-24 by compiling every file with the installed JDK. Only `Quadratic.java` fails.

1. **`Student.java` and `student.java` collide.** Two files whose names differ only in case, with
   near-identical content. A clone onto macOS (default) or Windows can only materialise one of them, so
   git will show one as modified/missing. Decide which to keep. Not touched.
2. **`Quadratic.java` does not compile.** Line 25 contains stray pasted text
   (`Zain Mahedi – 1WA23CS056`, a name and USN that are not the repo owner's) inside the code:
   `illegal character: '–'`. Separately, the distinct-roots formula adds/subtracts `Math.sqrt(D)`
   without dividing by `2a`, so the roots would be wrong for a ≠ ½ even once it compiles.
3. **`Prime.java` declares `class Max`** (copy of `Max.java`'s class name) and the loop starts at 2, so
   0 and 1 are reported as prime. File is gradable as submitted; recorded only.
4. **`Factorial.java`** prints "The factorial of 0 is 1" for negative input and then also prints
   "The factorial is 1". `int` overflows from 13!.
5. **Duplicates:** `Book.java` (root) vs `Lab 3/Book.java` differ slightly (extra block, no `sc.close()`);
   `ClassDemo.java`, `Book.java` both declare `class Main`.
6. **`Lab 9/Main.java`** has no `Main` class (the class is `IntegerDivisionApp`), and `Lab 4`, `Lab 8`
   and `Lab 10` define package-private `Main`/`PCFixed` entry points in differently named files; the
   README must give the right class name to `java`.
7. `Lab 6` `Main` creates an `Internals` object it never uses (already suppressed with
   `@SuppressWarnings("unused")`), and the "Internal Marks" it prints are actually the final marks.

## Log

2026-10-24 - audit - docs: add COMMIT_BACKLOG.md for OOPJ
