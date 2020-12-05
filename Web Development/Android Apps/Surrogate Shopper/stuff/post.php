
<?php
        $username = "";
        $password = "";
        $database = ""; 

        $conn = mysqli_connect("127.0.0.1", $username, $password, $database);

        $ID =false; $email = false;  $post = false; $location = false;

        if (isset($_POST["ID"]) and isset($_POST["Email"]) and isset($_POST["Post"]) and isset($_POST["Location"])){
         $ID = $_POST["ID"];
         $email = $_POST["Email"];
         $post = $_POST["Post"];
         $location = $_POST["Location"];}

          $sql ="INSERT INTO REQUESTS (USER_ID, EMAIL, ITEMS, LOCATION, UPLOAD_TIME, TAKEN, FINISHED) VALUES ('$ID', '$email', '$post', '$location', current_timestamp, 'No', 'NO')";
          $sql2 = "UPDATE CLIENTS SET CURR_LOCATION = '$location' WHERE Email = '$email' ";
          $result = mysqli_query($conn,$sql);
          $result2 = mysqli_query($conn,$sql2);

          if ($result and $result2){
            echo "Request Uploaded!";
          }
          else{
            echo "Upload Failed!";

          }

        mysqli_close($conn);

?>
