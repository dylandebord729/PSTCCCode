#!/usr/bin/perl
use CGI ':standard';

print header;
print start_html("Environment");

foreach my $key (sort(keys(%ENV))) {
    print "$key = $ENV{$key}<br>\n";
}

print end_html;
