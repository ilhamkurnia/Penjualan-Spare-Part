<%-- 
    Document   : edit
    Created on : Apr 19, 2019, 12:32:10 PM
    Author     : Administrator
--%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.UserModel"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Latihan Java Web</title>
    </head>
    <body>
        <center><h1>Edit User</h1></center>
        <form action="UserController?data=user&proses=update-user" method="post">
            <table style="margin:20px auto;">
            <%
                String id = request.getParameter("Kodebarang");
                UserModel km = new UserModel();
                km.setKodebarang(id);
                List<UserModel> data = new ArrayList<UserModel>();
                data = km.cariID(); 
                if (data.size() > 0) {
 
            %>
 <tr>
                    <td>Namabarang</td>
                    <td><input type="text" name="nama" value="<%=data.get(0).getNamabarang()%>"></td>
 </tr>
 <tr>
                    <td>Hargajual</td>
                    <td><input type="text" name="alamat" value="<%=data.get(0).getHargajual()%>"></td>
                    
 </tr>
 <tr>
                    <td>Hargabeli</td>
                    <td><input type="text" name="alamat" value="<%=data.get(0).getHargabeli()%>"></td>
                    
 </tr>
 
 <tr>
                    <td>Satuan</td>
                    <td><input type="text" name="nama" value="<%=data.get(0).getSatuan()%>"></td>
                    
 </tr>
                     <td>Kategori</td>
                    <td><input type="text" name="nama" value="<%=data.get(0).getSatuan()%>"></td>
                    <td><input type="hidden" name="id" value="<%=data.get(0).getKodebarang()%>"></td>
 <tr>
                    <td></td>
                    <td><input type="submit" value="Update"></td>
 </tr>
                  <%}%>
            </table>
          
 </form> 
    
    </body>
</html>