<?php
class Database
{
    private static $conn = null;
    public static function getConnection()
    {
        if (self::$conn === null) {

            $host = "localhost";
            $port = "5432";
            $db = "sistem_tugasakhir";
            $user = "postgres";
            $password = "261302";
            $connStr = "host=$host port=$port dbname=$db user=$user password=$password";
            self::$conn = pg_connect($connStr);
            if (!self::$conn) {
                die("Database connection failed.");
            }
        }
        return self::$conn;
    }
}