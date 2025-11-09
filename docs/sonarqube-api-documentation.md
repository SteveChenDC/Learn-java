# SonarQube API & Usage Guide

## Overview

This repository aggregates several small Java console and Swing exercises. Each sub-project is self-contained and exposes one or more public entry points (`main` methods) and, in a few cases, additional public methods you can call from other code. This guide documents every public API surface that currently exists, illustrates how to run or invoke it, and explains how to analyse the code with SonarQube so you can monitor quality over time.

## Repository Layout

- `beersong` – classic “99 Bottles of Beer” console loop
- `chap03` – `Dog` examples from *Head First Java*
- `Dog` – duplicate `Dog` example separated for convenience
- `FirstGUI` – Swing-based button demo
- `gettersetter_electric_guitar_example` – simple POJO with accessors (package-private visibility)
- `GuessingGame` – multiplayer number guessing game
- `PhraseOMatic` – random marketing phrase generator
- `quickdip` – loop exercises (1b/1c)
- `scrap_hobbit` – array iteration exercise

> **Tip**  
> Projects that declare no package (e.g. `Dog`, `GuessingGame`, `PhraseOMatic`) must be compiled and run from their individual source roots, because default-package classes cannot be mixed across modules.

## Module APIs and Examples

### beersong

#### Class `beersong.BeerSong`

| Member Type | Signature | Description |
|-------------|-----------|-------------|
| Method | `public static void main(String[] args)` | Prints the verses of the “99 Bottles of Beer” song. Entry point for the module. |

**Usage**

```bash
cd beersong
javac -d out src/beersong/BeerSong.java
java -cp out beersong.BeerSong
```

You can adjust the starting bottle count by editing `beerNum` before compiling.

### chap03 (`Dog` example)

#### Class `Dog`

| Member Type | Signature | Description |
|-------------|-----------|-------------|
| Method | `public static void main(String[] args)` | Demonstrates creating `Dog` instances, assigning names, and invoking behaviors. |
| Method | `public void bark()` | Prints `<name> says Ruff!`. Requires `name` to be set before invocation. |
| Method | `public void eat()` | Placeholder for feeding logic (currently empty). |
| Method | `public void chaseCat()` | Placeholder for chase logic (currently empty). |

**Usage**

```bash
cd chap03
javac -d out src/Dog.java
java -cp out Dog
```

To reuse the class elsewhere, set the `name` field (`myDog.name = "Fido";`) before calling `bark()`.

### Dog (standalone copy)

This module duplicates the `Dog` class described above. The public API is identical, but source lives in `Dog/src/Dog.java`. Build and run commands mirror the previous example with the adjusted path.

### FirstGUI

#### Class `SimpleGui1`

| Member Type | Signature | Description |
|-------------|-----------|-------------|
| Method | `public static void main(String[] args)` | Launches a `JFrame` with a single “click me” button. Demonstrates basic Swing setup. |

**Usage**

```bash
cd FirstGUI
javac -d out src/SimpleGui1.java
java -cp out SimpleGui1
```

Ensure you run this on a system with a graphical environment, otherwise the frame cannot display.

### gettersetter_electric_guitar_example

#### Class `ElectricGuitar`

| Member Type | Signature | Description |
|-------------|-----------|-------------|
| Field | `public class ElectricGuitar` | The class itself is public, but all accessor methods currently have package-private visibility (`getBrand()`, `setBrand()`, `getNumOfPickups()`, `setNumOfPickups(int)`, `getRockStarUsesIt()`, `setRockStarUsesIt(boolean)`). |

**Usage**

Because the accessor methods lack the `public` modifier, they are only callable from within the same package. To expose them as part of the public API, add `public` to each method signature. After doing so, you could interact with the guitar object as follows:

```java
ElectricGuitar guitar = new ElectricGuitar();
guitar.setBrand("Fender");
guitar.setNumOfPickups(3);
guitar.setRockStarUsesIt(true);
```

### GuessingGame

#### Class `GameLauncher`

| Member Type | Signature | Description |
|-------------|-----------|-------------|
| Method | `public static void main(String[] args)` | Creates a `GuessGame` and starts the interactive loop. |

#### Class `GuessGame`

| Member Type | Signature | Description |
|-------------|-----------|-------------|
| Method | `public void startGame()` | Sets up three `Player` instances, generates a random target (0–9), and loops until a player guesses correctly, reporting the results to stdout. |

#### Class `Player`

| Member Type | Signature | Description |
|-------------|-----------|-------------|
| Method | `public void guess()` | Assigns a random guess (0–9) to the `number` field and prints the attempt. |

**Usage**

```bash
cd GuessingGame
javac -d out src/*.java
java -cp out GameLauncher
```

To embed the logic in another application, call `new GuessGame().startGame();` from your own code. If you want deterministic behavior for testing, replace `Math.random()` with a seeded `Random`.

### PhraseOMatic

#### Class `PhraseOMatic`

| Member Type | Signature | Description |
|-------------|-----------|-------------|
| Method | `public static void main(String[] args)` | Generates and prints a random three-part marketing phrase assembled from predefined word lists. |

**Usage**

```bash
cd PhraseOMatic
javac -d out src/PhraseOMatic.java
java -cp out PhraseOMatic
```

Modify the word lists to tailor the generated phrases for your domain.

### quickdip

#### Class `quickdip.Execise1b`

| Member Type | Signature | Description |
|-------------|-----------|-------------|
| Method | `public static void main(String[] args)` | Increments `x` until it equals 10, printing “big x” whenever `x > 3`. |

#### Class `quickdip.ExerciseB`

| Member Type | Signature | Description |
|-------------|-----------|-------------|
| Method | `public static void main(String[] args)` | Decrements `x` from 5, printing “small x” while `x < 3`. |

> The `quickdip.ExerciseC` source defines a package-private class (`Exercise1b`) and therefore contributes no additional public API.

**Usage**

```bash
cd quickdip
javac -d out src/quickdip/Execise1b.java src/quickdip/ExerciseB.java
java -cp out quickdip.Execise1b
java -cp out quickdip.ExerciseB
```

### scrap_hobbit

#### Class `Hobbits`

| Member Type | Signature | Description |
|-------------|-----------|-------------|
| Method | `public static void main(String[] args)` | Instantiates an array of three `Hobbits`, assigns canonical names, and prints them. |

**Usage**

```bash
cd scrap_hobbit
javac -d out src/Hobbits.java
java -cp out Hobbits
```

You can extend the array or adjust the naming logic to explore loops and conditionals.

## SonarQube Usage

### Prerequisites

- Java 8+ (the examples compile under modern JDKs)
- SonarQube server (local Docker container or hosted instance)
- `sonar-scanner` CLI, or an alternative build-integrated scanner (e.g. Gradle, Maven)
- A SonarQube authentication token with analysis privileges

### Project Properties

Create `/workspace/sonar-project.properties` (or another suitable location) with the following baseline configuration:

```properties
sonar.projectKey=java-samples
sonar.projectName=Java Samples
sonar.projectVersion=1.0

# Comma-separated list of source roots
sonar.sources=beersong/src,chap03/src,Dog/src,FirstGUI/src,gettersetter_electric_guitar_example/src,GuessingGame/src,PhraseOMatic/src,quickdip/src,scrap_hobbit/src

# Class files improve Java rule coverage; adjust paths to match your build output
sonar.java.binaries=beersong/bin,chap03/out/production/chap03,FirstGUI/out/production/FirstGUI,PhraseOMatic/bin,scrap_hobbit/out/production/scrap_hobbit

# Exclude generated binary folders from being treated as sources
sonar.exclusions=**/out/**,**/bin/**
```

If you compile sources into a unified directory (for example `build/classes`), update `sonar.java.binaries` to point there instead. SonarQube can analyse Java without binaries, but providing them unlocks far richer rule checks (e.g. precise type resolution).

### Running an Analysis

1. Acquire an authentication token from **My Account → Security** in SonarQube.
2. From the repository root, run:

   ```bash
   sonar-scanner \
     -Dsonar.login=<your-token> \
     -Dsonar.host.url=http://localhost:9000
   ```

3. Watch the scanner output for success, then open the SonarQube UI to review issues, code smells, and duplications.

### Interpreting Results

- **Duplicate Code** – SonarQube will highlight the duplicate `Dog` implementations. Decide whether to consolidate or intentionally keep both with documentation.
- **Visibility Suggestions** – Expect warnings about package-private fields/methods (e.g. in `ElectricGuitar`). Promote them to `public` or restrict class access as appropriate.
- **Empty Methods** – Placeholders like `Dog.eat()` may be flagged as empty. Add implementations or comments (`// TODO`) if intentional.

### Extending Quality Gates

- Configure a Quality Gate that fails the build if new code introduces critical issues.
- Add coverage requirements when you introduce tests (e.g. via JUnit).
- Use SonarQube branches/pull requests features to validate changes before merging.

## Next Steps

- Expand documentation as you add new classes or make private members public.
- Automate compilation (e.g. simple Gradle build) to unify binary output for the scanner.
- Wire the `sonar-scanner` command into CI so analyses run on every push.
