<?php
if(isset($_POST['input-29']) != ""){
			$to = "diego.morandg@gmail.com";
			$from =  $_POST["input-30"];
			$message = "&nbsp;&nbsp;&nbsp;&nbsp;<strong>Nombre: </strong>".$_POST["input-29"]."<br />";
			$message .= "&nbsp;&nbsp;&nbsp;&nbsp;<strong>Email: </strong>".$_POST["input-30"]."<br />";
			$message .= "&nbsp;&nbsp;&nbsp;&nbsp;<strong>Telefono: </strong>".$_POST["input-31"]."<br />";
			$message .= "&nbsp;&nbsp;&nbsp;&nbsp; <strong>Fecha solicitada: </strong>".$_POST["datepicker"]."<br />";
			$message .= "&nbsp;&nbsp;&nbsp;&nbsp; <strong>Comentarios: </strong>".$_POST["textarea"]."<br />";
			$subject = 'Book Appointment';		
			$headers = "From: ".$_POST["input-30"]."\n";
			$headers .= "MIME-Version: 1.0" . "\r\n";
			$headers .= "Content-type:text/html;charset=iso-8859-1" . "\r\n";
			
			$send =	mail($to,$subject,$message,$headers);
	
	
	
	if($send)
	{
		echo "success";
	}
	else
	{
		echo "error";
		echo $send;
	}
}

if(isset($_POST['contact_name']) != ""){
			$to = "diego.morandg@gmail.com";
			$from =  $_POST["contact_email"];
			$message = "&nbsp;&nbsp;&nbsp;&nbsp;<strong>Nombre: </strong>".$_POST["contact_name"]."<br />";
			$message .= "&nbsp;&nbsp;&nbsp;&nbsp;<strong>Email: </strong>".$_POST["contact_email"]."<br />";
			$message .= "&nbsp;&nbsp;&nbsp;&nbsp;<strong>Asunto: </strong>".$_POST["contact_subject"]."<br />";
			$message .= "&nbsp;&nbsp;&nbsp;&nbsp; <strong>Mensaje: </strong>".$_POST["message"]."<br />";
			$subject = 'Contact Enquiry';		
			$headers = "From: ".$_POST["contact_email"]."\n";
			$headers .= "MIME-Version: 1.0" . "\r\n";
			$headers .= "Content-type:text/html;charset=iso-8859-1" . "\r\n";
			
			$send =	mail($to,$subject,$message,$headers);
	
	
	
	if($send)
	{
		echo "success";
	}
	else
	{
		echo "error";
		echo $send;

	}
}


if(isset($_POST['subscribe_name']) != ""){
			$to = "diego.morandg@gmail.com";
			$from =  $_POST["subscribe_email"];
			$message = "&nbsp;&nbsp;&nbsp;&nbsp;<strong>Nombre: </strong>".$_POST["subscribe_name"]."<br />";
			$message .= "&nbsp;&nbsp;&nbsp;&nbsp;<strong>Email: </strong>".$_POST["subscribe_email"]."<br />";
			$subject = 'Newsletter subscription';		
			$headers = "From: ".$_POST["subscribe_email"]."\n";
			$headers .= "MIME-Version: 1.0" . "\r\n";
			$headers .= "Content-type:text/html;charset=iso-8859-1" . "\r\n";
			
			$send =	mail($to,$subject,$message,$headers);
	
	
	
	if($send)
	{
		echo "success";
	}
	else
	{
		echo "error";
		echo $send;
		
	}
}


?>