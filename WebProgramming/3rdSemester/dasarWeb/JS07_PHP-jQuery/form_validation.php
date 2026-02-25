<!DOCTYPE html>
<html>
<head>
    <title>Form Input dengan Validasi</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
<h1>Form Input dengan Validasi</h1>

<form id="myForm" method="post" action="">
    <label for="nama">Nama:</label>
    <input type="text" id="nama" name="nama">
    <span id="nama-error" style="color: red;"></span><br>

    <label for="email">Email:</label>
    <input type="text" id="email" name="email">
    <span id="email-error" style="color: red;"></span><br>

    <input type="submit" value="Submit">
</form>

<div id="hasil"></div>

<script>
$(document).ready(function() {
    $("#myForm").submit(function(event) {
        event.preventDefault();

        var nama = $("#nama").val().trim();
        var email = $("#email").val().trim();
        var valid = true;

        $("#nama-error").text("");
        $("#email-error").text("");

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

        if (valid) {
            $.ajax({
                type: "POST",
                url: "",
                data: { nama: nama, email: email },
                success: function() {
                    $("#hasil").html("Data berhasil dikirim: Nama = " + nama + ", Email = " + email);
                }
            });
        }
    });
});
</script>

<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $nama = $_POST["nama"];
    $email = $_POST["email"];
    $errors = [];

    if (empty($nama)) {
        $errors[] = "Nama harus diisi.";
    }
    if (empty($email)) {
        $errors[] = "Email harus diisi.";
    } elseif (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
        $errors[] = "Format email tidak valid.";
    }

    if (!empty($errors)) {
        foreach ($errors as $error) {
            echo "<p style='color:red;'>$error</p>";
        }
    } else {
        echo "<p>Data berhasil dikirim: Nama = $nama, Email = $email</p>";
    }
}
?>
</body>
</html>