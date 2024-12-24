// [문제 1]
const movieNames = ["히든페이스", "위키드", "글래디에이터2", "청설"];
let movieRating = [8, 4, 7, 6];

const printRating = (rating) => {
  let result = "";
  for (let i = 0; i < rating; i++) {
    result += "★";
  }
  for (let i = 0; i < 10 - rating; i++) {
    result += "☆";
  }
  return result;
};

const movieName1 = document.querySelector(".movieName1");
const movieName2 = document.querySelector(".movieName2");
const movieName3 = document.querySelector(".movieName3");
const movieName4 = document.querySelector(".movieName4");
const movieRating1 = document.querySelector(".movieRating1");
const movieRating2 = document.querySelector(".movieRating2");
const movieRating3 = document.querySelector(".movieRating3");
const movieRating4 = document.querySelector(".movieRating4");

movieName1.innerHTML = movieNames[0];
movieName2.innerHTML = movieNames[1];
movieName3.innerHTML = movieNames[2];
movieName4.innerHTML = movieNames[3];
movieRating1.innerHTML = printRating(movieRating[0]);
movieRating2.innerHTML = printRating(movieRating[1]);
movieRating3.innerHTML = printRating(movieRating[2]);
movieRating4.innerHTML = printRating(movieRating[3]);

// [문제 2]
let seats = [false, true, true, true, true, false];

let count = 0;
const setSeat = (seat) => {
  if (seats[count]) {
    seat.innerHTML = "예약석";
    seat.style = "color:red";
  } else {
    seat.innerHTML = "빈좌석";
    seat.style = "color:blue";
  }
  count++;
};

const seat1 = document.querySelector(".seat1");
const seat2 = document.querySelector(".seat2");
const seat3 = document.querySelector(".seat3");
const seat4 = document.querySelector(".seat4");
const seat5 = document.querySelector(".seat5");
const seat6 = document.querySelector(".seat6");

setSeat(seat1);
setSeat(seat2);
setSeat(seat3);
setSeat(seat4);
setSeat(seat5);
setSeat(seat6);

// [문제 3]
let nameArray = ["유재석", "강호동", "신동엽"];
let scores = [92, 86, 72];

const printScore = (score) => {
  let result = "";
  for (let i = 0; i < score; i++) {
    result += "●";
  }
  for (let i = 0; i < 100 - score; i++) {
    result += "○";
  }
  return result;
};

const student1 = document.querySelector(".student1");
const student2 = document.querySelector(".student2");
const student3 = document.querySelector(".student3");
const score1 = document.querySelector(".score1");
const score2 = document.querySelector(".score2");
const score3 = document.querySelector(".score3");

student1.innerHTML = nameArray[0];
student2.innerHTML = nameArray[1];
student3.innerHTML = nameArray[2];
score1.innerHTML = printScore(scores[0]);
score2.innerHTML = printScore(scores[1]);
score3.innerHTML = printScore(scores[2]);

/*
// [문제4]
- 조건1 : 배열내 중복 값 은 없어야 한다.
- 조건2 : 1 부터 45 사이의 값만 입력받는다. 
- 조건3 : 총 6개의 번호만 입력받는다.
- 입력조건 : prompt()함수 출력 
- 출력조건 : 특정 div에 입력받은 로또 번호 6개를 출력하기.
*/

lotto = document.querySelector(".lotto");
let lottoArray = [];

for (let i = 0; i < 6; i++) {
  const num = prompt("1~45 번호 입력");
  if (num > 45 || num < 1) {
    alert("경고: 1~45 사이 값만 입력");
    break;
  }
  if (lottoArray.includes(num)) {
    alert("경고: 이미 등록한 번호");
    break;
  }
  lottoArray.push(num);
}
lotto.innerHTML = lottoArray;
