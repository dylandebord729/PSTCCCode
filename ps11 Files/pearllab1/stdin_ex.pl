#!/usr/bin/perl

#for loop example using stdin
foreach $line(<>) {
	chomp($line); #remove \n from input
	print "$line\n";
}
