
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp"/>
<section>

  <div class="container pt-5">

    <h1 class="pb-3"> Customer Search</h1>
    <form action="/customer/searchbyname">
      <label for="First Name">First Name</label>
         <input type="text" name="firstname" placeholder="Search by first Name" value="${firstname}">
          <label for="Last Name">Last Name</label>
                  <input type="text" name="lastname" placeholder="Search by last Name" value="${lastname}">
          <input class="btn btn-primary" type="submit" value="Submit">
    </form>

        <c:if test="${not empty customersByName}">
            <h1>Customers Found ${customersByName.size()}</h1>

            <table class="table">
                <tr>
                    <td>Id</td>
                    <td>First Name</td>
                    <td>Last Name</td>
                    <td>Phone</td>
                    <td>City</td>
                </tr>
                <c:forEach items="${customersByName}" var="customer">
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
    </div>
</section>

<jsp:include page="../include/footer.jsp"/>