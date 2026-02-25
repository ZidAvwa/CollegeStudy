<?php
$input = isset($_POST['input']) ? $_POST['input'] : '';
if (filter_var($input, FILTER_VALIDATE_EMAIL)) {
    echo htmlspecialchars($input, ENT_QUOTES, 'UTF-8');
} else {
    echo "Input tidak valid";
}
?>