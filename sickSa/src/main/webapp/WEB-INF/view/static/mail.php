<?php
	$to = "service@slicemypage.com"; 
    $from = $_REQUEST['email']; 
    $name = $_REQUEST['name'];
	$subject = $_REQUEST['subject']; 
    $headers = "From: $from"; 
    $subject = "You have a message sent from Approved html template : $subject"; 

    $fields = array(); 
    $fields{"name"} = "name"; 
    $fields{"email"} = "email";
	$fields{"subject"} = "subject";
    $fields{"message"} = "message";

    $body = "Here is what was sent:\n\n"; foreach($fields as $a => $b){   $body .= sprintf("%20s: %s\n",$b,$_REQUEST[$a]); }
	
	
    $send = mail($to, $subject, $body, $headers);
	
?>