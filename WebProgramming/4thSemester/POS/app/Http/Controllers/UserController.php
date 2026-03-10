<?php

namespace App\Http\Controllers;

use App\Models\UserModel;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Hash;

class UserController extends Controller
{
    public function index()
    {
        $user = UserModel::create(
            [
                'username' => 'manager11',
                'nama' => 'Manager11',
                'password' => Hash::make('12345'),
                'level_id' => 2
            ],
        );
        $user->username = 'manager12';

        $user->save();

        $user->wasChanged();
        $user->wasChanged('username');
        $user->wasChanged(['username', 'level_id']);
        $user->wasChanged('nama');
        dd($user->wasChanged(['nama', 'username']));
        // $user->isDirty(); //t
        // $user->isDirty('username'); //t
        // $user->isDirty('nama'); //f
        // $user->isDirty(['nama', 'username']); //t

        // $user->isDirty(); //f
        // $user->isDirty('username'); //f
        // $user->isDirty('nama'); //t
        // $user->isDirty(['nama', 'username']); //f

        // $user->save();

        // $user->isDirty(); //f
        // $user->isClean(); //t
        // dd($user->isDirty());

        return view('user', ['data' => $user]);
    }
}
