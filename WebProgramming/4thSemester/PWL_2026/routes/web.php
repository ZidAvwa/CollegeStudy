<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\WelcomeController;
use App\Http\Controllers\PageController;
use App\Http\Controllers\PhotoController;

Route::resource('photos', PhotoController::class)->only([
    'index', 'show'
]);

Route::resource('photos', PhotoController::class)->except([
    'create', 'store', 'update', 'destroy'
]);


Route::get('/', [PageController::class, 'index']);

Route::get('/hello', [WelcomeController::class,'hello']);

Route::get('/world', function () {
    return 'World';
});

Route::get('/about', [PageController::class, 'about']);

Route::get('/user/{name?}', function ($name='Zid') {
return 'My name is '.$name;
});

Route::get('/posts/{post}/comments/{comment}', function ($postId, $commentId) {
    return 'Post to '.$postId.' Comments to: '.$commentId;
});

Route::get('/articles/{id}', [PageController::class, 'articles']);

Route::get('/greeting', [WelcomeController::class, 'greeting']);