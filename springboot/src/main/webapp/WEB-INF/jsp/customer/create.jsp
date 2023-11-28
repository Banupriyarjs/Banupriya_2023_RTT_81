<jsp:include page="../include/header.jsp"/>

<h1>Create Customer</h1>


<section>
    <div class="container">
        <form method="get" action="/customer/createSubmit">
            <div class="mb-3">
                <label for="firstName" class="form-label">First Name</label>
                <input type="text" class="form-control" name="firstName" id="firstName" aria-describedby="firstNameHelp">
                <div id="firstNameHelp" class="form-text">Please let us know your first name.</div>
            </div>
            <div class="mb-3">
               <label for="lastName" class="form-label">Last Name</label>
               <input type="text" class="form-control" id="lastName" name="lastName">
              </div>
               <div class="mb-3">
                            <label for="phone" class="form-label">Phone</label>
                            <input type="text" class="form-control" id="phone" name="phone" >
                </div>
                <div class="mb-3">
                    <label for="city" class="form-label">City</label>
                     <input type="text" class="form-control" id="city" name="city" >
                </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</section>

<jsp:include page="../include/footer.jsp"/>











