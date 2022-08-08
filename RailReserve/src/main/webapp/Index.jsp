<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Railway Reservation</title>
</head>
<body>
	<h1>Ticket Booking</h1>

	<form>
		<table>
			<tr>
				<th>Source Station :</th>
				<th><select name="Source">
						<option value="1">Chennai</option>
						<option value="2">Madurai</option>
						<option value="3">Thirunelveli</option>
						<option value="4">Kanyakumari</option>
						<option value="5">Theni</option>
				</select></th>
			</tr>
			<tr>
				<th>Destination Station :</th>
				<th><select name="Destination">
						<option value="1">Kanyakumari</option>
						<option value="2">Madurai</option>
						<option value="3">Thirunelveli</option>
						<option value="4">Chennai</option>
						<option value="5">Theni</option>
				</select></th>
			</tr>
			<tr>
				<th>Journey Date :</th>
				<th><input type="date" name="Start " value=""></th>
			</tr>
			<tr>
				<th>Train Type :</th>
				<th><select name="Type">
						<option value="1">A/C</option>
						<option value="2">First Class</option>
						<option value="3">Second Class</option>
						<option value="4">Third Class</option>

				</select></th>
			</tr>

			<tr>
				<th><input type="button" value="Submit"></th>
			</tr>
		</table>
	</form>
</body>
</html>