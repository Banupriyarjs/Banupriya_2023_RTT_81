
<jsp:include page="../include/header.jsp"/>
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
        <form method="get" action="/employee/createSubmit">
         <input type="hidden" name="id" value="${form.id}">
            <div class="mb-3">
                <label for="firstName" class="form-label">First Name</label>
                <input type="text" class="form-control" name="firstName" id="firstName" value="${form.firstName}" >

            </div>
            <div class="mb-3">
               <label for="lastName" class="form-label">Last Name</label>
               <input type="text" class="form-control" id="lastName" name="lastName" value="${form.lastName}" >
              </div>
               <div class="mb-3">
                            <label for="departmentName" class="form-label">Department Name</label>
                            <input type="text" class="form-control" id="departmentName" name="departmentName" value="${form.departmentName}" >
                </div>
            <div align="center">
            <button type="submit" class="btn btn-primary">Submit</button>
            </div>
        </form>
    </div>
</section>
<jsp:include page="../include/footer.jsp"/>









