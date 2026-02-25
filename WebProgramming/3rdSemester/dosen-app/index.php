<?php
require_once __DIR__ . '/controllers/DosenController.php';
$controller = new DosenController();
$action = $_GET['action'] ?? 'index';
switch ($action) {
    case 'form':
        $controller->form($_GET['id'] ?? null);
        break;
    case 'save':
        $controller->save();
        break;
    case 'delete':
        $controller->delete($_GET['id']);
        break;
    default:
        $controller->index();
}