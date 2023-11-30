#!/usr/bin/perl
foreach $word (@ARGV){
	$word = lc($word);
	$counts{$word} = 0;
}


foreach $line (<STDIN>) {
	print $line;
	chomp($line);
	@wordlist = split(' ', $line);
	foreach $testword (@wordlist){
		$testword =~ s/[^a-zA-Z0-9]//g;
		$testword = lc($testword);
		if(exists($counts{$testword})){
			$counts{$testword}++;
		}
	}
}
@keys = keys(%counts);
foreach $key (@keys) {
print $key . ": " . $counts{$key} . "\n";
}
