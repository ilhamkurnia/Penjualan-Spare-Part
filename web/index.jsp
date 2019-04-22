<%-- 
    Document   : index
    Created on : Apr 19, 2019, 11:34:50 AM
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
       <center><h1>Penjualan SparePart </h1></center>
       <center><a class="tambah" href="UserController?proses=input-user">Tambah</a></center>
  <table style="margin:20px auto;" border="1">
 <tr>
            <th>Kodebarang</th>
            <th>Namabarang</th>
            <th>Hargajual</th>
            <th>Hargabeli</th>
            <th>Satuan</th>
            <th>Kategori</th>
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
            <td><%=data.get(x).getKodebarang()%></td>
            <td><%=data.get(x).getNamabarang()%></td>
            <td><%=data.get(x).getHargajual()%></td>
            <td><%=data.get(x).getHargabeli()%></td>
            <td><%=data.get(x).getSatuan()%></td>
            <td><%=data.get(x).getKategori()%></td>
            <td>
                <a href="UserController?proses=edit-user&Kodebarang=<%=data.get(x).getKodebarang()%>">Edit</a>
                <a href="UserController?proses=hapus-user&Kodebarang=<%=data.get(x).getKodebarang()%>">Hapus</a>
            </td>
        </tr>
        <%}%>
    </table>
       <a href="PagePenjualan.jsp">Page Penjualan</a>
    </body>
</html>
