<jsp:include page="../include/header.jsp"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<section>
    <div class="bg-light2 pt-5 pb-5">
        <div class="row">
            <div class="col-12 text-center">
                <h1 class="m-0">View Customer</h1>
            </div>
        </div>
    </div>
</section>

<section class="pt-5 pb-5">
    <div class="container">
     <!-- the action attribute on the form tag is the URL that the form will submit to when then user clicks the submit button -->
        <form method="get" action="/customer/edit/${form.id}">
        <input type="hidden" name="id" value="${form.id}">
            <div class="mt-3">
                <label for="firstName" class="form-label">First Name</label>
                <input type="text" class="form-control" name="firstName" id="firstName" value="${form.firstName}"  disabled>
                </div>

            <div class="mt-3">
               <label for="lastName" class="form-label">Last Name</label>
               <input type="text" class="form-control" id="lastName" name="lastName" value="${form.lastName}"  disabled>
              </div>

               <div class="mt-3">
                            <label for="phone" class="form-label">Phone</label>
                            <input type="text" class="form-control" id="phone" name="phone" value="${form.phone}"  disabled>
                </div>

                <div class="mt-3">
                    <label for="city" class="form-label">City</label>
                     <input type="text" class="form-control" id="city" name="city" value="${form.city}"  disabled>
                </div>

                   <div class="mt-3">
                                     <label for="imageUrl" class="form-label">Image URL</label>
                                      <input type="text" class="form-control" id="imageUrl" name="imageUrl" value="${form.imageUrl}" disabled >
                                 </div>

                          </div>

                <div align="center">
            <button type="submit" class="btn btn-primary" >Edit</button>
             </div>
        </form>
    </div>
</section>

<jsp:include page="../include/footer.jsp"/>











