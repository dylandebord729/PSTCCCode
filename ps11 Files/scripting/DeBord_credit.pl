#!/usr/bin/perl
print "Please enter a credit card number: "; chomp($ccnum = <>); 
$Orig = $ccnum;
@ccdigits = split('-', $ccnum); 
$ccnum = join("",@ccdigits);
@ccdigits = split(' ', $ccnum);  
$ccnum = join("",@ccdigits); 
if ($ccnum =~ /^\d{16}$/){
print substr($ccnum,0,4) . "\n";
print substr($ccnum,4,4) . "\n";
print substr($ccnum,8,4) . "\n";
print substr($ccnum,12,4) . "\n";
} else {
print "Invalid CC Number: $Orig\n";
}
