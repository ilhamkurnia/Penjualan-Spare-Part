<%-- 
    Document   : input_user
    Created on : Apr 19, 2019, 12:15:32 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Penjualan SparePart</title>
    </head>
    <body>
        <center><h1>Tambah</h1></center>
        <form action="UserController?data=user&proses=input-user" method="post">
            <table style="margin:20px auto;">
 <tr>
                    <td>Kodebarang</td>
                    <td><input type="text" name="Kodebarang"></td>
 </tr>
 <tr>
                    <td>Namabarang</td>
                    <td><input type="text" name="Namabarang"></td>
 </tr>
 <tr>
                    <td>Hargajual</td>
                    <td><input type="text" name="Hargabeli"></td>
 </tr>
 <tr>
                    <td>Hargabeli</td>
                    <td><input type="text" name="Namabarang"></td>
 </tr>
 <tr>
                    <td>Satuan</td>
                    <td><input type="text" name="Satuan"></td>
 </tr>
 <tr>
                    <td>Kategori</td>
                    <td><input type="text" name="Kategori"></td>
 </tr>
 <tr>
                    <td></td>
                    <td><input type="submit" value="tambah"></td>
 </tr>
            </table>
 </form> 
    
    </body>
</html>