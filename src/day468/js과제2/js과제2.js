// [지문1] 3개의 점수를 각 입력받아 총점 계산 하여 총점이 90 이상이면 '성공' 아니면 '실패' 를 console.log() 함수로 출력하시오.
const score1_1 = Number(prompt("1. 점수 입력1"));
const score1_2 = Number(prompt("1. 점수 입력2"));
const score1_3 = Number(prompt("1. 점수 입력3"));
console.log(`1. ${score1_1 + score1_2 + score1_3 >= 90 ? "성공" : "실패"}`);

// [지문2] 2개의 정수를 각 입력받아 더 큰수 를 console.log() 함수로 출력하시오.(단] 동일한수 제외)
const num2_1 = Number(prompt("2. 정수 입력1"));
const num2_2 = Number(prompt("2. 정수 입력2"));
console.log(`2. ${num2_1 > num2_2 ? num2_1 : num2_2}`);

// [지문3] 3개의 정수를 각 입력받아 가장 큰수 를 console.log() 함수로 출력하시오.  (단] 동일한수 제외)
let num3_1 = Number(prompt("3. 정수 입력1"));
let num3_2 = Number(prompt("3. 정수 입력2"));
let num3_3 = Number(prompt("3. 정수 입력3"));
// 내림차순
// 1, 2 비교
if (num3_1 < num3_2) {
  let temp;
  temp = num3_1;
  num3_1 = num3_2;
  num3_2 = temp;
}
// 2, 3 비교
if (num3_2 < num3_3) {
  let temp;
  temp = num3_2;
  num3_2 = num3_3;
  num3_3 = temp;
}
// 1, 2 비교
if (num3_1 < num3_2) {
  let temp;
  temp = num3_1;
  num3_1 = num3_2;
  num3_2 = temp;
}
console.log(num3_1);

// [지문4] 3개의 정수를 각 입력받아 오름차순 또는 내림차순 하여 정렬해서 console.log() 함수로 출력하시오.  (단] 동일한수 제외)
let num4_1 = Number(prompt("4. 정수 입력1"));
let num4_2 = Number(prompt("4. 정수 입력2"));
let num4_3 = Number(prompt("4. 정수 입력3"));
// 내림차순
// 1, 2 비교
if (num4_1 < num4_2) {
  let temp;
  temp = num4_1;
  num4_1 = num4_2;
  num4_2 = temp;
}
// 2, 3 비교
if (num4_2 < num4_3) {
  let temp;
  temp = num4_2;
  num4_2 = num4_3;
  num4_3 = temp;
}
// 1, 2 비교
if (num4_1 < num4_2) {
  let temp;
  temp = num4_1;
  num4_1 = num4_2;
  num4_2 = temp;
}
console.log(`4. 내림차순: ${num4_1},${num4_2},${num4_3}`);

// [지문5] 1개의 점수를 입력받아 90점 이상이면 'A등급' 80점이상이면 'B등급' 70점이상 'C등급' 그외 '재시험' 를 console.log() 함수로 출력하시오.
const score5 = Number(prompt("5. 점수 입력"));
if (score5 >= 90) {
  console.log("5. A등급");
} else if (score5 >= 80) {
  console.log("5. B등급");
} else if (score5 >= 70) {
  console.log("5. C등급");
} else {
  console.log("5. 재시험");
}

// [지문6] 아이디와 비밀번호 입력받아 아이디가 'admin' 이고 비밀번호가 '1234' 이면 '로그인 성공' 아니면 '로그인실패' 를 console.log() 함수로 출력하시오.
const id6 = prompt("6. 아이디 입력");
const password = prompt("6. 비밀번호 입력");
console.log(
  `6. ${id6 == "admin" && password == "1234" ? "로그인 성공" : "로그인 실패"}`
);

// [지문7] 아래와 같이 과일 배열 선언하고 새로운 과일명을 입력받아 fruitList 에 존재하는 과일이면
// '이미 존재하는 과일입니다' 출력  아니면 배열에 입력받은 과일명 저장 하고 현재 배열을 console.log() 함수로 출력하시오.
let fruitList = ["바나나", "사과"];
const fruit = prompt("7. 과일 입력");
if (fruitList.includes(fruit)) {
  console.log("7. 이미 존재하는 과일입니다");
} else {
  fruitList.push(fruit);
  console.log(`7. ${fruitList}`);
}

// [지문8] 주민등록번호를 입력받아서 성별이 남자이면 색상변수에 'blue' 을 여자이면 'red' 을 대입 하고 색상변수 를 console.log() 함수로 출력하시오.
const id8 = prompt("8. 주민등록번호 입력");
let color;
if (id8[6] == "1" || id8[6] == "3") {
  color = "blue";
} else {
  color = "red";
}
console.log(`8. ${color}`);

// [지문9] 가위바위보 게임
const rsp1 = Number(prompt("9-1. 가위:0, 바위:1, 보2"));
const rsp2 = Number(prompt("9-2. 가위:0, 바위:1, 보2"));
if (rsp1 == 0 && rsp2 == 2) {
  console.log("9. 플레이어1 승리");
} else if (rsp1 == 2 && rsp2 == 0) {
  console.log("9. 플레이어2 승리");
} else if (rsp1 > rsp2) {
  console.log("9. 플레이어1 승리");
} else if (rsp1 < rsp2) {
  console.log("9. 플레이어2 승리");
} else {
  console.log("9. 무승부");
}

// [지문10] 아래와 같이 좌석 3개의 상태를 가지는 배열 선언하고 하나의 좌석 순서번호(인덱스) 를 입력받아
// 빈좌석 이면 '예약성공' 아니면 '예약불가' 출력하시오. 예약상태 구분 방법] 빈좌석 : 'X'  사용중인좌석 : 'O'
let sheetList = ["O", "X", "O"];
const index10 = Number(prompt("10. 좌석 번호 입력"));
console.log(`10. ${sheetList[index10 - 1] == "O" ? "예약 성공" : "예약불가"}`);

// [지문11]주차장 차량 검색대
let carArray = ["250어7142", "142가7415"];
let locationArray = ["A1", "B3"];
const carNum = Number(prompt("11. 차량 번호 입력"));
if (carArray.includes(carNum)) {
  const index11 = carArray.indexOf(carNum);
  console.log(`11. 주차위치: ${locationArray[index11]}`);
} else {
  console.log("11. 존재하지 않는 차량입니다");
}
