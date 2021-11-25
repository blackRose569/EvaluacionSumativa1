<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<title>Ventas</title>
</head>
<body>
        <div class="container">
                <h1>Registro de ventas</h1>
                <form action="ventas/registro_ventas" method="post">
                        <table class="table table-bordered">
                                <tr>
                                        <td><label for="nombreVendedor">Nombre vendedor: </label></td>
                                        <td><input type="text" name="nombreVendedor" id="nombreVendedor" ></td>
                                        
                                </tr>
                               
                                <tr>
                                        <td><label for="totalVenta">total venta: </label></td>
                                        <td><input type="number" name="totalVenta" id="totalVenta"></td>
                                        
                                </tr>
                                
								<tr>
                                        <td><span style="color:red;">${mensajeError}</span></td>
                                        <td><input type="reset" value="limpiar" class="btn btn-warning"> <input type="submit" value="enviar" class="btn btn-success"></td>
                                        
                                </tr>
                                
                        </table>
                </form>
                
                
        
        </div>
</body>
</html>