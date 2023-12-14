
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../include/header.jsp"/>
<section>
    <div class="bg-light2 pt-5 pb-5">
        <div class="row">
            <div class="col-12 text-center">
                <h1 class="m-0">Search Customer</h1>
            </div>
        </div>
    </div>
</section>
<section>
<section class="pt-5 pb-5">
  <div class="container align="center>


    <form action="/customer/searchbyname">
      <label for="First Name">First Name</label>
         <input type="text" name="firstname" placeholder="Search by first Name" value="${firstname}">
          <label for="Last Name" class="pt-5 pb-5">Last Name</label>
                  <input type="text" name="lastname" placeholder="Search by last Name" value="${lastname}">
          <input class="btn btn-primary" type="submit" value="Submit">
    </form>

        <c:if test="${not empty customersByName}">
            <h1>Customers Found ${customersByName.size()}</h1>

            <table class="table" border="1">
                <tr>
                    <td>Id</td>
                    <td>First Name</td>
                    <td>Last Name</td>
                    <td>Phone</td>
                    <td >City</td>
                     <td >Image</td>
                      <td >Edit</td>
                      <td>Customer Detail</td>
                        <td>Detail</td>
                         <td>Upload</td>

                </tr>
                <c:forEach items="${customersByName}" var="customer">
                    <tr>
                        <td>${customer.id}</td>
                        <td>${customer.firstName}</td>
                        <td>${customer.lastName}</td>
                        <td>${customer.phone}</td>
                        <td>${customer.city}</td>
                   <td><img src="${customer.imageUrl}" style="max-width:100px"></td>

                        <!-- Path Variable -->
                           <td><a href="/customer/edit/${customer.id}">Edit</a></td>
                      <td><a href="/customer/customerdetail/${customer.id}">Customer Detail</a></td>
                         <!-- Request Params -->
                      <td><a href="/customer/detail?id=${customer.id}">Detail</a></td>
                      <td><a href="/customer/fileupload?id=${customer.id}">Upload</a></td>

                     </tr>
                </c:forEach>
            </table>

     </c:if>
    </div>
</section>

<jsp:include page="../include/footer.jsp"/>