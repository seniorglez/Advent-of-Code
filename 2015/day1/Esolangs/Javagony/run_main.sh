#!/bin/bash
javac Main.java
java Main '('
java Main '(())' 
java Main '()()'
java Main '(((' 
java Main '(()(()('
java Main '))((((('
java Main '())'
java Main '))('
java Main ')))'
java Main ')())())'
rm Main.class