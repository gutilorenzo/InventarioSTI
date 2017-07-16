<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ingreso de Productos</title>
</head>
<body>
<div align="center">
	<form action="cIngreso"method="post">
		<table>
			<tr><th colspan="2">Registrar Ingreso de Productos</th></tr>
			<tr>
				<td align="right">Producto</td>
				<td><select name="Productos">
					<option value="">------Seleccione------</option>
					<option value="Hp Probook 640 G2">Hp Probook 640 G2</option>
					<option value="Hp Probook 820 G3">Hp Probook 820 G3</option>
					<option value="Hp Probook 840 G3">Hp Probook 840 G3</option>
				</select></td>
			</tr>
			<tr>
				<td align="right">Cantidad</td>
				<td><input type="text"name="Cantidad"></td>
			</tr>
			<tr>
				<td align="right">Proveedor</td>
				<td><input type="text"name="Proveedor"></td>
			</tr>
			<tr>
				<td align="right">Fecha</td>
				<td><input type="text"name="Fecha"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"name="guardar" value="Ingresar"/></td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>