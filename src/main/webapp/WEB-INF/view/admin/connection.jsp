<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

    <%@ include file="../layout/header.jsp" %>



        <div style="position :relative; height: 700px;">

            <div class="d-flex" style="position: absolute; left: 2px">

                <div class="container my-3">
                    <div class="list-group">
                        <a href="/admin/statistics/connection" class="list-group-item list-group-item-action  active"  aria-current="true">
                            접속률
                        </a>
                        <a href="/admin/statistics/views" class="list-group-item list-group-item-action">조회수</a>
                        <a href="/admin/statistics/reservation" class="list-group-item list-group-item-action">예약률</a>
                    </div>
                </div>

                <div class="vl">

                </div>

            </div>

            <div class="d-flex justify-content-center">
                <div style="position: relative; top: 50px">




                  
                </div>
            </div>
            
        </div>

            <script>
            function searchGet() {
                let keyword =  $("#keyword").val();
                location.href = "/admin/court?page=0&keyword=" + keyword;
            }
            function callPrev() {
                let requestPage = `${nowPage-2}`;
                let keyword = `${keyword}`
                location.href = "/admin/court?page=" + requestPage+"&keyword="+keyword;
            }

            function callNext() {
                let requestPage = `${nowPage}`;
                let keyword = `${keyword}`
                location.href = "/admin/court?page=" + requestPage+"&keyword="+keyword;
            }

            function courtDelete(courtId) {
                $.ajax({
                    url: '/admin/court/delete',
                    method: 'POST',
                    data: { courtId: courtId },
                    success: function(response) {
                        alert('내 맘에 안드는 코트 삭제!');
                        location.reload();
                    },
                    error: function(error) {
                    // 에러 처리
                    alert('삭제 중 오류가 발생했습니다.');
                    console.log(error);
                    }
                });
            }
        </script>

        <%@ include file="../layout/footer.jsp" %>