<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%> <%@ taglib prefix="form"
uri="http://www.springframework.org/tags/form"%>

<html>
<body>
<h1>Hello</h1>
     <form:form action="results" method="post" modelAttribute="roombooking" >
	   <table>
		   <tr>
		       <td>Days</td>
		       <td><form:input type="number" path="days" ></form:input></td>
	      </tr>
	       <tr>
	           <td>Cost</td>
		       <td><form:input type="number" path="cost"></form:input>></td>
	      </tr>
	            
	       <tr>
	             <td>name</td>
		       <td><form:input type="text" path="name" />
		       <form:errors path="name"></form:errors></td>
	      </tr>
	      <tr>
	         <td><input type="submit"></td>
	      </tr>
	   </table>
   </form:form>
</body>
</html>