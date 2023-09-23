// 페이지 로딩 시
$(document).ready(function() {
    var urlParams = new URLSearchParams(window.location.search);
    var keywordParam = urlParams.get('keyword');
    if (keywordParam) {
        $('.search-bar').val(decodeURIComponent(keywordParam)); // 검색어 입력란에 검색어 설정
    }
});

//  후원 글 삭제(비동기)
function deleteDonation(donateWriteNumber) {

    let confirmDelete = confirm(donateWriteNumber+"번 후원모집글을 삭제하시겠습니까?");

    if (confirmDelete) {
        console.log("번호 : " + donateWriteNumber);
        $.ajax({
            url: "/donateWrite/remove",
            type: "GET",
            data: {donateWriteNumber: donateWriteNumber},
            success: function (response) {
                if (response === "삭제 성공!") {
                    alert("후원글 삭제 완료!");
                    location.reload();
                } else {
                    alert("후원글 삭제 실패!");
                }
            },
            error: function () {
                alert("오류!");
            }
        });
    }else {
        alert("삭제를 취소하셨습니다");
    }
};

//  후원 글 모집완료(비동기)
function recruitDonation(donateWriteNumber) {
    let confirmRecruit = confirm(donateWriteNumber+"번 후원모집을 완료하시겠습니까?");
    if (confirmRecruit) {
        console.log("번호 : " + donateWriteNumber);
        $.ajax({
            url: "/donateWrite/recruit",
            type: "GET",
            data: {donateWriteNumber: donateWriteNumber},
            success: function (response) {
                // Handle the success response here
                if (response === "모집완료 성공!") {
                    alert("후원 모집 완료!");
                    location.reload();
                } else {
                    alert("후원 모집완료 실패!");
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