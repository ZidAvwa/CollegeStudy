<!DOCTYPE html>
<html>
<head>
    <title>User Profile</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container mt-5">
        <div class="card mx-auto shadow-sm" style="max-width: 400px;">
            <div class="card-header bg-dark text-white text-center">User Profile</div>
            <div class="card-body">
                <p><strong>ID:</strong> {{ $id }}</p>
                <p><strong>Name:</strong> {{ $name }}</p>
            </div>
            <div class="card-footer text-center">
                <a href="/" class="btn btn-sm btn-outline-secondary">Back to Dashboard</a>
            </div>
        </div>
    </div>
</body>
</html>