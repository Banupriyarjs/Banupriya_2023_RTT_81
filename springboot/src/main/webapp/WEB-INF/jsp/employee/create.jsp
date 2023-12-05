
<jsp:include page="../include/header.jsp"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<section>
    <div class="bg-light2 pt-5 pb-5">
        <div class="row">
            <div class="col-12 text-center">
                <h1 class="m-0">Create Employee</h1>
            </div>
        </div>
    </div>
</section>
<section class="pt-5 pb-5">
    <div class="container">
        <c:if test="${not empty success}">
            <div class="row justify-content-center">
                <div class="col-6 text-center">
                    <div class="alert alert-success" role="alert">
                            ${success}
                    </div>
                </div>
            </div>
        </c:if>
</section>
<section class="pt-5 pb-5">
    <div class="container">
        <form method="get" action="/employee/createSubmit">
         <input type="hidden" name="id" value="${form.id}">
            <div class="mt-3">
                <label for="firstName" class="form-label">First Name</label>
                <input type="text" class="form-control" name="firstName" id="firstName" value="${form.firstName}" >

            </div>
            <c:if test="${errors.hasFieldErrors('firstName')}">
                                        <div style="color:red">
                                            <c:forEach items="${errors.getFieldErrors('firstName')}" var="error">
                                                ${error.defaultMessage}<br>
                                            </c:forEach>
                                        </div>
                                    </c:if>
            <div class="mt-3">
               <label for="lastName" class="form-label">Last Name</label>
               <input type="text" class="form-control" id="lastName" name="lastName" value="${form.lastName}" >
              </div>
              <c:if test="${errors.hasFieldErrors('firstName')}">
                       <div style="color:red">
                          <c:forEach items="${errors.getFieldErrors('firstName')}" var="error">
                          ${error.defaultMessage}<br>
                           </c:forEach>
                                          </div>
                          </c:if>
               <div class="mt-3">
                            <label for="departmentName" class="form-label">Department Name</label>
                            <input type="text" class="form-control" id="departmentName" name="departmentName" value="${form.departmentName}" >
                </div>
                <c:if test="${errors.hasFieldErrors('departmentName')}">
                                            <div style="color:red">
                                                <c:forEach items="${errors.getFieldErrors('departmentName')}" var="error">
                                                    ${error.defaultMessage}<br>
                                                </c:forEach>
                                            </div>
                                        </c:if>
            <div align="center">
            <button type="submit" class="btn btn-primary">Submit</button>
            </div>
        </form>
    </div>
</section>
<jsp:include page="../include/footer.jsp"/>









