// [지문1] prompt 함수로 국어 , 영어 , 수학 점수를 각 입력받아서 각 변수에 저장하고 총점 과 평균을 계산하여 console탭에 출력하시오.
const kor = Number(prompt("1. 국어 점수 입력"));
const eng = Number(prompt("1. 영어 점수 입력"));
const math = Number(prompt("1. 수학 점수 입력"));
console.log(`1. 총점: ${kor + eng + math}`);
console.log(`1. 평균: ${(kor + eng + math) / 3}`);

// [지문2] prompt 함수로 반지름를 입력받아서 원넓이[반지름*반지름*3.14] 계산하여 console탭에 출력하시오.
const radius = Number(prompt("2. 반지름 입력"));
console.log(`2. 원의 넓이: ${radius * radius * 3.14}`);

// [지문3] prompt 함수로 두 실수를 입력받아서 앞 실수의 값이 뒤실수의 값의 비율% 계산하여 console탭에 출력하시오.
const f1 = Number(prompt("3. 실수 1 입력"));
const f2 = Number(prompt("3. 실수 2 입력"));
console.log(`3. 비율: ${(f1 / f2) * 100}%`);

// [지문4] prompt 함수로 정수를 입력받아 입력받은 값이 홀수이면 true / 짝수이면 false 로 console탭에 출력하시오.
const i1 = Number(prompt("4. 정수 입력"));
console.log(i1 % 2 ? "4. true" : "4. false");

// [지문5] prompt 함수로 정수를 입력받아 입력받은 값이 7의 배수이면 true / 아니면 false 로 console탭에 출력하시오.
const i2 = Number(prompt("5. 정수 입력"));
console.log(i2 % 7 ? "5. false" : "5. true");

// [지문6] prompt 함수로 아이디 와 비밀번호를 입력받아서 아이디가 'admin' 이고 비밀번호가 1234 와 일치하면 true / 아니면 false 를 console탭에 출력하시오.
const id = prompt("6. 아이디 입력");
const password = prompt("비밀번호 입력");
console.log(id == "admin" && password == "1234" ? "6. true" : "6. false");

// [지문7] prompt 함수로 정수를 입력받아 입력받은 값이 홀수 이면서 7배수 이면 true / 아니면 false 로 console탭에 출력하시오.
const i3 = Number(prompt("7. 정수 입력"));
console.log(i3 % 2 && i3 % 7 == 0 ? "7. true" : "7. false");

// [지문8] prompt 함수로 십만원 단위의 금액을 입력받아 입력받은 금액의 지폐수를 console탭에 출력하시오.
const money = Number(prompt("8. 금액 입력"));
const money6 = parseInt(money / 100000);
const money5 = parseInt((money - money6 * 100000) / 10000);
const money4 = parseInt((money - money6 * 100000 - money5 * 10000) / 1000);
console.log(`8. 십만원: ${money6}장`);
console.log(`8. 만원: ${money5}장`);
console.log(`8. 천원: ${money4}장`);

// [지문9] 1차점수 와 2차점수 prompt함수로 각 입력받아서 총점이 150점이상이면 '합격' 아니면 '불합격' 를 console탭에 출력하시오.
const score1 = Number(prompt("9. 1차 점수 입력"));
const score2 = Number(prompt("9. 2차 점수 입력"));
console.log(score1 + score2 >= 150 ? "9. 합격" : "9. 불합격");

// [지문10] 두 사람의 이름을 prompt함수로 각 입력받아서 만일 이름이 '유재석' 이면 뒤에 (방장) 이라고 이름 뒤에 붙이고 아니면 생략 하여  console탭에 출력하시오. ex] 유재석(방장) , 강호동
const name1 = prompt("10. 이름 1 입력");
const name2 = prompt("10. 이름 2 입력");
console.log(`10. ${name1}${name1 == "유재석" ? "(방장)" : ""}`);
console.log(`10. ${name2}${name2 == "유재석" ? "(방장)" : ""}`);
