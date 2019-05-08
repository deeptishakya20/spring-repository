<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE <!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Page Title</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <style>
        h1 {
            background: lightblue;

            text-align: center;

        }
        </style>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
  <script src="main.js"></script>
</head>

<body>
        <h1>Search Account Details</h1>
        <div class="p-3 mb-2 bg-info text-white">

        <table class="table">
                <thead class="thead-dark">
                  <tr>
                    <th scope="col">BankAccount Number</th>
                    <th scope="col">BankAccount Holder Name</th>
                    <th scope="col">BankAccount Type</th>
                    <th scope="col">BankAccount Balance</th>
                  </tr>
                </thead>
                <tbody>
                
                <tr>
                <!-- these properties internally call its getter method -->
                <td>${account.accountId}</td>
                <td>${account.accountHolderName}</td>
                <td>${account.accountType}</td>
                <td>${account.accountBalance}</td>
                </tr>
                
                
                </tbody>
              </table>
              </div>

              
            


    </body>
    </html>
