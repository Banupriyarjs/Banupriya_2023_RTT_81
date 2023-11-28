
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp"/>
<section>

<div class="container pt-5">

<h1 class="pb-3"> Customer Search</h1>
<form action="/customer/search">
     <input type="text" name="search" placeholder="Search by name" value="${search}">
       <button type="submit" class="btn-primary">Submit</button>
</form>
<c:if test="${not empty customersVar}">
<h1>Customers Found ${customersVar.size()}</h1>
<table>
<c:if test="${not empty customersVar}">
            <h1>Customers Found ${customersVar.size()}</h1>

            <table>
                <tr>
                    <td>Id</td>
                    <td>First Name</td>
                    <td>Last Name</td>
                    <td>Phone</td>
                    <td>City</td>
                </tr>
                <c:forEach items="${customersVar}" var="customer">
                    <tr>
                        <td>${customer.id}</td>
                        <td>${customer.firstName}</td>
                        <td>${customer.lastName}</td>
                        <td>${customer.phone}</td>
                        <td>${customer.city}</td>
                    </tr>
                </c:forEach>
            </table>

        </c:if>
</table>

</c:if>
</div>
</section>

<jsp:include page="../include/footer.jsp"/>