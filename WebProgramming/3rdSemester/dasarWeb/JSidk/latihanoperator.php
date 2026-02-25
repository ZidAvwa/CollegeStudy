<?php
$total_seats = 45;
$occupied_seats = 28;

$empty_seats = $total_seats - $occupied_seats;
$percentage_empty = ($empty_seats / $total_seats) * 100;

echo "Percentage of empty seats: " . round($percentage_empty, 2) . "%";
?>