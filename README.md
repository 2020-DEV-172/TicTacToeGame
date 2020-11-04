# TicTacToe Game
![Image of TicTacToe](https://upload.wikimedia.org/wikipedia/commons/thumb/3/32/Tic_tac_toe.svg/200px-Tic_tac_toe.svg.png)

Tic-tac-toe, Xs and Os or CROSS and NOUGHTS is a game for two players, X and O, who take turns marking the spaces in a 3X3 matrix as depicted below. 
The player who places three of their marks in a horizontal, vertical, or diagonal row [either from top right to bottom left or top left to bottom right ] is the winner. 
Game result will be declared as 'Draw' when all of the positions in game board are marked.
```
1 2 3
4 5 6
7 8 9
```
# Rules 
```
The rules are described below :
1) X always goes first.
2) Players cannot play on an already filled position.
3) Players take alternate turns to place X’s and O’s on the board until either player wins.
4) If a player is able to draw three X’s or three O’s in a horizontal, vertical or diagonal sequence, that player wins.
5) If all nine squares are filled and neither player has three in a sequence, the game is a draw.
```

# Prerequisites
To run this program below softwares needs to be installed
```
Java - Version 1.7 or above
JRE compliance - 1.7 or above
Maven - For Dependency management
JUnit - Version 4.12 (added dependency in pom.xml)
Eclipse\Intellij - Any IDE which supports Java
```

# Passing input values - Guidelines
```
1) Your inputs should be in the format of digit. for eg: 1 or 6 .
2) Your inputs should be in the range of 1 to 9 i.e 1 or 4 or 7 or 8.
3) Your inputs should contain only one digit. for eg: 1 .
4) Please do not enter already played position again.
5) Some Invalid inputs examples for your reference -1,qwert,98,-23 .
6) The input position should be read as digits (1-9)
Digit 1 is considered as position in 1st row and 1st column which is equivalent to (0,0)
Digit 2 is considered as position in 1st row and 2nd column which is equivalent to (0,1)
Digit 3 is considered as position in 1st row and 3rd column which is equivalent to (0,2)
Digit 4 is considered as position in 2nd row and 1st column which is equivalent to (1,0)
Digit 5 is considered as position in 2nd row and 2nd column which is equivalent to (1,1)
Digit 6 is considered as position in 2nd row and 3rd column which is equivalent to (1,2)
Digit 7 is considered as position in 3rd row and 1st column which is equivalent to (2,0)
Digit 8 is considered as position in 3rd row and 2nd column which is equivalent to (2,1)
Digit 9 is considered as position in 3rd row and 3rd column which is equivalent to (2,2)

Tic-tac-toe

Board and Position mapping

  Board      Position
O | X | O     1 | 2 | 3
X | O | X  => 4 | 5 | 6
X | O | X     7 | 8 | 9
```
# Set up application in Intellij IDE
```
1) Download project as zip file and unzip the same to a folder. 
2) In Intellij IDE,  Go to the below path
   File -> New -> Project from Existing Sources -> Next -> 
   Browse extracted folder and OK ->Import Project from External model -> Maven
3) IDE will import your maven project 
```

# Run application in Intellij IDE
```
1. Navigate and open the class src/main/java/com/bnpp/kata/GameStarter.java
2. Go to Run -> Run -> GameStarter or right click on the GameStarter.java and select "Run GameStarter.main()"
```

# Run application in command prompt
```
1. Open the command prompt / terminal from project directory
2. Execute the command "mvn clean install". 
3. After successful maven build, goto <ProjectDirectory>\target\classes
4. Execute the command "java -classpath .\ com.bnpp.kata.GameStarter" 
5. Please enter a digit from 1 to 9 for position value as depicted below
	7 [in words : Seven]

Please provide the position value until the game ends!!
```

# Run Test cases
```
1) Navigate to src/test/java/com/bnpp/kata/GameSuite.java in IDE. 
2) Go to Run -> Run -> GameSuite or right click on the GameSuite.java and select "Run GameSuite"
```
# Jacoco code coverage Report using JaCoCo Maven plugin
```
1. Open the command prompt / terminal from project directory
2. Run 'mvn clean package' the JaCoCo code coverage report will be generated at target/site/jacoco/*
3. Open the target/site/jacoco/index.html file, review the code coverage report
```

# Mutation code coverage Report using PIT Test Maven plugin
```
1. Open the command prompt / terminal from project directory
2. Run 'mvn clean test', the Mutation code coverage report will be generated at target/pit-reports/YYYYMMDDHHMI/*
4. Open the target/pit-reports/yyyyMMddHHmm/index.html file, review the mutation coverage report
```
