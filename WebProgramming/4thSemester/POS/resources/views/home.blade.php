<!DOCTYPE html>
<html>
<head>
    <title>POS Dashboard</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container mt-5 text-center">
        <div class="card shadow p-5">
            <h1 class="display-4">Point of Sale System</h1>
            <p class="text-muted">Welcome to the main dashboard.</p>
            <hr>

            <h4 class="mb-3">Product Categories</h4>
            <div class="d-flex justify-content-center flex-wrap gap-2 mb-4">
                <a href="/category/food-beverage" class="btn btn-outline-primary">Food & Beverage</a>
                <a href="/category/beauty-health" class="btn btn-outline-danger">Beauty & Health</a>
                <a href="/category/home-care" class="btn btn-outline-success">Home Care</a>
                <a href="/category/baby-kid" class="btn btn-outline-warning">Baby & Kid</a>
            </div>

            <h4 class="mb-3">Other Modules</h4>
            <div class="d-flex justify-content-center gap-3">
                <a href="/sales" class="btn btn-dark">Transaction (Sales)</a>
                <a href="/user/18/name/Zid" class="btn btn-secondary">User Profile</a>
            </div>
        </div>
    </div>
</body>
</html>