<?php
$username = "s1445435";
$password = "0S3v3n62876760.w@W";
$database = "d1445435";
$link = mysqli_connect("127.0.0.1", $username, $password, $database);

$page = $_GET['page'];
$start = 0;
$limit = 2;

//require_once('vol.php');
$total = mysqli_num_rows(mysqli_query($link, "SELECT CLIENTS.Email FROM CLIENTS, REQUESTED WHERE REQUESTED.TAKEN = 'No' AND CLIENTS.Email = REQUESTED.EMAIL_ADDRESS"));
$page_limit = $total/$limit;

if($page<=$page_limit){
	$start = ($page - 1)*$limit;
	$sql = "SELECT * FROM CLIENTS, REQUESTED WHERE REQUESTED.TAKEN = 'No' AND CLIENTS.Email = REQUESTED.EMAIL_ADDRESS limit $start, $limit";
	$result = mysqli_query($link,$sql);
	$res = array();

	while($row = mysqli_fetch_array($result)){
		array_push($res, array(
			"name"=>$row['Name'],
			"email"=>$row['Email'])
			);
	}
	echo json_encode($res);

}
else if($page>= floor($page_limit) and $page<=ceil($page_limit)){
	$start = $total - 1;
	$sql = "SELECT * FROM CLIENTS, REQUESTED WHERE REQUESTED.TAKEN = 'No' AND CLIENTS.Email = REQUESTED.EMAIL_ADDRESS LIMIT $start,$start";
	$result = mysqli_query($link,$sql);
	$res = array();

	while($row = mysqli_fetch_array($result)){
		array_push($res,array(
			"name"=>$row['Name'],
			"email"=>$row['Email'])
			);
	}
	echo json_encode($res);

}
else{
	echo 'over';
}

?>
