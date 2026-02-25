<!DOCTYPE html>
<html>
<head>
    <title>Contoh Form dengan PHP dan jQuery</title>
    <script src="C:\laragon\www\FirstWeb\jqueryprac\jquery-ui-1.14.1.custom\jquery-ui.min.js"></script>
</head>
<body>
    <h2>Form Contoh</h2>
    <form id="myform">
        <label>Pilih Buah:</label><br>
        <select name="buah">
            <option value="apel">Apel</option>
            <option value="pisang">Pisang</option>
            <option value="mangga">Mangga</option>
            <option value="jeruk">Jeruk</option>
        </select>
        <br><br>

        <label>Pilih Warna Favorit:</label><br>
        <input type="checkbox" name="warna[]" value="merah"> Merah<br>
        <input type="checkbox" name="warna[]" value="biru"> Biru<br>
        <input type="checkbox" name="warna[]" value="hijau"> Hijau<br>
        <br>

        <label>Pilih Jenis Kelamin:</label><br>
        <input type="radio" name="jenis_kelamin" value="laki-laki"> Laki-laki<br>
        <input type="radio" name="jenis_kelamin" value="perempuan"> Perempuan<br>
        <br>

        <input type="submit" value="Submit">
    </form>

    <div id="hasil"></div>

    <script>
        $(document).ready(function () {
            $("#myform").submit(function (e) {
                e.preventDefault();

                var formData = $("#myform").serialize();

                $.ajax({
                    url: 'process_lanjut.php',
                    type: 'POST',
                    data: formData,
                    success: function (response) {
                        $("#hasil").html(response);
                    }
                });
            });
        });
    </script>
</body>
</html>