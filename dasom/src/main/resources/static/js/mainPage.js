
//배너 슬라이드
let $slideLists = $('.main-banner-list');
let $slideImgs = $('.main-banner-img');

let slideWidth = 1515;
let currentIdx = 0;
let slideCnt = $slideImgs.length;
let $currentIdxDisplay = $(".main-banner-currentIdx"); // 현재 인덱스를 출력할 요소 선택
let $slideCntDisplay = $(".main-banner-slideCnt"); // 슬라이드 개수를 출력할 요소 선택


$currentIdxDisplay.text(currentIdx + 1);
$slideCntDisplay.text(slideCnt);


// 초기 값 설정 후 출력
function checkCnt(){
    $currentIdxDisplay.text(currentIdx + 1); // 인덱스는 0부터 시작하지만 표시는 1부터
    $slideCntDisplay.text(slideCnt);
}



function checkEnd(){
    if(currentIdx <= 0){
        $('.arrow-prev').css('display','none');
    }else{
        $('.arrow-prev').css('display','block');
    }

    if(currentIdx >= slideCnt-1){
        $('.arrow-next').css('display','none');
    }else{
        $('.arrow-next').css('display','block');
    }
}

//배너 슬라이드 버튼이동
$('.arrow-next').on('click', function() {
    currentIdx++;
    console.log('currentIdx : ' + currentIdx);
    $slideLists.css('left', -(currentIdx * slideWidth));
    $slideLists.css('transition', '0.5s ease');
    checkCnt();
    checkEnd();
});

$('.arrow-prev').on('click', function() {  
     
    currentIdx--;
    console.log('currentIdx : ' + currentIdx);
    $slideLists.css('left', -(currentIdx * slideWidth));
    $slideLists.css('transition', '0.5s ease');
    checkCnt();
    checkEnd();
});

//배너 슬라이드 자동이동
function slideInterval() {
    currentIdx++;
    currentIdx = currentIdx === slideCnt ? 0 : currentIdx;
    $slideLists.css('left', -(currentIdx * slideWidth));
    checkCnt();
    checkEnd();
}
// 3초마다 슬라이드 이동
setInterval(slideInterval, 5000); // 3000ms = 3초


import * as chatBot from './openAi.js';

//챗봇 기능
$(document).ready(function () {
    $('#chatbot-open').click(function () {
        $('#chatbot').show();
        $('#chatbot-open').hide();
    });

    $('#chatbot-close').click(function () {
        $('#chatbot').hide();
        $('#chatbot-open').show();
    });
});

// 보내기 버튼 클릭 이벤트
$('#chatbot-send').on('click', function () {
    // console.log('aaa');
    let message = $('#chatbot-input').val();
    addUserMessage(message);
    $('#chatbot-input').val('');
    chatBot.sendMessage(message, addBotMessage); // 챗봇 비동기 통신
});

// input칸 엔터 이벤트
$('#chatbot-input').on('keypress', function (e) {
    // console.log('bbb');
    // console.log(e.code);

    if (e.code == 'Enter') {
        let message = $(this).val();
        addUserMessage(message);
        $(this).val('');
        chatBot.sendMessage(message, addBotMessage); // 챗봇 비동기 통신
    }
});

// 유저 메세지 추가
function addUserMessage(message) {
    let htmlCode = `<div class="user-message message">
          <div class="message-text">${message}</div>
        </div>`;

    $('.chatbot-body').append(htmlCode);
    $('.chatbot-body')[0].scrollTop = $('.chatbot-body')[0].scrollHeight;// 스크롤 하단으로 이동
}
// 챗봇 메세지 추가
function addBotMessage(message) {
    let htmlCode = `<div class="bot-message message">
          <div class="message-text">${message}</div>
        </div>`;

    $('.chatbot-body').append(htmlCode);
    $('.chatbot-body')[0].scrollTop = $('.chatbot-body')[0].scrollHeight;// 스크롤 하단으로 이동
}