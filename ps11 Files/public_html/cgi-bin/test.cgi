#!/usr/bin/perl
use CGI ':standard';
$form = new CGI;
print $form->header;
$form->start_html('cgi script test page');
print "This is printed by a cgi script!";
$form->end_html();
exit 0;
