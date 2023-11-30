#!/usr/bin/perl

$string = "Cats go Catatonic\nWhen given Catnip";

#match from the beginning of the string (\A) then
#0 or more chars that come after that (optionally) then a space
($start) = ($string =~ /\A(.*?) /);

#match from the beginning of the line any characters any number of times (optionally) then a space. 
#(g) means globally find all matches
#(m) specifies that if the string has newline or carriage return characters, 
#the ^ and $ operators will now match against a newline boundary, instead of a string boundary 

@lines = $string =~ /^(.*?) /gm;

print "First word: $start\n","Line starts: @lines\n";
