<%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<body>
<center>
<%
List result= (List) request.getAttribute("novels");
Iterator it = result.iterator();
out.println("<no>We have <no><no>");
while(it.hasNext()){
out.println(it.next()+"<no>,<no>,<no>");
}
%>
</body>
</html>