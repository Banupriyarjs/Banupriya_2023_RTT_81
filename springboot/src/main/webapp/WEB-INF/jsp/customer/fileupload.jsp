<jsp:include page="../include/header.jsp"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<section>
    <div class="bg-light2 pt-5 pb-5">
        <div class="row">
            <div class="col-12 text-center">
                <h1 class="m-0">File Upload</h1>
            </div>
        </div>
    </div>
</section>
<section class="pt-5 pb-5">
    <div class="container">

        <form method="POST" action="/customer/fileUploadSubmit" enctype="multipart/form-data">
           <input type="hidden" name="id" value="${customer.id}">
             <div class="row justify-content-center"
                      <div class="col-3">First Name : </div>
                        <div class="col-3">${customer.firstName}</div>
                </div>
                    <div class="row justify-content-center"
                          <div class="col-3">Last Name : </div>
                            <div class="col-3">${customer.lastName}</div>
                    </div>
            <div class="row justify-content-center pt-5" align="center">
               <div class="col-3" align="right">Upload File</div>
                 <div class="col-3" >
                 <input type="file" name="file" />
                </div>
            </div>
             <div class="row justify-content-center pt-5">
                    <div class="col-3" align="center">
                   <input type="submit" value="Submit" />
               </div>
            </div>
        </form>
    </div>
</section>

<jsp:include page="../include/footer.jsp"/>