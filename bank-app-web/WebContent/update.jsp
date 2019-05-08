<%@ page isELIgnored="false" %>

<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action = "update_details.do" method ="post">
                    <label  >Account Number</label>
                    <input type="text"  name="accountNumber" value="${account.accountId}" readonly>
                       <label >Account Holder Name</label>
                    <input type="text"  name="accountHolderName" value="${account.accountHolderName }" required>
                       <label  name="accountHolderName">Account Type</label>
                       <select name="accountType" value="${account.accountType }" required>
                       <option>select</option>
                       <option>current</option>
                       <option>saving</option>
                       
                       
                   </select>
                   <label  >Account Balance</label>
                    <input type="text"  name="accountBalance" value="${account.accountBalance}" readonly>
	<input type="submit" value="update">
	</form>
	
</body>
</html>