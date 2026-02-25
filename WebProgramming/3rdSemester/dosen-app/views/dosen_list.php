<!DOCTYPE html>
<html>

<head>
    <title>Data Dosen</title>
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
            width: 900px;
            margin: auto;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 15px;
        }

        th {
            background: #4A8FE7;
            color: white;
            padding: 10px;
        }

        td {
            padding: 8px;
            border-bottom: 1px solid #ccc;
        }

        a.btn {
            padding: 6px 14px;
            text-decoration: none;
            border-radius: 6px;
            color: white;
        }

        .btn-edit {
            background: #f0ad4e;
        }

        .btn-del {
            background: #d9534f;
        }

        .btn-add {
            background: #5cb85c;
            padding: 10px 16px;
            display: inline-block;
            margin-bottom: 10px;
        }
    </style>
</head>

<body>
    <div class="container">
        <h2>Lecturer Data Management</h2>
        <a href="index.php?action=form" class="btn btn-add"> Add Lecturer</a>
        <table>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>NIP</th>
                <th>NIDN</th>
                <th>Phone</th>
                <th>Status</th>
                <th>Program</th>
                <th>Actions</th>
            </tr>
            <?php foreach ($dosen as $d): ?>
                <tr>
                    <td><?= $d['dosen_id'] ?></td>
                    <td><?= $d['nama'] ?></td>
                    <td><?= $d['nip'] ?></td>
                    <td><?= $d['nidn'] ?></td>
                    <td><?= $d['nomor_ponsel'] ?></td>
                    <td><?= $d['status'] ?></td>
                    <td><?= $d['kode_prodi'] ?></td>
                    <td>
                        <a class="btn btn-edit" href="index.php?action=form&id=<?= $d['dosen_id'] ?>">Edit</a>
                        <a class="btn btn-del" href="index.php?action=delete&id=<?= $d['dosen_id'] ?>" onclick="return confirm('Delete?')">Delete</a>
                    </td>
                </tr>
            <?php endforeach; ?>
        </table>
    </div>
</body>

</html>