// 페이지 로딩 시
$(document).ready(function() {
    var urlParams = new URLSearchParams(window.location.search);
    var keywordParam = urlParams.get('keyword');
    if (keywordParam) {
        $('.search-bar').val(decodeURIComponent(keywordParam)); // 검색어 입력란에 검색어 설정
    }
});

// 봉사글 삭제(비동기)
function deleteCs(csWriteNumber) {

    let confirmDelete = confirm(csWriteNumber+"번 봉사모집글을 삭제하시겠습니까?");

    if (confirmDelete) {
        console.log("번호 : " + csWriteNumber);
        $.ajax({
            url: "/csWrite/remove",
            type: "GET",
            data: { csWriteNumber: csWriteNumber },
            success: function(response) {
                if (response === "삭제 성공!") {
                    alert("봉사글 삭제 완료!");
                    location.reload();
                } else {
                    alert("봉사글 삭제 실패!");
                }
            },
            error: function() {
                alert("오류!");
            }
        });
    }else {
        alert("삭제를 취소하셨습니다");
    }
}

//  봉사 모집완료(비동기)
function recruitCs(csWriteNumber) {

    let confirmRecruit = confirm(csWriteNumber+"번 봉사모집을 완료하시겠습니까?");
    if (confirmRecruit) {
        console.log("번호 : " + csWriteNumber);
        $.ajax({
            url: "/csWrite/recruit",
            type: "GET",
            data: {csWriteNumber: csWriteNumber},
            success: function (response) {
                if (response === "모집완료 성공!") {
                    alert("봉사 모집 완료!");
                    location.reload();
                } else {
                    alert("봉사 모집 완료 실패!");
                }
            },
            error: function () {
                alert("오류!");
            }
        });
    }else {
        alert("모집완료를 취소하셨습니다");
    }
};