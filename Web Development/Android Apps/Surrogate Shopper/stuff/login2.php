<?php

$username = "s1445435";
$password = "0S3v3n62876760.w@W";
$database = "d1445435";

$conn = mysqli_connect("127.0.0.1", $username, $password, $database);

$Email = filter_input(INPUT_POST, "Email");
$Password = filter_input(INPUT_POST, "Password");

$hashed = hash('sha512',$Password);

$sql = "SELECT * FROM VOLUNTEERS WHERE Email = '$Email' AND Password = '$hashed'";
$result = mysqli_query($conn, $sql);
$data = mysqli_fetch_array($result);

if ($data){
  echo '1';
}
