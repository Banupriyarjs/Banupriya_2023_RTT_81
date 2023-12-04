
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp"/>
<section>
    <div class="bg-light2 pt-5 pb-5">
        <div class="row">
            <div class="col-12 text-center">
                <h1 class="m-0">Search Employee</h1>
            </div>
        </div>
    </div>
</section>
<section>
<section class="pt-5 pb-5">

  <div class="container pt-5" align="center">

     <form action="/employee/search">
      <label for="First Name">First Name</label>
         <input type="text" name="firstname" placeholder="Search by first Name" value="${firstname}">
          <label for="Last Name">Last Name</label>
                  <input type="text" name="lastname" placeholder="Search by last Name" value="${lastname}">
          <input class="btn btn-primary" type="submit" value="Submit">
    </form>

        <c:if test="${not empty employeesByName}">
            <h1 color="blue">Employees Found ${employeesByName.size()}</h1>

            <table class="table" border="1">
                <tr >
                    <td>Id</td>
                    <td>First Name</td>
                    <td>Last Name</td>
                    <td colspan="2">Department</td>

                </tr>
                <c:forEach items="${employeesByName}" var="employee">
                    <tr>
                        <td>${employee.id}</td>
                        <td>${employee.firstName}</td>
                        <td>${employee.lastName}</td>
                        <td>${employee.department}</td>
                        <td><a href="/employee/edit/${employee.id}">Edit</a></td>
                    </tr>
                </c:forEach>
            </table>

     </c:if>
    </div>
</section>

<jsp:include page="../include/footer.jsp"/>