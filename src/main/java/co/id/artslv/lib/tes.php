<?php
include 'ende.php';
$value = "example";
$key = "Rtsn92015endEK41"; //16 Character Key
echo Ende::encrypt($value, $key);
echo Ende::decrypt(Ende::encrypt($value, $key), $key);
?>