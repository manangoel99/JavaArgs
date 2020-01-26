JavaArgs
==================================
Manan Goel 
20171102

----------------------------------
Overview
========================
- The repository contains a JAVA program to parse command line arguments.
- The program provides an interface to users to provide and parse a schema for command line arguments and corresponding flags
- Use the ```ArgsMain.java``` file to specify the command line flags for each kind of argument.
- The following are the flags for each kind of variable
    - -f : Boolean
    - -h : Help
    - -d : Map
    - -p : String Arrags
    - -s : String
    - -a : Double
    - -n : Integer
- The repository also contains Unit Tests for each kind of argument. 
-----------------------
Pre-requisites and Installation Instructions
=============
The major pre-requisite is JAVA and JUnit for unit testing. Run the following commands : 
- Installing Java
    ```
    sudo apt update
    sudo apt-get install default-jre
    sudo apt install default-jdk
    ```
- Setting up the repository
    ```
    sudo apt install ant
    sudo apt install git
    git clone https://github.com/manangoel99/JavaArgs.git
    ```
The commands mentioned above will set up all the packages required for running the code.

------------
How To Run
===================
Once the repository is downloaded, run the following commands to compile and build
```
ant compile
ant jar
```
Run the following command to see the help documentation
```
java -cp build/jar/args.jar com.cleancoder.args.ArgsMain -h
```
Sample Command
```
java -cp build/jar/args.jar com.cleancoder.args.ArgsMain -n 5 -f -d key1:val1,key2:val2 -a 4.32
```

---------------
Test Instructions
===================
To run the tests
```
java -cp "lib/junit-4.13.jar:lib/hamcrest-core-1.3.jar:build/jar/args.jar" test/com/cleancoder/args/ArgsTest.java
```
To test the exceptions
```
java -cp "lib/junit-4.13.jar:lib/hamcrest-core-1.3.jar:build/jar/args.jar" test/com/cleancoder/args/ArgsExceptionTest.java
```

------------------
Principles of Clean Code
========================
- Vertical Formatting
    - Vertical Density : I have made sure that closely related lines of code occur closer to each other vertically.
    - Variables are declared as close as possible to their usage.
    - Vertical Ordering : Most of the function call dependencies are in the downward direction
- Horizontal Formatting
    - Horizontal Alignment : I have tried to keep as few vertical lines of reading as possible.
    - Indentation : All indents are according to the control structure in the code
- Nomenclature
    - Functions have noun/verb names which  reflect their purpose making them self-explanatory
    - Variables have noun names to make sure the person reading the code knows what it is used for.
- The code also follows the Google JAVA style guide standards of code.
- There is also JavaDocs for the repository. To check, use google-chrome or firefox
    ```
    firefox docs/index.html
    ```
    or
    ```
    google-chrome-stable docs/index.html
    ```
- The linting of the code was also checked using ```uncrustify```.

-------------------
Changes to Initial Code
======================
- The major change I made to the code given by the TAs was to add more kinds of arguments to the schema.
- Another change I made was about handling extra arguments. Initially when the user gave extra command arguments along the command line without a flag, the argument was ignored. However, I changed that scenario to raising an exception in this case.
