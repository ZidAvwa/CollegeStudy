<?php
$mathGrades = [
    "Alice" => 85,
    "Bob" => 92,
    "Charlie" => 78,
    "David" => 64,
    "Eva" => 90
];

$totalScore = 0;
$studentCount = 0;

foreach ($mathGrades as $grade) {
    $totalScore += $grade;
    $studentCount++;
}

$classAverage = $totalScore / $studentCount;

echo "Class Average: " . $classAverage . "<br><br>";
echo "Students with grades above the average:<br>";

foreach ($mathGrades as $name => $grade) {
    if ($grade > $classAverage) {
        echo $name . ": " . $grade . "<br>";
    }
}
?>