<!DOCTYPE html>
<html>

<head>
    <title>Form Dosen</title>
    <style>
        body {
            font-family: Arial;
            background: #eef2f3;
            padding: 20px;
        }

        .container {
            background: white;
            padding: 20px;
            border-radius: 12px;
            width: 600px;
            margin: auto;
        }

        input,
        select {
            width: 100%;
            padding: 10px;
            margin-bottom: 12px;
            border- radius: 6px;
            border: 1px solid #aaa;
        }

        button {
            padding: 10px 18px;
            background: #4A8FE7;
            color: white;
            border: none;
            border-radius: 6px;
        }
    </style>
</head>

<body>
    <div class="container">
        <h2><?= $data ? "Edit Lecturer" : "Add Lecturer" ?></h2>
        <form method="POST" action="index.php?action=save">
            <input type="hidden" name="dosen_id" value="<?= $data['dosen_id'] ?? '' ?>">
            <label>Name</label>
            <input type="text" name="nama" value="<?= $data['nama'] ?? '' ?>" required>
            <label>NIP</label>
            <input type="text" name="nip" value="<?= $data['nip'] ?? '' ?>">
            <label>NIDN</label>
            <input type="text" name="nidn" value="<?= $data['nidn'] ?? '' ?>">
            <label>Phone Number</label>
            <input type="text" name="nomor_ponsel" value="<?= $data['nomor_ponsel']
                ?? '' ?>">
            <label>Status</label>
            <select name="status">
                <option value="Aktif" <?= (isset($data) &&
                    $data['status'] == "Aktif") ? "selected" : "" ?>>Active</option>
                <option value="Nonaktif" <?= (isset($data) &&
                    $data['status'] == "Nonaktif") ? "selected" : "" ?>>Inactive
                </option>
            </select>
            <label>Program Code</label>
            <select name="kode_prodi">
                <option value="D4-TI">D4-TI</option>
                <option value="D4-SIB">D4-SIB</option>
                <option value="D3-MI">D3-MI</option>
            </select>
            <button>Save</button>
        </form>
    </div>

</body>

</html>