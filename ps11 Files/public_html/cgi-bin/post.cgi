#!/usr/bin/perl -wT
use CGI qw(:standard);

print header;
print start_html("Thank You");
print h2("Thank You");

my %form;
foreach my $p (param()) {
    $form{$p} = param($p);
    print "$p = $form{$p}<br>\n";
}
print end_html;
