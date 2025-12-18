# 🎮 Tic-Tac-Toe CLI (Java + Maven)

A **classic Tic-Tac-Toe game** written in **Java** and built with **Maven**.

Two players (X vs O) take turns on a 3x3 console grid. Detects wins, draws, and invalid moves.

This project is ideal for:
- Practicing **game logic** and **win detection**
- Learning **console UI design**
- Understanding **Maven project structure**
- Building **fun CLI games**

---

## ✨ Features

- **Clean 3x3 ASCII board** display
- **Full win detection**: rows, columns, diagonals
- **Draw detection** when board is full
- **Input validation** (1-9 positions only)
- **Turn alternation** (X starts)
- **Replay option** after each game
- **Professional game flow**

---

## 🛠️ Tech Stack

- **Java** (JDK 21+ recommended, tested with JDK 25)
- **Maven** (3.8+)
- **JUnit 5** (6 comprehensive tests)

---

## 📋 Requirements

- Java JDK installed and on `PATH`
- Maven installed (`mvn -v` should work)

---

## 📁 Project Structure

```
tic-tac-toe-cli/
├── pom.xml
├── README.md
├── .gitignore
├── src/
│ ├── main/
│ │ └── java/
│ │ └── com/games/
│ │ ├── TicTacToeApp.java
│ │ ├── Board.java
│ │ └── Player.java
│ └── test/
│ └── java/
│ └── com/games/
│ └── BoardTest.java
└── target/
```

---

## 📦 Building and Running

### 1️⃣ Build & Test

```
mvn clean compile test package
```

### 2️⃣ Run the game

```
java -jar target/tic-tac-toe-cli-1.0-SNAPSHOT.jar
```

### 3️⃣ Gameplay example

```
[TIC-TAC-TOE] Console Edition
New game started! X goes first.

| |
_ | _ | _
| |
_ | X | _
| |
_ | _ | _

X player, enter position (1-9): 5
```


**Positions (1-9):**

```
1 | 2 | 3
--+---+--
4 | 5 | 6
--+---+--
7 | 8 | 9
```

---

## 🧪 Tests (6/6 Pass)

```
mvn test
```

Tests run: 6, Failures: 0, Errors: 0 ✓

- Win detection (rows/columns/diagonals)
- Draw scenarios
- Invalid moves
- Early game states

---

## 📝 Notes

- **X always starts** (standard rule)
- Enter **1-9** for positions (top-left = 1)
- Game detects wins **immediately** after 3rd mark in a line
- **Draw** when board fills with no winner

---

## 📄 License

MIT License

Copyright (c) 2025 Daniel Pierre Fachini de Toledo

Permission is hereby granted, free of charge, to any person obtaining a copy  
of this software and associated documentation files (the "Software"), to deal  
in the Software without restriction, including without limitation the rights  
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell  
copies of the Software, and to permit persons to whom the Software is  
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all  
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR  
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,  
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE  
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER  
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,  
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE  
SOFTWARE.

---

## 🚀 Future Improvements (Ideas)

- **AI opponent** (unbeatable minimax algorithm)
- **Save/load games** to file
- **Multiple board sizes** (4x4, 5x5)
- **Colorful ANSI board** (terminal effects)
- **Score tracking** across sessions

---

## 👤 Author

**Daniel Pierre Fachini de Toledo**  
GitHub: https://github.com/akaPierre