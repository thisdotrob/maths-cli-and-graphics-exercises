Graphics & CLI exercises (CS106A Assignment 2)
===
Background
---
This repo forms part of my solutions to the assignments and challenges given to students on Stanford's CS106A Programming Methodology class. I am not a Stanford student but was able to follow the course online using the publicly available resources (see below). For anyone looking to start programming I would thoroughly recommend it as a first step.

Resources
---
- Course handouts including this assignment: http://web.stanford.edu/class/archive/cs/cs106a/cs106a.1152/handouts/index.html
- Assignment starter files: http://web.stanford.edu/class/archive/cs/cs106a/cs106a.1152/assignments/index.html
- Lecture recordings: https://www.youtube.com/view_play_list?p=84A56BC7F4A1F852

Setup
---
To run the program you will need to be on either Mac (OSX 10.6+) or Windows (7+).
#### Windows: ####
0. Install the latest JRE: http://web.stanford.edu/class/cs106a/software/jdk-8u45-windows-i586.exe
0. Install Stanford's customised Eclipse IDE: http://web.stanford.edu/class/cs106a/software/eclipse-windows.zip

#### Mac: ####
0. Download and install the Java SDK manager: http://web.stanford.edu/class/cs106a/software/jdk-8u45-macosx-x64.dmg
0. Download and install Stanford's customised Eclipse IDE: http://web.stanford.edu/class/cs106a/software/eclipse-mac.zip

Running the exercises
---
0. Clone this repo and import it into Eclipse's workspace
0. Hit the run button (running man) and choose which exercise to run

Assignment:
---
The following problems have been taken from this CS106A handout: http://web.stanford.edu/class/archive/cs/cs106a/cs106a.1152/handouts/13-assignment-2.pdf

#### Problem 1 ####
Write a GraphicsProgram subclass that draws a pyramid consisting of bricks
arranged in horizontal rows, so that the number of bricks in each row decreases by
one as you move up the pyramid, as shown in the following sample run:

![problem 1 img](http://i.imgur.com/gKeJe7R.png)

The pyramid should be centered at the bottom of the window and should use
constants for the following parameters:

- BRICK_WIDTH: The width of each brick (30 pixels)
- BRICK_HEIGHT: The height of each brick (12 pixels)
- BRICKS_IN_BASE: The number of bricks in the base (14)

The numbers in parentheses show the values for this diagram, but you must be able
to change those values in your program.


#### Problem 2 ####
Suppose that you’ve been hired to produce a program that draws an image of an
archery target—or, if you prefer commercial applications, a logo for a national
department store chain—that looks like this:

![problem 2 img](http://i.imgur.com/nm6utin.png)

This figure is simply three GOval objects, two red and one white, drawn in the correct
order. The outer circle should have a radius of one inch (72 pixels), the white circle
has a radius of 0.65 inches, and the inner red circle has a radius of 0.3 inches. The
figure should be centered in the window of a GraphicsProgram subclass.

#### Problem 3 ####
As an expression of your fondness for CS106A, you should write a
GraphicsProgram called CS106ATiles that display four tiles (rectangles), each
containing the text “CS106A” in the center of the graphics window, as shown below:

![problem 3 img](http://i.imgur.com/X7Qs2uz.png)

- The width and height of each of the four tiles (rectangles) should be specified as
named constants TILE_WIDTH and TILE_HEIGHT, respectively, so that they are
easy to change. You should determine reasonable values for these constants to
make your picture look similar (but, it need not be exact) to the figure above.
- The text/label “CS106A” should be centered in each of the respective four tiles.
You can find the width of a label by calling label.getWidth() and the height it
extends above the baseline by calling label.getAscent(). If you want to center
a label, you need to shift its origin by half of these distances in each direction.
- The amount of space (in pixels) between each of the four tiles is specified by the
constant TILE_SPACE (which is provided in the starter file). This constant should
be used both for the horizontal space between tiles and the vertical space between
tiles.
- The entire figure (of four tiles) should be centered in the graphics window.

#### Problem 4 ####
In high-school geometry, you learned the Pythagorean theorem for the relationship
of the lengths of the three sides of a right triangle:

![problem 4 img a](http://i.imgur.com/lVO6fgh.png)

which can alternatively be written as:

![problem 4 img b](http://i.imgur.com/kByV0gR.png)

Most of this expression contains simple operators covered in Chapter 3. The one
piece that’s missing is taking square roots, which you can do by calling the standard
function Math.sqrt. For example, the statement
```
double y = Math.sqrt(x);
```
sets y to the square root of x.

Write a ConsoleProgram that accepts values for a and b as doubles (you can
assume that a and b will be positive) and then calculates the solution of c as a
double. Your program should be able to duplicate the following sample run:

![problem 4 image c](http://i.imgur.com/rzQD5Iv.png)

#### Problem 5 ####
Write a ConsoleProgram that reads in a list of integers, one per line, until a sentinel
value of 0 (which you should be able to change easily to some other value). When
the sentinel is read, your program should display the smallest and largest values in the
list, as illustrated in this sample run:

![problem 5 img](http://i.imgur.com/s6kINBK.png)

Your program should handle the following special cases:
- If the user enters only one value before the sentinel, the program should report
that value as both the largest and smallest.
- If the user enters the sentinel on the very first input line, then no values have been
entered, and your program should display a message to that effect.

#### Problem 6 ####
Douglas Hofstadter’s Pulitzer-prize-winning book Gödel, Escher, Bach contains
many interesting mathematical puzzles, many of which can be expressed in the form
of computer programs. In Chapter XII, Hofstadter mentions a wonderful problem
that is well within the scope of the control statements from Chapter 4. The problem
can be expressed as follows:

0. Pick some positive integer and call it n.
0. If n is even, divide it by two.
0. If n is odd, multiply it by three and add one.
0. Continue this process until n is equal to one.

On page 401 of the Vintage edition, Hofstadter illustrates this process with the following example, starting with the number 15:

15 is odd, so I make 3n+1: 46
46 is even, so I take half: 23
23 is odd, so I make 3n+1: 70
70 is even, so I take half: 35
35 is odd, so I make 3n+1: 106
106 is even, so I take half: 53
53 is odd, so I make 3n+1: 160
160 is even, so I take half: 80
80 is even, so I take half: 40
40 is even, so I take half: 20
20 is even, so I take half: 10
10 is even, so I take half: 5
5 is odd, so I make 3n+1: 16
16 is even, so I take half: 8
8 is even, so I take half: 4
4 is even, so I take half: 2
2 is even, so I take half: 1

As you can see from this example, the numbers go up and down, but eventually—at
least for all numbers that have ever been tried—comes down to end in 1. In some
respects, this process is reminiscent of the formation of hailstones, which get carried
upward by the winds over and over again before they finally descend to the ground.
Because of this analogy, this sequence of numbers is usually called the Hailstone
sequence, although it goes by many other names as well.

Write a ConsoleProgram that reads in a number from the user and then displays the
Hailstone sequence for that number, just as in Hofstadter’s book, followed by a line
showing the number of steps taken to reach 1. For example, your program should be
able to produce a sample run that looks like this:

![problem 6 img](http://i.imgur.com/sFJKxwt.png)

The fascinating thing about this problem is that no one has yet been able to prove that
it always stops. The number of steps in the process can certainly get very large. How
many steps, for example, does your program take when n is 27?
