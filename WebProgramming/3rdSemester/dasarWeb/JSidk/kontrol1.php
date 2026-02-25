<?php
$grades = [85, 92, 78, 64, 90, 75, 88, 79, 70, 96];

sort($grades);

$filtered_grades = array_slice($grades, 2, count($grades) - 4);
$total = array_sum($filtered_grades);

echo "Total grades after ignoring the two highest and two lowest: $total";
?>