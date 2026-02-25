<!DOCTYPE html>
<html>
<head>
    <title>Form Input dengan Validasi (AJAX + Password)</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
<h1>Form Input dengan Validasi</h1>

<form id="myForm" method="post">
    <label for="nama">Nama:</label>
    <input type="text" id="nama" name="nama">
    <span id="nama-error" style="color:red;"></span><br>

    <label for="email">Email:</label>
    <input type="text" id="email" name="email">
    <span id="email-error" style="color:red;"></span><br>

    <label for="password">Password:</label>
    <input type="password" id="password" name="password">
    <span id="password-error" style="color:red;"></span><br>

    <input type="submit" value="Submit">
</form>

<div id="hasil"></div>

<script>
$(document).ready(function(){
    $("#myForm").submit(function(e){
        e.preventDefault();

        var nama = $("#nama").val();
        var email = $("#email").val();
        var password = $("#password").val();
        var valid = true;

        $("#nama-error").text("");
        $("#email-error").text("");
        $("#password-error").text("");

        if (nama === "") {
            $("#nama-error").text("Nama harus diisi.");
            valid = false;
        }

        if (email === "") {
            $("#email-error").text("Email harus diisi.");
            valid = false;
        } else if (!/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email)) {
            $("#email-error").text("Format email tidak valid.");
            valid = false;
        }

        if (password.length < 8) {
            $("#password-error").text("Password minimal 8 karakter.");
            valid = false;
        }

        if (valid) {
            $.ajax({
                url: "", // same file
                type: "POST",
                data: { ajax: true, nama: nama, email: email, password: password },
                success: function(response) {
                    $("#hasil").html(response);
                }
            });
        }
    });
});
</script>

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST" && isset($_POST['ajax'])) {
    $nama = $_POST['nama'];
    $email = $_POST['email'];
    $password = $_POST['password'];

    if (empty($nama)) {
        echo "Nama harus diisi.<br>";
    } elseif (empty($email)) {
        echo "Email harus diisi.<br>";
    } elseif (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
        echo "Format email tidak valid.<br>";
    } elseif (strlen($password) < 8) {
        echo "Password minimal 8 karakter.<br>";
    } else {
        echo "Data berhasil dikirim: Nama = $nama, Email = $email, Password valid.";
    }
    exit;
}
?>
</body>
</html>