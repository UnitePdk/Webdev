fetch("https://jsonplaceholder.typicode.com/posts")
  .then((response) => response.json()) // 요청 결과를 JSON 형식으로 변환
  .then((data) => console.log(data)) // 요청 결과 후 실행할 코드 작성
  .catch((error) => {
    console.log(error);
  });

// 3
const board = { title: "새로운제목", body: "새로운내용", userId: 1 };
const option1 = {
  method: "POST",
  headers: { "Content-Type": "application/json" },
  body: JSON.stringify(board),
};
// fetch 함수의 전송 옵션
// http메소드 선택(GET/POST/PUT/DELETE)
// 보낼 자료의 형식 설정 application/json
// 보낼 자료
fetch("https://jsonplaceholder.typicode.com/posts", option1)
  .then((response) => response.json())
  .then((data) => console.log(data));
