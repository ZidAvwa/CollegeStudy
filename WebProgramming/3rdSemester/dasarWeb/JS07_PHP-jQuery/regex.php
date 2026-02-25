<?php
// $pattern_alpha = '/[a-z]/';
// $text_alpha = 'This is a Sample Text.';
// if (preg_match($pattern_alpha, $text_alpha)) {
//     echo "Huruf kecil ditemukan!";
// } else {
//     echo "Tidak ada huruf kecil!";
// }

// $pattern_num = '/[0-9]+/';
// $text_num = 'There are 123 apples.';
// if (preg_match($pattern_num, $text_num, $matches)) {
//     echo "Cocokkan: " . $matches[0];
// } else {
//     echo "Tidak ada yang cocok!";
// }

// $pattern = '/apple/';
// $replacement = 'banana';
// $text = 'I like apple pie.';
// $new_text = preg_replace($pattern, $replacement, $text);
// echo $new_text;

// $pattern = '/go*d/'; 
// $text = 'god is good.';
// if (preg_match($pattern, $text, $matches)) {
//     echo "Cocokkan: " . $matches[0];
// } else {
//     echo "Tidak ada yang cocok!";
// }

// $pattern = '/go?d/';
// $text = 'god and good.';
// if (preg_match_all($pattern, $text, $matches)) {
//     echo "Cocokkan: " . implode(", ", $matches[0]);
// } else {
//     echo "Tidak ada yang cocok!";
// }

$pattern = '/go{1,2}d/';
$text = 'gd god good goood.';
if (preg_match_all($pattern, $text, $matches)) {
    echo "Cocokkan: " . implode(", ", $matches[0]);
} else {
    echo "Tidak ada yang cocok!";
}

?>