<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<title>Productos</title>
</head>
<body>
        <div class="container">
                <h1>Registro de productos</h1>
                <form action="productos/registro_productos" method="post">
                        <table class="table table-bordered">
                                <tr>
                                        <td><label for="nombreProducto">Nombre: </label></td>
                                        <td><input type="text" name="nombreProducto" id="nombreProducto" ></td>
                                        
                                </tr>
                                <tr>
                                        <td><label for="categoria">Categoria: </label></td>
                                        <td><input type="text" name="categoria" id="categoria" ></td>
                                        
                                </tr>
                                <tr>
                                        <td><label for="precio">Precio: </label></td>
                                        <td><input type="number" name="precio" id="precio"></td>
                                        
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