/*
    JS과제4 (day48) : 함수 활용.
    - 출력조건 : document.querySelector().innerHTML 
    - 입력조건 : document.querySelector().value
    - 일반조건 : chatGPT 사용금지

    주제 : 미니 웹페이지 가계부
        1. 가계부 정보(항목) : 1. 날짜 2.항목명 3.금액 
        2. 세가지의 정보를 <input> 마크업으로 부터 입력 받아 각각 하나의 배열 저장 하시오.
        3. 등록된 모든 배열 정보들을 출력 하시오.
        3. HTML 출력 예시 
        날짜            항목        금액
        2024-11-26      콜라        1000
        2024-11-27      커피        1200

    - 정답이 필요한 경우 메일/카톡 로 요청하기. 
    - 제출 : itdanja@kakao.com , 12/23(월) 19:00까지
    - 제출파일 : 구현한 JS 파일 및 파일이 위치한 본인 github 상세 주소
*/
const historyList = [];
const list = document.querySelector(".list");

const createHistory = () => {
  const date = document.querySelector(".date");
  const name = document.querySelector(".name");
  const price = document.querySelector(".price");

  const history = [date.value, name.value, price.value];
  historyList.push(history);

  printHistory(history);
};

const printHistory = (arr) => {
  const datePrint = document.createElement("span");
  datePrint.innerHTML = arr[0];
  const namePrint = document.createElement("span");
  namePrint.innerHTML = arr[1];
  const pricePrint = document.createElement("span");
  pricePrint.innerHTML = arr[2];
  list.appendChild(datePrint);
  list.appendChild(namePrint);
  list.appendChild(pricePrint);
};
