#!/usr/bin/perl
use CGI ':standard';
$form = new CGI;
$FName = $form->param('FName');
$LName = $form->param('LName');
$strawberry = $form->param('Strawberry');
$vanilla = $form->param('Vanilla');
$chocolate = $form->param('Chocolate');
$mintchip = $form->param('MintChip');

if ($FName == "" or $LName == "") {
    print "First and Last Name are required.";
    exit 1;
}
$flavors = 0;
if ($strawberry == "on") $flavors++;
if ($vanilla == "on") $flavors++;
if ($chocolate == "on") $flavors++;
if ($mintchip == "on") $flavors++;

if ($flavors == ""){
    print "You must pick at least one flavor.";
    exit 1;
}
print "Thank You, "+$FName+" "$LName!;
$subtotal = $flavors * 1.25;
$total = $subtotal * 1.0925

printf("Your subtotal is: \$%.2f\n",$subtotal);
printf("Your final total is: \$%.2f\n",$total);
exit 0;
