<%-- 
    Document   : PagePenjualan
    Created on : Apr 19, 2019, 2:23:59 PM
    Author     : Administrator
--%>


<%@page import="Model.UserModel"%>
<%@page import="Model.UserModel"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.UserModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <center><h1>Page Penjualan </h1></center>
       <a href="index.jsp">back</a>
       
  <table style="margin:20px auto;" border="1">
 <tr>
            <th>Tanggal Faktur</th>
            <th>Nomor Faktur</th>
            <th>Nama Konsumen</th>
            <th>Kode Barang</th>
            <th>Jumlah</th>
            <th>Harga Satuan</th>
 </tr>
        <%
            UserModel km = new UserModel();
            List<UserModel> data = new ArrayList<UserModel>();
            String ket = request.getParameter("ket");
            if (ket == null) {
                data = km.tampil();
            } 
            for (int x = 0; x < data.size(); x++) {
        %>
        <tr>
            <td><%=x + 1%></td>
            <td><%=data.get(x).gettanggal()%></td>
            <td><%=data.get(x).getnomor()%></td>
            <td><%=data.get(x).getharga()%></td>
            <td><%=data.get(x).getjumlah()%></td>
            <td><%=data.get(x).getharga()%></td>
            <td>
                
            </td>
        </tr>
        <%}%>
    </table>
    </body>
</html>